package adapter.paypal;

import adapter.utils.Token;

public interface IpayPalPayment {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
