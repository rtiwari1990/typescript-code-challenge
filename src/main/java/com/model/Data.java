package com.model;

import java.util.HashMap;
import java.util.Map;

public class Data {
    private String id;
    private String vendor;
    private String date;
    private Customer customer;

    private Map<String, OrderItem> order = new HashMap<String, OrderItem>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }



    public Map<String, OrderItem> getOrder() {
        return order;
    }

    public void setOrder(Map<String, OrderItem> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", vendor='" + vendor + '\'' +
                ", date='" + date + '\'' +
                ", customer=" + customer +
                ", order=" + order +
                '}';
    }
}
