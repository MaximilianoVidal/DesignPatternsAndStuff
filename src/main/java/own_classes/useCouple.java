package own_classes;

public class useCouple {
    public static void main(String[] args) {
        couple<String> one= new couple<>();//instancia la class couple
        one.setFirst("brenda");
        System.out.println(one.getFirst());
        Person person1= new Person("elizabeth");
        couple<Person> another= new couple<>();
        another.setFirst(person1);
        System.out.println(another.getFirst());

    }

}

class Person{
        public Person(String name){//this is a constructor.
            this.name= name;
        }
        private final String name;

}
