package designPattern;

public class loggerSingleton {
    private static loggerSingleton log;
    private String value;
    private loggerSingleton(){

    }
    public static synchronized loggerSingleton getInstance(){
        if (log== null){log= new loggerSingleton();}
        return  log;
    }
    public void log(String msg){System.out.println(msg);}

    public void setValue(String msg){value= msg;}

    public String getValue(){return value;}



}
