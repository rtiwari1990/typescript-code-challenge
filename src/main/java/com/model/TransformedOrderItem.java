package com.model;

public class TransformedOrderItem {
    private String item;
    private int quantity;
    private double price;
    private double revenue;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "TransformedOrderItem{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", revenue=" + revenue +
                '}';
    }
}
