package factoryMethod;

public class NormalWireTransfer extends abstractPayment{
    private static final String TICKET_MESSAGE = "transfer made";
    private static final String TICKET_NAME = "Transfer.txt";

    protected NormalWireTransfer(){
        super();
        setTicketMessage(TICKET_MESSAGE);
        setTicketName(TICKET_NAME);
    }

    @Override
    protected boolean checkDataBase() {
        switch (variable) {
            case "12345", "6789" -> {
                message = SUCCES;
                return true;
            }
            default -> {
                message = ERROR;
                return false;
            }
        }
    }
}
