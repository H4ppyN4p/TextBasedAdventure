package com.company;

public class Player {

    Room currentRoom;

    public Player(){

    }

    public Room getCurrentRoom(){
        return currentRoom;
    }

    public String getCurrentRoomName(){
        return currentRoom.getRoomName();
    }
}
