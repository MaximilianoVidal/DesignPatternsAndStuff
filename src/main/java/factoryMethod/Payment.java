package factoryMethod;

import java.io.IOException;

public interface Payment {

    String SUCCES= "Successful payment";
    String ERROR= "Payment could not be made";

    void configurePayment(String variable,int quantity);//method. pass a variable sting type & quantity int

    boolean makePayment();//method. if the paid is made true. otherwise false
    void getTicket() throws IOException;//method.


}
