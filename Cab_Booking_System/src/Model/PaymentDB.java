package Model;

import DAO.Payment;
import Controller.PaymentController;

import java.util.ArrayList;

public class PaymentDB implements PaymentController{

    ArrayList<Payment> payments=new ArrayList<>();

    @Override
    public void makePayment(Payment payment) {
        payments.add(payment);
    }
}
