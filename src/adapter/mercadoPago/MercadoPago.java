package adapter.mercadoPago;

import adapter.utils.Token;

public class MercadoPago implements IMercadoPago{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Método send do mercado pago");
    }

    @Override
    public void receivePayment() {
        System.out.println("Metodo receive do mercado pago");
    }
}
