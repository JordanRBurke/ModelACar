package com.company;

public class CarModel {

    private int year;
    private String carName;
    private String wheelType;
    private int speedMPH;
    private String model;
    private int sizeCar;
    private int milageCar;
    private double weightCar;
    private String color;
    private String engine;

    public CarModel() {
    }

    public CarModel(int year, String carName, String wheelType, int speedMPH, String model, int sizeCar, int milageCar, double weightCar, String color, String engine) {
        this.year = year;
        this.carName = carName;
        this.wheelType = wheelType;
        this.speedMPH = speedMPH;
        this.model = model;
        this.sizeCar = sizeCar;
        this.milageCar = milageCar;
        this.weightCar = weightCar;
        this.color = color;
        this.engine = engine;
    }

    public String getEngine() {

        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // Car options


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public int getSpeedMPH() {
        return speedMPH;
    }

    public void setSpeedMPH(int speedMPH) {
        this.speedMPH = speedMPH;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSizeCar() {
        return sizeCar;
    }

    public void setSizeCar(int sizeCar) {
        this.sizeCar = sizeCar;
    }

    public int getMilageCar() {
        return milageCar;
    }

    public void setMilageCar(int milageCar) {
        this.milageCar = milageCar;
    }

    public double getWeightCar() {
        return weightCar;
    }

    public void setWeightCar(double weightCar) {
        this.weightCar = weightCar;
    }
}
