package adapter.adapter;

import adapter.mercadoPago.MercadoPago;
import adapter.paypal.IpayPalPayment;
import adapter.utils.Token;

public class AdapterMercadoPago implements IpayPalPayment {
    private Token token;
    private MercadoPago mercadoPago;

    public AdapterMercadoPago(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.mercadoPago.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.mercadoPago.receivePayment();
    }
}
