package OOP_sem3;

public class FreeLancer extends Employee {
    private int timeSheet;

    public int getTimeSheet() {
        return timeSheet;
    }

    public FreeLancer(String name, String surname, double salary,int age,int timeSheet) {
        super(name, surname, salary,age);
        this.timeSheet = timeSheet;
    }

    /**
     * Время по таймшит умножаем на часовую ставку
     * @return
     */
    @Override
    public double calculateSalary() {
        return timeSheet * salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s;Freelancer;%d лет;\tзарплата %.2f рублей;ставка в час: %.0f рублей", name, surname,age,calculateSalary(),salary);}
}
