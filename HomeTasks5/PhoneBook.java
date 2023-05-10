package HomeTasks5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    /*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
     Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге*/
    private Map<String, List<String>> Book = new HashMap<>();

    public void add(String surName, String PhoneNumber){
        if (Book.containsKey(surName.toUpperCase())){
            List <String> lst = Book.get(surName.toUpperCase());
            lst.add(PhoneNumber);
        }
        else {
            List<String> lst = new ArrayList<>();
            lst.add(PhoneNumber);
            Book.put(surName.toUpperCase(), lst);
        }
    }
    public void print(){
        for(Map.Entry<String,List<String>> entry: Book.entrySet()){
            System.out.println(entry);
        }
    }
    public void findSurName(String surName){
        if (!Book.containsKey(surName.toUpperCase())){
            System.out.println("Search result: "+surName+"  didn`t find in phonebook");
            return;
        }
        System.out.println("Search result: "+surName+"\t"+Book.get(surName.toUpperCase()).toString());
    }
    public void findPhoneNumber(String phoneNumber) {
        boolean flag= true;
        for (Map.Entry<String, List<String>> entry : Book.entrySet()) {
            List<String> lst = entry.getValue();
            for( String item : lst){
                if (item.equalsIgnoreCase(phoneNumber)) {
                    System.out.println("Search result: "+phoneNumber+"\t"+"Surname: " +entry.getKey());
                    flag = false;
                }
            }

        }
        if (flag) {System.out.println("Search result: "+phoneNumber+"  didn`t find in phonebook");}
    }
}
