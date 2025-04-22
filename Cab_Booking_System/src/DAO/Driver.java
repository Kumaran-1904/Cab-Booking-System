package DAO;

public class Driver {
    private static int driverID;
    private String name;
    private String phone;
    private String licenseNumber;
    private String vehicleID;

    public Driver(int driverID, String name, String phone, String licenseNumber, String vehicleID) {
        this.driverID = driverID;
        this.name = name;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
        this.vehicleID = vehicleID;
    }

    public static int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    @Override
    public String toString() {
        return "Driver ID: " + driverID + ", Name: " + name + ", Phone: " + phone + ", Vehicle ID: " + vehicleID;
    }
}
