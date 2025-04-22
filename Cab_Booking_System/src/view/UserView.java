package view;

import java.util.*;
import Controller.*;
import DAO.*;

public class UserView {
    Scanner sc=new Scanner(System.in);
    private UserController userController;
    private BookingController bookingController;
    private PaymentController paymentController;
    private User user;
    private Booking booking;
    float fare1=0;
    public UserView(UserController userController,BookingController bookingController,PaymentController paymentController) {
        this.userController=userController;
        this.bookingController=bookingController;
        this.paymentController=paymentController;
    }

    public void userMenu() {
        while(true) {
            System.out.println("\n=== User Panel ===");
            System.out.println("1.Manage user");
            System.out.println("2.Perform Booking");
            System.out.println("3.Make Payment");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    manageUser();
                    break;
                case 2:
                    manageBooking();
                    break;
                case 3:
                    managePayment();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void managePayment() {
        int pay=1;
        while(true) {
            System.out.println("\n--- Manage payment ---");
            System.out.println("1.Make Payment");
            System.out.println("2.Exit");
            System.out.println("Enter the your choice");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the Payment Mode : (Card,UPI,Cash)");
                    String mode=sc.nextLine();
                    System.out.println("Enter the Payment Status : (Success,Pending)");
                    String status=sc.nextLine();
                    System.out.println("\nPayment done Successfully...\nThe cab will be there on time...");
                    paymentController.makePayment(new Payment(pay++,fare1,mode,status));
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    private void manageBooking() {
        int book=1;
        while(true) {
            System.out.println("\n--- Manage Booking---");
            System.out.println("1.Add Booking");
            System.out.println("2.View Booking");
            System.out.println("3.Cancel Booking");
            System.out.println("4.Exit");
            System.out.println("Enter the your choice");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter the pickupLocation : ");
                    String pick=sc.nextLine();
                    System.out.print("Enter the dropLocation : ");
                    String drop=sc.nextLine();
                    System.out.print("Enter the no.of.Passenger : ");
                    int nopassenger=sc.nextInt();
                    System.out.print("Enter the number of kilo meter(km) : ");
                    int distance=sc.nextInt();
                    sc.nextLine();
                    float fare=calculateFare(distance);
                    System.out.print("The fare for you journey : "+fare+"\nEnter the time to pickup -> hh:mm (am/pm) : ");
                    String time=sc.nextLine();

                    bookingController.addBooking(new Booking(book++,pick,drop,nopassenger,distance,fare,time));
                   System.out.println("\nBooking added successfully..\nMake payment to confirm your booking....");
                    break;
                case 2:
                    System.out.println("\n--- View Details ---");
                    bookingController.viewBooking().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter the Booking Id to cancel: ");
                    int id1=sc.nextInt();
                    bookingController.cancelBooking(id1);
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
    public float calculateFare(int distance) {
        float baseFare = 50.0f;  // Fixed starting fare
        float ratePerKm = 10.0f; // ₹10 per km
        fare1=baseFare + (ratePerKm * distance);
        return baseFare + (ratePerKm * distance);
    }

    public void manageUser() {
        int ur=1;
        while(true) {
            System.out.println("\n--- Manage User ---");
            System.out.println("1.Add Details");
            System.out.println("2.View Details");
            System.out.println("3.Exit");
            System.out.println("Enter the your choice");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter the name : ");
                    String name=sc.nextLine();
                    System.out.print("Enter the email : ");
                    String email=sc.nextLine();
                    System.out.print("Enter the phone : ");
                    String phone=sc.nextLine();
                    System.out.print("Enter the address : ");
                    String address=sc.nextLine();
                    userController.addDetails(new User(ur++,name,email,phone,address));
                    break;
                case 2:
                    System.out.println("\n--- View Details ---");
                    userController.getUsers().forEach(System.out::println);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
