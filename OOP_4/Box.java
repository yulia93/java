package Lesson_04.OOP_4_homework;

import java.util.ArrayList;


public class Box<T extends Fruit> implements Comparable<Box<T>> {
    private final ArrayList<T> fruits;
    private final int idBox;
    private static int count = 0;

    public Box() {
        this.fruits = new ArrayList<>();
        this.idBox = ++count;
    }

    public int getIdBox() {
        return idBox;
    }

    public Boolean isEmpty() {
        return this.fruits.size() == 0;
    }

    public float getWeight() {
        return isEmpty() ? 0f : fruits.get(0).getWeight() * this.fruits.size();

    }

    public void addFruit(T o) {
        this.fruits.add(o);
    }

    public void reloadFruits(Box<T> o) {
        if (this != o) {
            this.fruits.addAll(o.fruits);
            o.fruits.clear();
        }
    }

    /**
     * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     *
     * @param o
     * @return
     */
    public boolean compare(Box o) {//
        return compareTo(o) == 0;
    }

    @Override
    public int compareTo(Box o) {
        return Float.compare(this.getWeight(), o.getWeight());

    }

    @Override
    public String toString() {

        return isEmpty() ? String.format("FruitBox#%d: empty", this.idBox) :
                String.format("FruitBox#%d: %s %d fruits; weight %.2f kg", this.idBox, this.fruits.get(0).toString(),
                        this.fruits.size(), this.getWeight());
    }
}
