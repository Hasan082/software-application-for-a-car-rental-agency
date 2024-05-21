public class Truck implements Vehicle, TruckVehicle {

    private String make;
    private String model;
    private int year;
    private double carCapacity;
    private String transmissionType;

    public Truck(String make, String model, int year, double carCapacity, String transmissionType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carCapacity = carCapacity;
        this.transmissionType = transmissionType;
    }

  
    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public double getCarcapacity() {
        return carCapacity;
    }

}
