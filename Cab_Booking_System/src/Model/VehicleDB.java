package Model;
import java.util.*;
import DAO.Vehicle;
import Controller.VehicleController;

import java.util.ArrayList;

public class VehicleDB implements VehicleController {
    List<Vehicle> vehicles=new ArrayList<>();

    @Override
    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
        System.out.println("Vehicle added Successfully");
    }

    @Override
    public List<Vehicle> getAllVehicles()
    {
        return vehicles;
    }

    @Override
    public void deleteVehicle(int vehicleID)
    {
        boolean v=vehicles.removeIf(vehicle -> vehicleID==Vehicle.getVehicleID());
        if(v)
            System.out.println("vehicle removed successfully");
        else
            System.out.println("vehicle id not found");
    }
}
