package Controller;

import java.util.*;
import DAO.Booking;

public interface BookingController {
    void addBooking(Booking booking);
    List<Booking> viewBooking();
    void cancelBooking(int bookingID);
}
