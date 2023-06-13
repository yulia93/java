package OOP_sem;

public class PackedPizza extends Product {
    private int size;

    public PackedPizza(String name, String brand, double price, int size) {
        super(name, brand, price);
        checkSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        checkSize(size);
    }

    private void checkSize(int size) {
        if (size >= 10) {
            this.size = size;
        } else this.size = 10;
    }

    @Override
    public String toString() {
        return String.format("{Пицца} %s - %s - %f -Size: %d ", name, brand, price, size);
    }
}
