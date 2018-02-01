package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        String userResponse = "Custom";
//        String userResponse2 = "Pre-made";


        CarModel carModel = new CarModel();
        CarModel carOptions = new CarModel();
        CarModel carOptions2 = new CarModel();

        //SpecificCars
        carModel.setYear(2018);
        carModel.setCarName("AVALON");
        carModel.setMilageCar(21/30);
        carModel.setWheelType("505 Torq Thrust 2");
        carModel.setWeightCar(3508);
        carModel.setModel("XLE Premium");

        //RandomParts

        //Options 1
        carOptions.setColor("Blue");
        carOptions.setEngine("BOXER");
        carOptions.setWeightCar(2580);
        carOptions.setWheelType("White Spoke");




        // Options 2
        carOptions2.setColor("Orange");
        carOptions2.setWheelType("Rock Crusher");
        carOptions2.setWeightCar(3723);
        carOptions2.setModel("Sports Classic");


        System.out.println("Would you like a custom car or a pre-made car?");
        System.out.println("Please enter Pre-made or Custom for the car (It has to be spelled correctly)");
        if (input.nextLine().equals("Custom")) {
            System.out.println("You have choose a Custom Car!!");
            System.out.println("Would you like a Orange or Blue car?");
            if (input.nextLine().equals("Orange")) {
                System.out.println("You have choose ORANGE!!");
                System.out.println("What tires would you like Rock Crusher or White Spoke?");
            } else if (input.nextLine().equals("Rock Crusher")) {
                System.out.println("You have choose Rock Crusher");


            } else if (input.nextLine().equals("Blue")) {
                System.out.println("You have choose BLUE!!");

            }
            System.out.println("What tires would you like Rock Crusher or White Spoke?");
            if (input.nextLine().equals("Rock Crusher")) {
                System.out.println("You have choose Rock Crusher!!");
            }


        } else if (input.nextLine().equals("Pre-made")) {
            System.out.println("You have choose a Pre-made Car!!!");
            System.out.println("You have the options of AVALON....");
        } else {
            System.out.println("Error answer not recognized!");
        }





























    }
}
