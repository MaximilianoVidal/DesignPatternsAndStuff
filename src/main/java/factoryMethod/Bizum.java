package factoryMethod;

public class Bizum extends abstractPayment{

    private static final String TICKET_MESSAGE = "SMS-> Your bizum completes successfully";
    private static final String TICKET_NAME = "Bizum.txt";

    protected Bizum(){
        super();
        setTicketMessage(TICKET_MESSAGE);
        setTicketName(TICKET_NAME);
    }

    @Override
    protected boolean checkDataBase() {
        switch (variable){
            case "41357637":
            case "28175743":
                message=SUCCES;
                return true;
            default: message= ERROR;
            return false;
        }
    }
}
