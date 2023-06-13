package OOP_sem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Вода без газа", "ООО Ниагара", 100, 1.5);
        Product bottle2 = new BottleOfMilk("Кефир свежий", "ООО Ниагара", 96, 1.5, 2);
        Product bottle3 = new BottleOfMilk("Кефир свежий", "ООО Ниагара", 150, 2, 3);
        Product bottle4 = new BottleOfMilk("Кефир свежий", "ООО Ниагара", 196, 3, 2);
        Product bar1 = new BarOfChocolate("Алёнка", "Бабаевский", 100, 97.5, 5, "black");
        Product bar2 = new BarOfChocolate("Вкусный", "Dove", 100, 0, 5, "white");
        Product bar3 = new BarOfChocolate("Молочный", "Dove", 100, 20, 5, "milk");
        Product pizza1 = new PackedPizza("4 сыра", "Папа Джонс", 200, 20);
        Product pizza2 = new PackedPizza("4 сыра", "Папа Джонс", 100, 10);

        List<Product> products = new ArrayList<>();
        products.add(bottle1);
        products.add(bottle2);
        products.add(bottle3);
        products.add(bottle4);
        products.add(bar1);
        products.add(bar2);
        products.add(bar3);
        products.add(pizza1);
        products.add(pizza2);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfMilk milk1 = vendingMachine.sellBottleOfMilk(2, 3);
        vendingMachine.printReceipt(milk1);


        BarOfChocolate barOfChocolate1 = vendingMachine.sellBarOfChocolate("milk");
        vendingMachine.printReceipt(barOfChocolate1);

        PackedPizza packedPizza1 = vendingMachine.sellPackedPizza(20);
        vendingMachine.printReceipt(packedPizza1);


    }
}
