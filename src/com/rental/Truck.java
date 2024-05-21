package com.rental;

public class Truck implements Vehicle, TruckVehicle {

    private final String make;
    private final String model;
    private final int year;
    private final double carCapacity;
    private final String transmissionType;

    public Truck(String make, String model, int year, double carCapacity, String transmissionType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carCapacity = carCapacity;
        this.transmissionType = transmissionType;
    }

  
    /**
     * Retrieves the transmission type of the truck.
     * 
     * @return the transmission type of the truck
     */
    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * Retrieves the make of the truck.
     * 
     * @return the make of the truck
     */
    @Override
    public String getMake() {
        // Returns the make of the truck
        return make;
    }

    /**
     * Retrieves the model of the truck.
     * 
     * @return the model of the truck
     */
    @Override
    public String getModel() {
        // Returns the model of the truck
        return model;
    }

    /**
     * Retrieves the year of the truck.
     * 
     * @return the year of the truck
     */
    @Override
    public int getYear() {
        // Returns the year of the truck
        return year;
    }

    /**
     * Retrieves the car capacity of the truck.
     * 
     * @return the car capacity of the truck
     */
    @Override
    public double getCarcapacity() {
        // Returns the car capacity of the truck
        return carCapacity;
    }

}
