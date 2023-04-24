package HomeTasks3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Пусть дан произвольный список целых чисел, удалить из него четные числа*/
public class Task1 {
    public static void main(String[] args) {
        List<Integer> lst = createListRandomInt(20, 0, 10);
        System.out.println(lst);
        lst = lst.stream().filter(x -> x % 2 != 0).toList();
        System.out.println(lst);
    }

    static List<Integer> createListRandomInt(int capacity, int min, int max) {
        Random rnd = new Random();
        List<Integer> lst = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            lst.add(rnd.nextInt(min, max));
        }
        return lst;
    }
}
