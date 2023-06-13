package OOP_sem;


import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk sellBottleOfMilk(double volume, double fatContent) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                if (((BottleOfMilk) product).getVolume() >= volume && ((BottleOfMilk) product).getFatContent() == fatContent) {
                    return (BottleOfMilk) product;
                }
            }
        }
        return null;
    }

    public BarOfChocolate sellBarOfChocolate(String chocolateType) {
        for (Product product : products) {
            if (product instanceof BarOfChocolate) {
                if (((BarOfChocolate) product).getChocolateType().equalsIgnoreCase(chocolateType)) {
                    return (BarOfChocolate) product;
                }
            }
        }
        return null;
    }
    public PackedPizza sellPackedPizza(int size) {
        for (Product product : products) {
            if (product instanceof PackedPizza) {
                if (((PackedPizza) product).getSize() == size) {
                    return (PackedPizza) product;
                }
            }
        }
        return null;
    }

    public void printReceipt(Product product) {
        if (product != null) {
            System.out.println("Вы купили: ");
            System.out.println(product);
        } else {
            System.out.println("Товар не найден.");
        }
    }
}
