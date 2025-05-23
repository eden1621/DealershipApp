package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return (ArrayList<Vehicle>) inventory;
    }

    public void removeVehicle(int vin) {
        inventory.removeIf(vehicle -> vehicle.getVin() == vin);
    }

    // These help us save dealership info later
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
        }

