package com.company;

public class Avalon extends CarModel {

    public Avalon() {
    }

    public Avalon(int year, String carName, String wheelType, int speedMPH, String model, int sizeCar, int milageCar, double weightCar, String color, String engine) {
        super(year, carName, wheelType, speedMPH, model, sizeCar, milageCar, weightCar, color, engine);

        setYear(2018);
        setCarName("Avalon");
        setMilageCar(21/30);
        setWheelType("505 torq thrust 2");
        setWeightCar(3508);
        setModel("XLE Premium");
        setColor("Black");



    }





}
