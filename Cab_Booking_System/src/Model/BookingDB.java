package Model;
import java.awt.print.Book;
import java.util.*;
import DAO.Booking;
import Controller.BookingController;
public class BookingDB implements BookingController{

    ArrayList<Booking> bookings=new ArrayList<>();
    @Override
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public List<Booking> viewBooking() {
        return bookings;
    }

    @Override
    public void cancelBooking(int bookingID) {
        boolean b= bookings.removeIf(booking -> booking.getBookingID()==bookingID);
        if(b)
            System.out.println("The Booking has been cancelled");
        else
            System.out.println("the Booking id is not found");
    }
}
