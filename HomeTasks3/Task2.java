package HomeTasks3;

import java.util.ArrayList;
import java.util.Collections;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
Collections.max()*/
public class Task2 {
    public static void main(String[] args) {
        ArrayList <Integer> arrLst =new ArrayList<>(Task1.createListRandomInt(20,0,30));
        System.out.println(arrLst);
        System.out.println("Min value is: " + Collections.min(arrLst));
        System.out.println("Max value is: " + Collections.max(arrLst));
        System.out.println("Average value is: " + arrLst.stream().mapToInt(a -> a).average().orElse((Double.NaN)));
    }
}
