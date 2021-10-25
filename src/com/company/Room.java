package com.company;

public class Room {

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
