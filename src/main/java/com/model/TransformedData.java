package com.model;

import java.util.ArrayList;

public class TransformedData {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<TransformedOrder> orders = new ArrayList<TransformedOrder>();

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<TransformedOrder> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<TransformedOrder> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "TransformedData{" +
                "customers=" + customers +
                ", orders=" + orders +
                '}';
    }
}
