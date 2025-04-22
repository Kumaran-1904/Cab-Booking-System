package DAO;

public class Booking {
    private int bookingID;
    private String pickupLocation;
    private String dropLocation;
    private int nopassenger;
    private int distance;
    private float fare;
    private String time;

    public Booking(int bookingID, String pickupLocation, String dropLocation,int nopassenger , int distance, float fare, String time) {
        this.bookingID = bookingID;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.nopassenger=nopassenger;
        this.distance=distance;
        this.fare = fare;
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public int getNopassenger() {
        return nopassenger;
    }

    public void setNopassenger(int nopassenger) {
        this.nopassenger = nopassenger;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID  + ", Pickup: " + pickupLocation + ", Drop: " + dropLocation + ", No.Passenger: "+ nopassenger+ ", Distance: " +distance + ", Fare: $" + fare+", Time: "+time ;
    }
}
