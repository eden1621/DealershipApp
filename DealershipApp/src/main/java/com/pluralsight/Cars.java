package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cars {
    public Cars getCars(){
        try (BufferedReader reader = new BufferedReader(new FileReader("inventory.csv"))) {
            String CarsLine = reader.readLine();
            String[] carsInfo = Cars.split("\\|");
            Dealership dealership = new Dealership(carsInfo[0], carsInfo[1], carsInfo[2]);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                Vehicle vehicle = new Vehicle(
                        Integer.parseInt(parts[0]),
                        Integer.parseInt(parts[1]),
                        parts[2],
                        parts[3],
                        parts[4],
                        parts[5],
                        Integer.parseInt(parts[6]),
                        Double.parseDouble(parts[7])
                );
                dealership.addVehicle(vehicle);
            }
            return Cars;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    }
