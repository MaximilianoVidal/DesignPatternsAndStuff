package arrayList;


import java.util.ArrayList;
import java.util.Iterator;

//set is a method that allows to include or replace one object of an array in one particular place
// get-> method-> obtains what elements are in one concrete position
public class usoEmpleado {
    public static void main(String[] args) {
        Employee[] listEmployee = new Employee[3];
        listEmployee[0]=new Employee("ana",45,2500);
        listEmployee[1]=new Employee("anthony",45,2500);
        listEmployee[2]=new Employee("maria",45,2500);
        for (Employee e:listEmployee) System.out.println(e.data());
//-------------------------------------------------------------------------
        ArrayList<Employee> empleado= new ArrayList<>();
        //empleado.ensureCapacity(100);
        //cant use .length in arraylist
        empleado.add(new Employee("ana",40,2500));
        empleado.add(new Employee("anthony",45,2500));
        empleado.add(new Employee("maria",31,2500));
        empleado.set(1,new Employee("juliet",22,2000));//first the position, next the object
        empleado.trimToSize();//eliminates the excess of memory

        System.out.println(empleado.get(2).data());
        System.out.println(empleado.size());

        for (Employee e:empleado) System.out.println(e.data());
        System.out.println("------------------------------------------");

        Iterator<Employee> iterator_employee= empleado.iterator();
        while(iterator_employee.hasNext())
        System.out.println(iterator_employee.next().data());
        /*create one default array------------>set length. this case the size of the arraylist empleado
        Employee[] arrayEmployee= new Employee[empleado.size()];
        empleado.toArray(arrayEmployee);*/
    }

}
class Employee{

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