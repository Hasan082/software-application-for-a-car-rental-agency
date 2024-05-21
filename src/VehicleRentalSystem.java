
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleRentalSystem {

    /**
     * Retrieves an integer input from the user.
     * @param scanner the scanner to read the input from
     * @param prompt the prompt to display to the user
     * @return the integer input provided by the user
     * @throws InputMismatchException if the user input is not valid
     */
    public static int getIntInput(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }
        return value;
    }

    /**
     * Retrieves a double input from the user.
     * @param scanner the scanner to read the input from
     * @param prompt the prompt to display to the user
     * @return the double input provided by the user
     * @throws InputMismatchException if the user input is not valid
     */
    public static double getDoubleInput(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            try {
                // Attempt to parse the input as a double
                value = scanner.nextDouble();
                // Consume the newline character
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a double.");
                // Consume the invalid input
                scanner.nextLine();
            }
        }
        return value;
    }
    //Main method
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
                        // Collect car details
                        Car car = collectCarDetails(scanner);
                        // Display car details
                        displayVehicle(car);
                        break;
                    }
                    case "2" -> {
                        // Collect motorcycle details
                        Motorcycle motorcycle = collectMotorcycleDetails(scanner);
                        // Display motorcycle details
                        displayVehicle(motorcycle);                        
                        break;
                    }
                    case "3" -> {
                        // Collect truck details
                        Truck truck = collectTruckDetails(scanner);
                        // Display truck details
                        displayVehicle(truck);
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

    //Display vehicle
    private static void displayVehicle(Vehicle vehicle) {
        System.out.println("Your Vehicle Details are below:");
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());

        if (vehicle instanceof Car car) {
            System.out.println("Number of doors: " + car.getNumberOfDoors());
            System.out.println("Fuel type: " + car.getFuelTypes());
        } else if (vehicle instanceof Motorcycle motorcycle) {
            System.out.println("Number of wheels: " + motorcycle.getNumberOfWheels());
            System.out.println("Motorcycle type: " + motorcycle.getMotorCycleType());
        }else if(vehicle instanceof Truck truck){
            System.out.println("Car capacity: " + truck.getCarcapacity());
            System.out.println("Transmission type: " + truck.getTransmissionType());
        }
        System.out.println("");//Make a space between input & display
    }

    /**
     * Collects the common details of a vehicle such as make, model, and year.
     * @param scanner the scanner to read the input from
     * @param vehicleType the type of vehicle to collect the details for
     * @return the VehicleDetails object with the details collected
     */
    private static VehicleDetails collectCommonDetails(Scanner scanner, String vehicleType) {
        System.out.println("");
        System.out.println("Enter " + vehicleType + " details:");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        int year = getIntInput(scanner, "Year: ");
        return new VehicleDetails(make, model, year);
    }

    //Collect Car  details
    public static Car collectCarDetails(Scanner scanner) {
        VehicleDetails vehicleDetails = collectCommonDetails(scanner, "Car");
        int numberOfDoors = getIntInput(scanner, "Number of doors: ");
        System.out.print("Fuel type (petrol/diesel/electric): ");
        String fuelType = scanner.nextLine();
        System.out.println("");//Make a space between input & display
        return new Car(vehicleDetails.getMake(), vehicleDetails.getModel(), vehicleDetails.getYear(), numberOfDoors, fuelType);
    }

    /**
     * Collects the details of a Motorcycle and returns them as a Motorcycle object.
     * @param scanner the scanner to read the input from
     * @return the Motorcycle object with the details collected
     */
    public static Motorcycle collectMotorcycleDetails(Scanner scanner) {
        // Collects the details of a Motorcycle
        VehicleDetails vehicleDetails = collectCommonDetails(scanner, "Motorcycle");
        // Number of wheels
        int numberOfWheels = getIntInput(scanner, "Number of wheels: ");
        // Motorcycle type
        System.out.print("Motorcycle type (scooter/moped): ");
        String motorCycleType = scanner.nextLine();
        System.out.println("");//Make a space between input & display
        return new Motorcycle(vehicleDetails.getMake(), vehicleDetails.getModel(), vehicleDetails.getYear(), numberOfWheels, motorCycleType);
    }

    /**
     * Collects the details of a Truck and returns them as a Truck object.
     * @param scanner the scanner to read the input from
     * @return the Truck object with the details collected
     */
    public static Truck collectTruckDetails(Scanner scanner) {
        VehicleDetails vehicleDetails = collectCommonDetails(scanner, "Truck");
        double carcapacity = getDoubleInput(scanner, "Car capacity: ");
        System.out.print("Transmission type (manual/auto): ");
        String transmissionType = scanner.nextLine();
        System.out.println("");//Make a space between input & display
        return new Truck(vehicleDetails.getMake(), vehicleDetails.getModel(), vehicleDetails.getYear(), carcapacity, transmissionType);
    }


    
}
