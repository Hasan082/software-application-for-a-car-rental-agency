
import java.util.Scanner;

public class VehicleRentalSystem {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            String choice;
            
            System.out.println("Welcome to the Vehicle Rental System!\n");
            
            while (true) {
                System.out.println("Please select an option from below:-");
                System.out.println("1. Car");
                System.out.println("2. Motorcycle");
                System.out.println("3. Truck");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextLine();
                if (choice.equals("4")) {
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;
                }
                
                switch (choice) {
                    case "1" -> {
                        Car car = collectCarDetails(scanner);
                        displayVehicle(car);
                        System.out.println("");//Make a space between input & display
                        break;
                    }
                    case "2" -> {
                        Motorcycle motorcycle = collectMotorcycleDetails(scanner);
                        displayVehicle(motorcycle);
                        System.out.println("");//Make a space between input & display
                        break;
                    }
                    case "3" -> {
                        
                        System.out.println("");//Make a space between input & display
                        break;
                    }
                    default -> {
                        System.out.println("");//Make a space between input & display
                        System.out.println("Invalid choice. Please try again.");
                        System.out.println("");//Make a space between input & display
                    }
                }
                
            }
        }

    }

    private static void displayVehicle(Vehicle vehicle) {
        System.out.println("Your Vehicle Details are below:");
        System.out.println("Make:" + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year:" + vehicle.getYear());

        if (vehicle instanceof Car car) {
            System.out.println("Number of doors: " + car.getNumberOfDoos());
            System.out.println("Fuel type: " + car.getFuelTypes());
        } else if (vehicle instanceof Motorcycle motorcycle) {
            System.out.println("Number of wheels: " + motorcycle.getNumberOfWheels());
            System.out.println("Motorcycle type: " + motorcycle.getMotorCycleType());
        }
    }

    private static VehicleDetails collectCommonDetails(Scanner scanner, String vehicleType) {
        System.out.println("");
        System.out.println("Enter " + vehicleType + " details:");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        return new VehicleDetails(make, model, year);
    }
    
    public static Car collectCarDetails(Scanner scanner) {
        VehicleDetails vehicleDetails = collectCommonDetails(scanner, "Car");
        System.out.print("Number of doors: ");
        int numberOfDoos = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel type (petrol/diesel/electric): ");
        String fuelType = scanner.nextLine();
        System.out.println("");//Make a space between input & display
        return new Car(vehicleDetails.getMake(), vehicleDetails.getModel(), vehicleDetails.getYear(), numberOfDoos, fuelType);
    }


    public static Motorcycle collectMotorcycleDetails(Scanner scanner) {
        VehicleDetails vehicleDetails = collectCommonDetails(scanner, "Motorcycle");
        System.out.print("Number of wheels: ");
        int numberOfWheels = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Motorcycle type (scooter/moped): ");
        String motorCycleType = scanner.nextLine();
        System.out.println("");//Make a space between input & display
        return new Motorcycle(vehicleDetails.getMake(), vehicleDetails.getModel(), vehicleDetails.getYear(), numberOfWheels, motorCycleType);
    }


    
}
