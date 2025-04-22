package Model;
import DAO.Driver;
import Controller.DriverController;

import java.util.ArrayList;
import java.util.List;

public class DriverDB implements DriverController {
    private List<Driver> drivers = new ArrayList<>();

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver added successfully.");
    }

    @Override
    public List<Driver> getAllDrivers() {
        return drivers;
    }

    @Override
    public void deleteDriver(int driverID) {

        boolean d=drivers.removeIf(driver -> Driver.getDriverID() == driverID);
            if(d)
            System.out.println("Driver removed successfully");
            else
            System.out.println("Driver id not found");
    }
}
