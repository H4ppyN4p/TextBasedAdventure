package com.company;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private TxtBasedAdventure application;

    public UserInterface(TxtBasedAdventure txtBasedAdventure) {
        this.application = txtBasedAdventure;
    }



    public void start(){
        System.out.println("""
        Welcome to my text based adventure game!
        This is a personal project I'm doing, based on a school assignment.
        I hope you enjoy!
        """);
    }

    public void commands(){
        boolean isRunning = true;
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("What do you want to do?");

        Acceptable acceptable = Acceptable.NOT_EXISTING;

        while (isRunning){


        String userInput = input.nextLine().toLowerCase();

        switch(userInput){
            //walk statements
            case "go north":
            case "north":
            case "n":
                acceptable = application.goNorth();

                if (acceptable == Acceptable.NOT_ACCEPTABLE){
                    System.out.println("You can't go that way");
                } else if (acceptable == Acceptable.ACCEPTABLE){
                    System.out.println("You go north");
                    System.out.println("you are in " + application.getPlayerRoom());
                }
                break;
            case "go south":
            case "south":
            case "s":
                acceptable = application.goSouth();

                if (acceptable == Acceptable.NOT_ACCEPTABLE){
                    System.out.println("You can't go that way");
                } else if (acceptable == Acceptable.ACCEPTABLE){
                    System.out.println("You go south");
                    System.out.println("you are in " + application.getPlayerRoom());
                }
                break;
            case "go east":
            case "east":
            case "e":
                acceptable = application.goEast();

                if (acceptable == Acceptable.NOT_ACCEPTABLE){
                    System.out.println("You can't go that way");
                } else if (acceptable == Acceptable.ACCEPTABLE){
                    System.out.println("You go east");
                    System.out.println("you are in " + application.getPlayerRoom());
                }
                break;
            case "go west":
            case "west":
            case "w":
                acceptable = application.goWest();

                if (acceptable == Acceptable.NOT_ACCEPTABLE){
                    System.out.println("You can't go that way");
                } else if (acceptable == Acceptable.ACCEPTABLE){
                    System.out.println("You go west");
                    System.out.println("you are in " + application.getPlayerRoom());
                }
                break;
            }
            System.out.println();
            System.out.println("What do you want to do?");
        }
    }

    public void help(){
        System.out.println("""
        Insert help text here  
        """);
    }



}


