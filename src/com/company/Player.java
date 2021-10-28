package com.company;

import java.util.ArrayList;

public class Player {

    Room currentRoom;
    private ArrayList<Item> itemsInventory = new ArrayList<>();

    public Player(){

    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public String getCurrentRoomName(){
        return currentRoom.getRoomName();
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
    }

    //Walk methods
    public Acceptable goNorth(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (currentRoom.getNorth() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;
        } else {
            currentRoom = currentRoom.getNorth();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }

    public Acceptable goSouth(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (currentRoom.getSouth() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;
        } else {
            currentRoom = currentRoom.getSouth();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }

    public Acceptable goEast(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (currentRoom.getEast() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;
        } else {
            currentRoom = currentRoom.getEast();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }

    public Acceptable goWest(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (currentRoom.getWest() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;

        } else {
            currentRoom = currentRoom.getWest();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }
}
