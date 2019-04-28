package com.tsystems.js;

import java.util.Objects;


public class Product {

    private Integer id;

    private String productName;

    private double productPrice;

    private int amount;

    private String imagePath;

    private ProductCategory category;

    private ProductParameteres productParameteres;

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public ProductParameteres getProductParameteres() {
        return productParameteres;
    }

    public void setProductParameteres(ProductParameteres productParameteres) {
        this.productParameteres = productParameteres;
    }

    public Product(String productName, double productPrice, int amount, String imagePath, ProductCategory category, ProductParameteres productParameteres) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.amount = amount;
        this.imagePath = imagePath;
        this.category = category;
        this.productParameteres = productParameteres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return  id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", amount=" + amount +
                ", imagePath='" + imagePath + '\'' +
                ", category=" + category +
                ", productParameteres=" + productParameteres +
                '}';
    }
}