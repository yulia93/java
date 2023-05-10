package HomeTasks5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //HomeTask1();
        HomeTask2();
    }

    public static void HomeTask1() {
        /*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько
        телефонов. Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге*/

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "7893");
        phoneBook.add("ИВАНОв", "7895");
        phoneBook.add("ПеТров", "8897");
        phoneBook.add("Иванов", "5555");
        phoneBook.add("Петров", "9997");
        phoneBook.add("Smith", "1111");
        phoneBook.add("ПетроВ", "1111");
        phoneBook.print();
        phoneBook.findSurName("Smith");
        phoneBook.findSurName("Johns");
        phoneBook.findSurName("иваноВ");
        phoneBook.findPhoneNumber("8897");
        phoneBook.findPhoneNumber("1111");
        phoneBook.findPhoneNumber("0000");
    }

    public static void HomeTask2() {
        /*Пусть дан список сотрудников:
        Иван Иванов,
        Светлана Петрова,
        Кристина Белова,
        Анна Мусина,
        Анна Крутова,
        Иван Юрин,
        Петр Лыков,
        Павел Чернов,
        Петр Чернышов,
        Мария Федорова,
        Марина Светлова,
        Мария Савина,
        Мария Рыкова,
        Марина Лугова,
        Анна Владимирова,
        Иван Мечников,
        Петр Петин,
        Иван Ежов.
        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.*/


        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        String[] list = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"};
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(list));
        while (!lst.isEmpty()) {
            int count = 0;
            String name = lst.get(0).substring(0, lst.get(0).indexOf(' '));
            Iterator<String> strIter = lst.iterator();
            while (strIter.hasNext()) {
                String str = strIter.next();
                if (name.equalsIgnoreCase(str.substring(0, str.indexOf(' ')))) {
                    count++;
                    strIter.remove();
                }
            }
            if (treeMap.containsKey(count)) {
                List<String> temp = treeMap.get(count);
                temp.add(name);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(name);
                treeMap.put(count, temp);
            }
        }
        System.out.println(treeMap);
    }


}
