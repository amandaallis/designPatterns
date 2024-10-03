package adapter.adapter;

import adapter.payoneer.Payoneer;
import adapter.paypal.IpayPalPayment;
import adapter.utils.Token;

public class AdapterPayoneer implements IpayPalPayment {

    private Token token;
    private Payoneer payoneer;

    public AdapterPayoneer(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer usando os metodos do PayPal");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
