package OOP_sem3;

import java.util.Comparator;

public class AgeSalaryComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int r1 = Integer.compare(o2.age, o1.age);
        if (r1 == 0) {
            return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        } else {
            return r1;
        }
    }
}
