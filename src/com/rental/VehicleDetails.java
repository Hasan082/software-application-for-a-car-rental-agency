package com.rental;
public class VehicleDetails {
	//fields
	private final String make;
    private final String model;
    private final int year;

	//Constructor
	public VehicleDetails(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	/**
	 * Retrieves the make of the vehicle.
	 * 
	 * @return the make of the vehicle
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Retrieves the model of the vehicle.
	 * 
	 * @return the model of the vehicle
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Retrieves the year of the vehicle.
	 * 
	 * @return the year of the vehicle
	 */
	public int getYear() {
		return year;
	}
}
