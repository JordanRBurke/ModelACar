package com.company;




import java.util.Scanner;
public class MainMenu extends Avalon {
    Scanner input = new Scanner(System.in);




    public void userInteraction() {


        System.out.println("You have a choice of a Pre-made car or Custom car, which would you like to choose?");

        if (input.nextLine().equals("Pre-made")) {
            System.out.println("You have selected a Pre-made ");
            System.out.println("You have the option of a Ferrari, Avalon, and McLaren (Selecting one will give you the stats)");

        } else {
            System.out.println("You have selected Custom");
            System.out.println("Choose a car Super or Off-road?");
        } if (input.nextLine().substring(0).equalsIgnoreCase("S")) {
                setCarName("Super");
                System.out.println("You have chosen Super");
                System.out.println("What tires would you like White Spoke or Dust Riders");
            } else {
            System.out.println("You have chosen Off-road");
            setCarName("Off-road");
            System.out.println("What tires would you like White Spoke or Dust Riders");
            }
            if (input.nextLine().substring(0).equalsIgnoreCase("W")) {
            setWheelType("White Spoke");
            System.out.println("You have chosen White Spoke!");
            System.out.println("What color would you like to pick? Red or Black");
            } else {
            System.out.println("You have chosen Dust Riders!");
            setWheelType("Dust Riders");
            System.out.println("What color would you like to pick? Red or Black");
            }

            if (input.nextLine().equals("Red")) {
            System.out.println("You have chosen Red!");
            setColor("Red");
                System.out.println("Would you like it to fly or swim");
            } else {
            System.out.println("You have chosen Black");
            setColor("Black");
            System.out.println("Would you like it to fly or swim");
            }

            if (input.nextLine().equals("fly")) {
            System.out.println("You have chosen a flying car!! Color " + getColor() + " ....Tires are " + getWheelType() + " ....The car is a " + getCarName());
            } else {
            System.out.println("You have chosen a submarine car!! Color " + getColor() + " ....Tires are " + getWheelType() + " ....The car is a " + getCarName());
            }
























    }









    }















