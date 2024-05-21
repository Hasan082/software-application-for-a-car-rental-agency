# Vehicle Rental System

## Overview

The Vehicle Rental System is a Java application designed to facilitate the management and rental of different types of vehicles, including cars, motorcycles, and trucks. This system provides an interactive interface for users to input vehicle details, view available rental options, and manage the rental process.

## Features

- **Vehicle Management**: Allows users to add, update, and remove vehicle information.
- **Rental Booking**: Enables users to book vehicles for rental with specified dates and times.
- **Interactive Interface**: Provides a user-friendly command-line interface for easy interaction.

## File Structure

```
├── src
│   ├── com
│   │   └── rental
│   │       ├── Car.java
│   │       ├── Motorcycle.java
│   │       ├── Truck.java
│   │       ├── Vehicle.java
│   │       ├── CarVehicle.java
│   │       ├── MotorVehicle.java
│   │       ├── TruckVehicle.java
│   │       └── VehicleDetails.java
│   └── VehicleRentalSystem.java
```

### Explanation of Files

- **`com/rental/`**: Package containing all Java files related to the Vehicle Rental System.
  - **`Car.java`**: Class representing a car, implementing `Vehicle` and `CarVehicle` interfaces.
  - **`Motorcycle.java`**: Class representing a motorcycle, implementing `Vehicle` and `MotorVehicle` interfaces.
  - **`Truck.java`**: Class representing a truck, implementing `Vehicle` and `TruckVehicle` interfaces.
  - **`Vehicle.java`**: Interface defining common methods for vehicle objects (`getMake()`, `getModel()`, `getYear()`).
  - **`CarVehicle.java`**: Interface defining additional methods specific to cars (`getNumberOfDoors()`, `getFuelType()`).
  - **`MotorVehicle.java`**: Interface defining additional methods specific to motorcycles (`getNumberOfWheels()`, `getMotorcycleType()`).
  - **`TruckVehicle.java`**: Interface defining additional methods specific to trucks (`getCargoCapacity()`, `getTransmissionType()`).
  - **`VehicleDetails.java`**: Class to hold common vehicle details such as make, model, and year.
- **`VehicleRentalSystem.java`**: Main class file containing the entry point for the application and the logic to interact with the user.

## Usage

1. **Compilation**: Compile the Java files using a Java compiler.
    ```bash
    javac -d bin src/com/rental/*.java src/VehicleRentalSystem.java
    ```

2. **Execution**: Run the compiled program.
    ```bash
    java -cp bin VehicleRentalSystem
    ```

3. **Interaction**: Follow the on-screen prompts to interact with the system, such as adding vehicle details, booking rentals, etc.

## Implementation Details

- **Interfaces**: Utilizes Java interfaces to define common behavior and enforce contracts across different vehicle types.
- **Object-Oriented Design**: Implements a modular and object-oriented design for easy extensibility and maintenance.
- **Input Validation**: Incorporates input validation to ensure the integrity of user-provided data.
- **Exception Handling**: Handles exceptions gracefully to provide a robust user experience.

## Dependencies

- Java Development Kit (JDK)

## Contributing

Contributions to the Vehicle Rental System are welcome! Feel free to submit bug reports, feature requests, or pull requests to help improve the system.

## License

This project is licensed under the MIT License - see the [LICENSE](https://opensource.org/license/mit) file for details.
