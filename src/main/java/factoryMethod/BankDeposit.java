package factoryMethod;

public class BankDeposit extends abstractPayment{
    //the class who implements an abstract class must declare all the methods in there

    private static final String TICKET_MESSAGE= "ha efectuado el deposito with success";
    private static final String TICKET_NAME= "Bankdeposit.txt";

    protected BankDeposit(){
        super();
        setTicketMessage(TICKET_MESSAGE);
        setTicketName(TICKET_NAME);
    }

    @Override
    protected boolean checkDataBase() {
        switch (variable){
            case "santader41357637":
            case "san28175743":
                message= SUCCES;
                return true;// is the return of two cases is equal. isn't  necessary write the message twice.
            default: message= ERROR;
            return false;
        }
    }




}
