package BuilderPatronDesign;

public class employye {
  private String name,surname,function,nif,contractType;
  private double salary;
  private int age;

    public employye() {
    }

    public employye(String name, String surname, String function, String nif, String contractType,
                    double salary, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.function = function;
        this.nif = nif;
        this.contractType = contractType;
        this.salary = salary;
        this.age = age;
    }

}
