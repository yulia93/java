package HomeTasks3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название
каждой планеты и количество его повторений в списке.*/

public class Task3 {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayList<String> planetsList = createItemsList(planets, 20);
        System.out.println(planetsList);
        for (String planet : planets) {
            System.out.printf("%s\t %d\n", planet, Collections.frequency(planetsList, planet));
        }
    }

    static ArrayList<String> createItemsList(String[] items, int capacity) {
        Random rnd = new Random();
        ArrayList<String> itemsList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            int index = rnd.nextInt(0, 8);
            itemsList.add(items[index]);
        }
        return itemsList;
    }
}
//Collections.frequency(arr,elem)