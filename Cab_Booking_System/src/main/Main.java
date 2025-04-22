package main;
import DAO.User;
import view.AdminView;
import Model.*;
import Controller.*;
import view.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleController vehicleController = new VehicleDB();
        DriverController driverController = new DriverDB();
        UserController userController=new UserDB();
        BookingController bookingController=new BookingDB();
        PaymentController paymentController=new PaymentDB();

        AdminView adminView = new AdminView(vehicleController, driverController);
        UserView userView =new UserView(userController,bookingController,paymentController);

        System.out.println("1. Admin\n2. Customer\n3. Exit");
        int userType = sc.nextInt();
        sc.nextLine();
        switch(userType) {
            case 1:
                System.out.print("Ent+er the Username : ");
                String username = sc.nextLine();
                System.out.print("Enter the Password : ");
                String password = sc.nextLine();
                if (username.equals("kumaran") && password.equals("1234"))
                    adminView.adminMenu();
                else
                    System.out.println("please enter the valid username and password");
            case 2:
                userView.userMenu();
            case 3:
                System.out.println("Thank You...");
                return;
        }

    }
}
