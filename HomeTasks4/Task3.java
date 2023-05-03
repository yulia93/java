package HomeTasks4;

import java.util.*;

/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор*/
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = Task1.creatList(10,0,10);
        System.out.println(lst);
        Iterator<Integer> iter = lst.iterator();
        int sum =0;
        while (iter.hasNext()){
            sum += iter.next();
        }
        System.out.printf("Sum = %d",sum);
    }


}
