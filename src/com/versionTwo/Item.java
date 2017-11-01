package com.versionTwo;

/*
 * represents an item, contains a price and a description.
 *
 */
public class Item {

    private String description;
    private float price;

    public Item(String description, float price) throws Exception {
        super();
        this.description = description;
        if(price<0)
            throw new Exception("Negative price is not allowed");
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}