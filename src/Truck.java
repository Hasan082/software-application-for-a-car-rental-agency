public class Truck implements Vehicle, TruckVehicle {

    private String make;
    private String model;
    private int year;
    private double carcapacity;
    private String transmissionType;

    public Truck(String make, String model, int year, int numberOfWheels, double carcapacity, String transmissionType){
        this.make = make;
        this.model = model;
        this.year = year;
        this.carcapacity = carcapacity;
        this.transmissionType = transmissionType;
    }


    @Override
    public double getCarcapacity() {
    return carcapacity;
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

}
