package OOP_sem3;

public class Boss extends Employee {
    public double getKpi() {
        return kpi;
    }

    private double kpi;

    public Boss(String name, String surname, double salary, int age, double kpi) {
        super(name, surname, salary, age);
        this.kpi = kpi;
    }

    /**
     * Месячный оклад умножаем на процент выполнения KPI
     *
     * @return
     */
    @Override
    public double calculateSalary() {
        return salary * kpi;
    }

    @Override
    public String toString() {
        return String.format("%s %s;Boss;%d лет;\tзарплата %.2f рублей;KPI: %.2f процента", name, surname, age, calculateSalary(), kpi * 100);
    }
}
