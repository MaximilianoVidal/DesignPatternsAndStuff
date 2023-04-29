package serialization;

import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;
public class serializacion {
    public static void main(String[] args) {
        //reference cannot be make in a static class
        Administrator boss = new Administrator("juan", 800, 2005, 12, 5);
        boss.setInsentivo(500);
        Employee[] personal = new Employee[3];//amount of personal
        personal[0] = boss;
        personal[1] = new Employee("hugo", 2300, 2020, 10, 1);
        personal[2] = new Employee("maxi", 230, 2022, 7, 10);
        try {
            //creating a extern fluid data
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("E:\\OneDrive\\Desktop\\java streams\\employee.dat"));
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();
            // flujo de datos de entrada
            ObjectInputStream recovering_file = new ObjectInputStream(new FileInputStream("E:\\OneDrive\\Desktop\\java streams\\employee.dat"));
            Employee[] personal_recuperado = (Employee[]) recovering_file.readObject();
            recovering_file.close();
            for (Employee e: personal_recuperado) {
                System.out.println(e);
            }
        } catch (Exception e) {

        }


    }
}

    class Employee implements Serializable {
    private static final long serialVersionUID= 1L;
        public Employee(String n, double s, int year, int month, int day) {
            name = n;
            salary = s;
            GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
            contractDate = calendar.getTime();

        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public Date getContractDate() {
            return contractDate;
        }

        public void upSalary(double percentage) {
            double up = salary * percentage / 100;
        }

        public String toString() {
            // pass to text what the class do
            return "name= " + name + ". salary=" + salary + ", date of contract" + contractDate;
        }

        private final String name;
        private final double salary;
        private final Date contractDate;


    }

    //----------------------------------------------------------------------------------------------------------

    class Administrator extends Employee {
    private static final long serialVersionUID= 1L;//create a code version to be able to run the class in diferent machines
        public Administrator(String n, double s, int year, int month, int day) {
            super(n, s, year, month, day);
            incentivo = 0;
        }

        public double getSalary() {
            double salaryBase = super.getSalary();
            return salaryBase + incentivo;
        }

        public void setInsentivo(double b) {
            incentivo = b;
        }

        public String toString() {
            return super.toString() + "incentivo= " + incentivo;
        }

        private double incentivo;
    }



