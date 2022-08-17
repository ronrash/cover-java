package designpatterns.creational.singleton.solid.ocp;

public interface NotificationService {

 // this notification service is class and all other implement it
    //therefor it is open for extension
    void sendOTP(String medium);

    void sendTransactionReport(String medium);

}
