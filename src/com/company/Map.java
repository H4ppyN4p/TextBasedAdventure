package com.company;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private ArrayList<Item> itemsInRoom = new ArrayList<>();

    Player player = new Player();

    //Create rooms
    Room room1 = new Room("room 1", "This is room 1 - a dark room");
    Room room2 = new Room("room 2", "This is room 2 - a somewhat dark room");
    Room room3 = new Room("room 3", "This is room 3 - a somewhat less dark room");
    Room room4 = new Room("room 4", "This is room 4 - a somewhat light room");
    Room room5 = new Room("room 5", "This is room 5 - a more light room");
    Room room6 = new Room("room 6", "This is room 6 - a somewhat bright room");
    Room room7 = new Room("room 7", "This is room 7 - a bright room");
    Room room8 = new Room("room 8", "This is room 8 - a really bright room");
    Room room9 = new Room("room 9", "This is room 9 - a blindingly bright room");



    public Map(){

        //Set rooms
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

        //Create and set items
        Item lamp = new Item("lamp", "A brass lamp");
        Item duck = new Item("duck","A rubber duck");

        room1.setItem(lamp);
        room1.setItem(duck);

    }


    //Walk methods
    public Acceptable goNorth(){
      return player.goNorth();
    }

    public Acceptable goSouth(){
        return player.goSouth();
    }

    public Acceptable goEast(){
        return player.goEast();
    }

    public Acceptable goWest(){
       return player.goWest();
    }




    //Player room
    public String getCurrentRoomName(){
        return player.getCurrentRoomName();
    }

    public String getCurrentRoomDescrption(){
        return player.getCurrentRoomDescription();
    }

    public List itemsInRoom(){
        return player.getItemsCurrentRoom();
    }
}
