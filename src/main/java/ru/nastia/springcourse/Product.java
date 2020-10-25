package ru.nastia.springcourse;

public class Product {
    private String productType;
    private String productName;
    private double price;

    public Product(String productType, String productName, double price) {
        this.productType = productType;
        this.productName = productName;
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
