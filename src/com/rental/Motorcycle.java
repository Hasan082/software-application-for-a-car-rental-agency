package com.rental;
public class Motorcycle implements Vehicle, MotorVehicle {

    private final String make;
    private final String model;
    private final int year;
    private final int numberOfWheels;
    private final String motorCycleType;

    public Motorcycle(String make, String model, int year, int numberOfWheels, String motorCycleType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfWheels = numberOfWheels;
        this.motorCycleType = motorCycleType;
    }

    /**
     * Retrieves the number of wheels in the motorcycle.
     *
     * @return the number of wheels in the motorcycle
     */
    @Override
    public int getNumberOfWheels() {
        // Returns the number of wheels in the motorcycle
        return numberOfWheels;
    }

    /**
     * Retrieves the type of the motorcycle (e.g. scooter, moped).
     * 
     * @return the type of the motorcycle
     */
    @Override
    public String getMotorCycleType() {
        // Returns the type of the motorcycle
        return motorCycleType;
    }

    /**
     * Retrieves the make of the motorcycle.
     * 
     * @return the make of the motorcycle
     */
    @Override
    public String getMake() {
        // Returns the make of the motorcycle
        return make;
    }

    /**
     * Retrieves the model of the motorcycle.
     * 
     * @return the model of the motorcycle
     */
    @Override
    public String getModel() {
        // Returns the model of the motorcycle
        return model;
    }

    /**
     * Retrieves the year of the motorcycle.
     * 
     * @return the year of the motorcycle
     */
    @Override
    public int getYear() {
        // Returns the year of the motorcycle
        return year;
    }

}
