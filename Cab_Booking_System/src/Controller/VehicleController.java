package Controller;
import DAO.Vehicle;
import java.util.List;

public interface VehicleController {
    void addVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    void deleteVehicle(int vehicleID);
}
