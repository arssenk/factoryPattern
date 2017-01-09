package payments;

import interfaces.IPayment;

/**
 * Created by Arsen on 18-Nov-16.
 */
public class PayPalPaymentStrategy implements IPayment {
    @Override
    public double pay(double price) {
        return price;
    }
}
