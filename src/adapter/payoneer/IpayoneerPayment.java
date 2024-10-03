package adapter.payoneer;

import adapter.utils.Token;

public interface IpayoneerPayment {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
