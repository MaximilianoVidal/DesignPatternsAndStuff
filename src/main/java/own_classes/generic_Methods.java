package own_classes;

public class generic_Methods {
    public static void main(String[] args) {
        String[] names={"belen","maria","jose"};
        MisMatrices.getElement(names);
        System.out.println(MisMatrices.getElement(names));
        Employee[] listofEmployee= {new Employee("ana",27,1500),
                new Employee("gabriela",27,1500),
                new Employee("neuquen",27,1500),
                new Employee("israel",27,1500)
        };
        System.out.println(MisMatrices.getElement(listofEmployee));
        System.out.println(MisMatrices.getMinor(names));
    }

}
class MisMatrices{
    public static <T> String getElement(T[]a){
        return "the array has"+ a.length+" element";

    }
    public static <T extends Comparable> T getMinor(T[]a){
        if (a==null || a.length==0){
            return null;
        }
        T minorElement= a[0];
        for(int i=1;i< a.length; i++){
            minorElement= a[i];
        }
        return minorElement;
    }
}
