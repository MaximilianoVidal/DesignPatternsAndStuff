package designPattern;

public class mainOfLogger {
    public static void main(String[] args) {

        loggerSingleton logger= loggerSingleton.getInstance();
        logger.setValue("ojala puediera devolver el tiempo para veeeeeerte de nuevo");
        System.out.println(logger.getValue());
    }
}
