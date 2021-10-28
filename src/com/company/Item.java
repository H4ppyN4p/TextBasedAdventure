package com.company;


public class Item {
    private String name;
    private String description;

    public Item(String itemName, String itemDescription) {
        name = itemName;
        description = itemDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

}

