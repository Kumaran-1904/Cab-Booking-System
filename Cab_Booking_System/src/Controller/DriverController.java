package Controller;
import DAO.Driver;
import java.util.List;

public interface DriverController {
    void addDriver(Driver driver);
    List<Driver> getAllDrivers();
    void deleteDriver(int driverID);
}
