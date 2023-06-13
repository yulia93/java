package OOP_sem3;

public abstract class Employee implements Comparable<Employee>{
    protected String name;
    protected String surname;
    protected double salary;
    protected int age;

    public Employee(String name, String surname, double salary,int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * Расчет сремесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    public int compareTo(Employee o){
        return Double.compare(o.calculateSalary(),this.calculateSalary());
    }
}
