public class Motorcycle implements Vehicle, MotorVehicle{

    private String make;
    private String model;
    private int year;
    private int numberOfWheels;
    private String motorCycleType;
    
    public Motorcycle(String make, String model, int year, int numberOfWheels, String motorCycleType){
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfWheels = numberOfWheels;
        this.motorCycleType = motorCycleType;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public String getMotorCycleType() {
        return motorCycleType;
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
