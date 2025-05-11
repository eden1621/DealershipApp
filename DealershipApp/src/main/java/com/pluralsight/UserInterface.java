package com.pluralsight;
import java.util.*;

public class UserInterface {
    private Dealership dealership;

    public void display() {
        init(); // Load dealership
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    processAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 99:
                    running = false;
                    break;
                default:
                    System.out.println("Not a valid option.");
            }
        }
    }

    private void init() {
        dealershipFileManager fileManager = new dealershipFileManager();
        dealership = fileManager.getDealership();
    }

    private void processAllVehiclesRequest() {
        ArrayList<Vehicle> all = dealership.getAllVehicles();
        for (Vehicle v : all) {
            System.out.println(v);
        }
    }

    private void processAddVehicleRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a vehicle...");
        System.out.print("VIN: ");
        int vin = scanner.nextInt();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // eat newline
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Odometer: ");
        int odometer = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Vehicle newVehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
        dealership.addVehicle(newVehicle);
        new dealershipFileManager().saveDealership(dealership);
        System.out.println("Vehicle added!");
    }

    private void processRemoveVehicleRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter VIN of vehicle to remove: ");
        int vin = scanner.nextInt();
        dealership.removeVehicle(vin);
        new dealershipFileManager().saveDealership(dealership);
        System.out.println("Vehicle removed!");
    }
}



