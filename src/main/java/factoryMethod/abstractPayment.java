package factoryMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public abstract class abstractPayment implements Payment {


    protected String variable;
    protected String message;

    public void setTicketMessage(String ticketMessage) {
        this.ticketMessage = ticketMessage;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    protected String ticketMessage;
    protected String ticketName;//attributes
    protected int quantity;
    protected File file;

    protected abstractPayment(){}

    @Override
    public boolean makePayment() {
        var received= checkDataBase();
        System.out.println(message);
        return received;
    }

    @Override
    public void getTicket() throws IOException {
        file= new File("src//"+ticketMessage);
        try (var writer= new FileWriter(file)){
            writer.write(LocalDate.now()+ "::" + LocalDate.now()+"\n"+ ticketMessage + "\nCantidad:"+ quantity);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    protected abstract boolean checkDataBase();




    public void configurePayment (String variable,int quantity){
        this.variable= variable;
        this.quantity=quantity;
    }


}
