package com.company;

public class TxtBasedAdventure {

    private Map map;
    private UserInterface ui;

    public TxtBasedAdventure(){
        map = new Map();
        ui = new UserInterface(this);

    }

    public void start(){
        ui.start();
        ui.commands();
    }



    public static void main(String[] args) {

        boolean isRunning = true;

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
    public String getPlayerRoom(){
        return map.getPlayerRoom();
    }



}
