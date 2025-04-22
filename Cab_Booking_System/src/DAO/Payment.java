package DAO;

public class Payment {
    private int paymentID;
    private float amount;
    private String paymentMode;
    private String paymentStatus;

    public Payment(int paymentID,float amount, String paymentMode, String paymentStatus) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment ID: " + paymentID + ", Amount: $" + amount + ", Mode: " + paymentMode + ", Status: " + paymentStatus;
    }
}
