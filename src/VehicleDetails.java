public class VehicleDetails {
	private String make;
    private String model;
    private int year;

	//Constructor
	public VehicleDetails(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	//getters
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
}
