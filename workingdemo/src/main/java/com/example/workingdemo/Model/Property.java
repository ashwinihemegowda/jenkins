package com.example.workingdemo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="property")
public class Property {
    @Id
    private int propertyId;
    private String propertyName;
    private String category;
    private String City;
    private double price;

    public Property(int propertyId, String propertyName, String category, String city, double price) {
        this.propertyId = propertyId;
        this.propertyName = propertyName;
        this.category = category;
        City = city;
        this.price = price;
    }

    public Property() {
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
