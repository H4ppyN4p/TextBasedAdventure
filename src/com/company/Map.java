package com.company;

public class Map {
    Player player = new Player();

    Room room1 = new Room("room 1", "This is room 1.");
    Room room2 = new Room("room 2", "This is room 2.");
    Room room3 = new Room("room 3", "This is room 3.");
    Room room4 = new Room("room 4", "This is room 4.");
    Room room5 = new Room("room 5", "This is room 5.");
    Room room6 = new Room("room 6", "This is room 6.");
    Room room7 = new Room("room 7", "This is room 7.");
    Room room8 = new Room("room 8", "This is room 8.");
    Room room9 = new Room("room 9", "This is room 9.");

    public Map(){

        room1.setSouth(room4);
        room1.setEast(room2);
        room2.setEast(room3);
        room3.setSouth(room6);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setSouth(room9);
        room7.setEast(room8);
        room8.setEast(room9);
        player.currentRoom = room1;

    }

    //Walk methods
    public Acceptable goNorth(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (player.currentRoom.getNorth() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;
        } else {
            player.currentRoom = player.currentRoom.getNorth();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }

    public Acceptable goSouth(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (player.currentRoom.getSouth() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;
        } else {
            player.currentRoom = player.currentRoom.getSouth();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }

    public Acceptable goEast(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (player.currentRoom.getEast() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;
        } else {
            player.currentRoom = player.currentRoom.getEast();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }

    public Acceptable goWest(){
        Acceptable acceptable = Acceptable.NOT_EXISTING;

        if (player.currentRoom.getWest() == null) {
            acceptable = Acceptable.NOT_ACCEPTABLE;

        } else {
            player.currentRoom = player.currentRoom.getWest();
            acceptable = Acceptable.ACCEPTABLE;
        }

        return acceptable;
    }

    //Player room
    public String getCurrentRoomName(){
        return player.getCurrentRoomName();
    }

    public String getCurrentRoomDescrption(){
        return player.getCurrentRoomDescription();
    }
}
