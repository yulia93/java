package OOP_sem2;

public class Programm {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 15),
                new Cat("Bubble", 20),
                new Cat("Monk", 10),
                new Cat("Behemo", 50)

        };
            Plate plate = new Plate(40);
        plate.info();
        for ( Cat cat : cats){
            cat.eat(plate);
            System.out.printf("Кот %s\t наелся %b\n", cat.getName(), cat.isSatiety());
        }
        plate.info();
        plate.addFood(100);
        plate.info();

    }
}
