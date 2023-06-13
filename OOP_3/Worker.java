package OOP_sem3;

public class Worker extends Employee{
    public Worker(String name, String surname, double salary,int age) {
        super(name, surname, salary,age);
    }

    /**
     * У рабочего месячный оклад
     * @return
     */
    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s;Worker;%d лет;\tзарплата %.2f рублей", name, surname,age,calculateSalary());
    }
}
