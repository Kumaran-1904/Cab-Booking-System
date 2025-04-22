package DAO;

public class Vehicle {
    private static int vehicleID;
    private String model;
    private String registrationNumber;
    private String type;
    private int capacity;

    public Vehicle(int vehicleID, String model, String registrationNumber, String type, int capacity) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.capacity = capacity;
    }

    public static int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleID + ", Model: " + model + ", Type: " + type + ", Capacity: " + capacity;
    }
}
