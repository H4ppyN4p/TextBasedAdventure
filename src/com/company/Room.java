package com.company;

import java.util.ArrayList;

public class Room {

    private ArrayList<Item> itemsNormalsInRoom = new ArrayList<>();


    private String roomName;
    private String description;
    private Room north;
    private Room south;
    private Room west;
    private Room east;

    public Room(String roomName, String description){
        this.roomName = roomName;
        this.description = description;
    }

    // set Directions
    public void setSouth(Room south){
        if (this.south == null){
            this.south = south;
            south.setNorth(this);
        }
    }

    public void setEast(Room east){
        if (this.east == null){
            this.east = east;
            east.setWest(this);
        }
    }

    public void setNorth(Room north){
        if (this.north == null) {
            this.north = north;
            north.setSouth(this);
        }
    }

    public void setWest(Room west){
        if (this.west == null) {
            this.west = west;
            west.setEast(this);
        }
    }
    //Item handling
    public void setItem(Item itemName){
        itemsNormalsInRoom.add(itemName);
    }

    public Item takeItem(String itemName) {
        Item itemVariable = new Item("empty", "empty");

        for (int i = 0; i < itemsNormalsInRoom.size(); i++){
            itemVariable = itemsNormalsInRoom.get(i);

            if (itemVariable.getName().equals(itemName)) {
                itemsNormalsInRoom.remove(i);
                i = itemsNormalsInRoom.size();
            }

            else {
                itemVariable = null;
            }
        }

        return itemVariable;
    }

    public ArrayList<Item> getItems(){
        return itemsNormalsInRoom;
    }

    // Get Directions
    public Room getWest(){
        return west;
    }

    public Room getEast(){
        return east;
    }

    public Room getNorth(){
        return north;
    }

    public Room getSouth(){
        return south;
    }

    //Room information
    public String getRoomName(){
        return this.roomName;
    }

    public String getDescription(){
        return this.description;
    }
}
