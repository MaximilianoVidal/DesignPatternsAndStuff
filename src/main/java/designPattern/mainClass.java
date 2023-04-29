package designPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class mainClass {

    private Message singleton;
    private final List<Thread> threadList= new ArrayList<>();
    private long count=0;

    private final static int NUMBER_OF_THREADS= 10;

    public mainClass(){
        IntStream.range(0,NUMBER_OF_THREADS)
        .forEach (e-> loadList());
        threadList.forEach(Thread::start);


    }
    private void loadList(){threadList.add(new Thread(this::operation));}

    private synchronized void operation(){
        singleton= SingletonClass.getInstance();
        count += SingletonClass.getCountOfInstance();
        singleton.accept(count+ " ");
        singleton.showMessage();
    }

    public static void main(String[] args) {new mainClass();}
}
