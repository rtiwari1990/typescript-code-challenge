package com.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.log.TypescriptCodeChallengeLogger;
import com.model.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

public class TransformDataServiceImpl implements TransformDataServiceInterface {

    private static TypescriptCodeChallengeLogger log = TypescriptCodeChallengeLogger.getLogger(TransformDataServiceImpl.class.getName());

    @Override
    public Data[] convertJsonToDataObject(String filePath) {
        log.info("convertJsonToDataObject filePath is " + filePath);
        Gson gson = new Gson();

        Data[] dataArray = null;
        try
        {
            Reader reader = Files.newBufferedReader(Paths.get(filePath));
            dataArray = gson.fromJson(reader, Data[].class);
        }
        catch (IOException ex)
        {
            log.error("Exception in converting json to data object " + ex);
        }

        return dataArray;
    }

    @Override
    public void convertDataObjectToJson(Data[] dataArray, String filePath) {
        log.info("Converted dataArray to json dataArray.length is " + dataArray.length + " and filePath is " + filePath);

        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<TransformedOrder> orders = new ArrayList<TransformedOrder>();

        for(Data data : dataArray)
        {
            customers.add(data.getCustomer());
            orders.add(getTransformedOrder(data));
        }

        TransformedData tData = new TransformedData();
        tData.setCustomers(customers);
        tData.setOrders(orders);

        try
        {
            FileWriter writer = new FileWriter(filePath);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(tData, writer);
            writer.flush();
            writer.close();

            log.info("Converted dataArray to json");
        }
        catch(IOException ex)
        {
            log.error("Exception in writing to file "+ex.toString());
        }
    }

    private TransformedOrder getTransformedOrder(Data data)
    {
        log.info("getTransformedOrder data.getId() " + data.getId());
        TransformedOrder tOrder = new TransformedOrder();

        tOrder.setId(data.getId());
        tOrder.setCustomer(data.getCustomer().getId());
        tOrder.setDate(data.getDate());
        tOrder.setVendor(data.getVendor());

        ArrayList<TransformedOrderItem> order = new ArrayList<TransformedOrderItem>();

        for(Map.Entry<String, OrderItem> oiEntry : data.getOrder().entrySet())
        {
            TransformedOrderItem tOI = new TransformedOrderItem();
            tOI.setItem(oiEntry.getKey());
            tOI.setPrice(oiEntry.getValue().getPrice());
            tOI.setQuantity(oiEntry.getValue().getQuantity());
            tOI.setRevenue(tOI.getPrice() * tOI.getQuantity());

            order.add(tOI);
        }

        tOrder.setOrder(order);

        return tOrder;
    }

}
