package com.rental;
public class Car implements Vehicle, CarVehicle {

    // fields
    private final String make;
    private final String model;
    private final int year;
    private final int numberOfDoors;
    private final String fuelTypes;

    // constructor
    public Car(String make, String model, int year, int numberOfDoors, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
        this.fuelTypes = fuelType;
    }

    /**
     * Retrieves the number of doors in the vehicle.
     *
     * @return the number of doors in the vehicle
     */
    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Retrieves the fuel type of the vehicle.
     *
     * @return the fuel type of the vehicle
     */
    @Override
    public String getFuelTypes() {
        return fuelTypes;
    }

    /**
     * Retrieves the make of the vehicle.
     *
     * @return the make of the vehicle
     */
    @Override
    public String getMake() {
        return make;
    }

    /**
     * Retrieves the model of the vehicle.
     *
     * @return the model of the vehicle
     */
    @Override
    public String getModel() {
        return model;
    }

    /**
     * Retrieves the year of the vehicle.
     *
     * @return the year of the vehicle
     */
    @Override
    public int getYear() {
        return year;
    }

}
