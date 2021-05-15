package com.model;

import java.util.ArrayList;

public class TransformedOrder {
    private String id;
    private String vendor;
    private String date;
    private String customer;

    private ArrayList<TransformedOrderItem> order = new ArrayList<TransformedOrderItem>();

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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<TransformedOrderItem> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<TransformedOrderItem> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "TransformedOrder{" +
                "id='" + id + '\'' +
                ", vendor='" + vendor + '\'' +
                ", date='" + date + '\'' +
                ", customer='" + customer + '\'' +
                ", order=" + order +
                '}';
    }
}
