package OOP_sem3;

import java.util.*;

public class Main {
    static Random r = new Random();

    static Employee generateEmployee() {
        String[] names = {"Иван", "Дин", "Петр", "Ной", "Натан", "Юрий", "Полукс", "Фока", "Фёдор", "Вова"};
        String[] surnames = {"Иванов", "Петров", "Сидоров", "Шмакин", "Тортугин", "Цой", "Волков", "Федоров", "Панько", "Савельев"};
        int age = r.nextInt(25, 56);
        if (r.nextInt() % 2 == 0) {
            int salary = r.nextInt(45_000, 80_001);
            return new Worker(names[r.nextInt(names.length)], surnames[r.nextInt(surnames.length)], salary, age);
        } else if (r.nextInt() % 3 == 0) {
            int salary = r.nextInt(150_000, 300_001);
            double kpi = Main.r.nextDouble(0.5, 1);
            return new Boss(names[r.nextInt(names.length)], surnames[r.nextInt(surnames.length)], salary, age, kpi);
        } else {
            int salary = r.nextInt(1000, 2001);
            int timeSheet = Main.r.nextInt(20, 30);
            return new FreeLancer(names[r.nextInt(names.length)], surnames[r.nextInt(surnames.length)], salary, age, timeSheet);
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        System.out.println("Сортировка по зарплате:");
        Arrays.sort(employees);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("Сортировка по возрасту:");
        Arrays.sort(employees, new AgeComporator());
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("Сортировка по фамилии:");
        Arrays.sort(employees, Comparator.comparing(o -> o.surname));
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println();
        System.out.println("Сортировка по возрасту + ЗП:");
        Arrays.sort(employees, new AgeSalaryComporator());
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
