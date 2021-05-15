package com.service;

import com.model.Data;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TransformDataServiceIT {

    @Test
    public void testConvertJsonToDataObject()
    {
        TransformDataServiceImpl dataService = new TransformDataServiceImpl();
        String filePath = "./src/test/data.json";
        Data[] dataArray = dataService.convertJsonToDataObject(filePath);

        assertEquals(2, dataArray.length);
    }

    @Test
    public void testConvertDataObjectToJson()
    {
        TransformDataServiceImpl dataService = new TransformDataServiceImpl();
        String filePath = "./src/test/data.json";
        Data[] dataArray = dataService.convertJsonToDataObject(filePath);

        String tFilePath = "./src/test/transformed-data.json";
        dataService.convertDataObjectToJson(dataArray, tFilePath);

        try{
            String actualValue = new String(Files.readAllBytes(Paths.get(tFilePath)));
            String eFilePath = "./src/test/expected-data.json";
            String expectedValue = new String(Files.readAllBytes(Paths.get(eFilePath)));

            ObjectMapper mapper = new ObjectMapper();

            assertEquals(mapper.readTree(actualValue), mapper.readTree(expectedValue));
        }
        catch(IOException ex){
            fail("Exception in reading file");
        }

    }
}
