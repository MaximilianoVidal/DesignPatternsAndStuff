package designPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class  SingletonClass implements Message {

    private static SingletonClass instance;//atributo of the same class. this is what it comes back
    private final List<String> listOfMessage= new ArrayList<>();
    private static int countOfInstance= 0;

    private SingletonClass(){countOfInstance++;//constructor by defect. doesn't receive parameter
    }

    public static SingletonClass getInstance(){
        instance = Objects.isNull(instance)? new SingletonClass(): instance;//single iteration
        // if its null creates a new instance, if not returns the instance
        return instance;
    }// initiated and turn back the instance


    public void accept(String mmessage){listOfMessage.add(mmessage);}

    public void showMessage(){
        var textBuffer= new StringBuffer(100);
        listOfMessage.forEach(textBuffer::append);
        var text = textBuffer.toString();
        System.out.println(text);

    }

    public static int getCountOfInstance(){return countOfInstance;}


}
