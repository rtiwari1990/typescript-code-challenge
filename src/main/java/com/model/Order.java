package com.model;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<String, com.model.OrderItem> orderItemMap = new HashMap<String, com.model.OrderItem>();

    public Map<String, com.model.OrderItem> getOrderItemMap() {
        return orderItemMap;
    }

    public void setOrderItemMap(Map<String, com.model.OrderItem> orderItemMap) {
        this.orderItemMap = orderItemMap;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItemMap=" + orderItemMap +
                '}';
    }
}
