package view;

import DAO.Vehicle;
import DAO.Driver;
import Controller.DriverController;
import Controller.VehicleController;

import java.util.*;

public class AdminView {
    Scanner sc=new Scanner(System.in);
    private VehicleController vehicleController;
    private DriverController driverController;

    public AdminView(VehicleController vehicleController, DriverController driverController) {
        this.vehicleController = vehicleController;
        this.driverController = driverController;
    }

    public void adminMenu() {
        while (true) {
            System.out.println("\n=== Admin Panel ===");
            System.out.println("1. Manage Drivers");
            System.out.println("2. Manage Vehicles");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manageDrivers();
                    break;
                case 2:
                    manageVehicles();
                    break;
                case 3:
                    System.out.println("Exiting Admin Panel...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void manageVehicles() {
        int veh=1;
        while(true) {
            System.out.println("\n--- Manage Vehicles ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Delete Vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Model: ");
                    String model=sc.nextLine();
                    System.out.print("Enter Registration number: ");
                    String registrationNumber = sc.nextLine();
                    System.out.print("Enter Type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter Capacity: ");
                    int capacity = sc.nextInt();

                    vehicleController.addVehicle(new Vehicle(veh++, model, registrationNumber, type, capacity));
//                    System.out.println("Vehicle added successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Vehicle List ---");
                    vehicleController.getAllVehicles().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter Vehicle ID to remove: ");
                    int vehicleID = sc.nextInt();
                    vehicleController.deleteVehicle(vehicleID);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void manageDrivers() {
        int dri=1;
        System.out.println("\n--- Manage Drivers ---");
        System.out.println("1. Add Driver");
        System.out.println("2. View Drivers");
        System.out.println("3. Delete Driver");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Phone: ");
                String phone = sc.nextLine();
                System.out.print("Enter License Number: ");
                String license = sc.nextLine();
                System.out.print("Enter Vehicle ID (Assign a vehicle to the driver): ");
                String vehicleID = sc.nextLine();

                driverController.addDriver(new Driver(dri++, name, phone, license, vehicleID));
                System.out.println("Driver added successfully.");
                break;

            case 2:
                System.out.println("\n--- Driver List ---");
                driverController.getAllDrivers().forEach(System.out::println);
                break;

            case 3:
                System.out.print("Enter Driver ID to remove: ");
                int driverID = sc.nextInt();
                driverController.deleteDriver(driverID);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
