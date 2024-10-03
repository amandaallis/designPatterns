package adapter.paypal;

import adapter.utils.Token;

public class Paypal implements IpayPalPayment{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        System.out.println("Enviando pagamentos com paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via Paypal");
    }
}
