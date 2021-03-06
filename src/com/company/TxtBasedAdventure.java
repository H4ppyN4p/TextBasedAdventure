package com.company;

import java.util.ArrayList;
import java.util.List;

public class TxtBasedAdventure {
    private boolean isRunning = true;
    private Map map;
    private UserInterface ui;

    public TxtBasedAdventure(){
        map = new Map();
        ui = new UserInterface(this);


    }

    public void start(){
        ui.start();
        ui.help();
        while (isRunning == true) {
            ui.commands();
        }
    }



    public static void main(String[] args) {

        TxtBasedAdventure txtBased = new TxtBasedAdventure();
        txtBased.start();



    }

    //Methods to pass data from Map to UI
    //Walk methods
    public Acceptable goNorth(){
       Acceptable acceptable = map.goNorth();
       return acceptable;
    }

    public Acceptable goSouth(){
        Acceptable acceptable =  map.goSouth();
        return acceptable;

    }

    public Acceptable goEast(){
        Acceptable acceptable =  map.goEast();
        return acceptable;

    }

    public Acceptable goWest(){
        Acceptable acceptable =  map.goWest();
        return acceptable;
    }

    //Player room
    public String getCurrentRoomName(){
        return map.getCurrentRoomName();
    }

    public String getCurrentRoomDescrption(){
        return map.getCurrentRoomDescrption();
    }

    public List itemsInRoom(){
        return map.itemsInRoom();
    }


}
