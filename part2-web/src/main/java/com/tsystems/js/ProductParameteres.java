package com.tsystems.js;

import java.util.Objects;


public class ProductParameteres {

    private Integer id;

    private String colour;

    private String brand;

    private Product product;

    public ProductParameteres(String colour, String brand) {
        this.colour = colour;
        this.brand = brand;
    }

    public ProductParameteres() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductParameteres)) return false;
        ProductParameteres that = (ProductParameteres) o;
        return id.equals(that.id) &&
                colour.equals(that.colour) &&
                brand.equals(that.brand) &&
                product.equals(that.product);
    }

    @Override
    public String toString() {
        return "ProductParameteres{" +
                "id=" + id +
                ", colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                ", product=" + product +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
