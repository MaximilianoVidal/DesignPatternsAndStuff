package own_classes;

public class Employee {
    public Employee(String name, int age, float salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String data(){
        return "the employee name is "+ name + " has "+ age+ " years old "+"and his salary is "+ salary;
    }
    private final String name;
    private final int age;
    private final double salary;
}
