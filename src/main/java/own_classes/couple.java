package own_classes;


// <T> ->indicates the class is generic
public class couple <T>{
    //constructor of the class
    public couple(){
        first=null;
    }
    public void setFirst(T newValue){
        first=newValue;
    }
    public T getFirst(){
        return first;
    }
    private T first;



}

