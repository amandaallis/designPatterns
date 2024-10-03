package adapter.payoneer;

import adapter.utils.Token;

public class Payoneer implements IpayoneerPayment{
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via payoneer");
    }

    @Override
    public void receivePayment() {
        System.out.println("Recebendo pagamento via payoneer");
    }
}
