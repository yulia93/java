package OOP_sem;



public class BottleOfWater extends Product {

    private double volume;

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("{Бутылка} %s - %s - %f - %f ", name, brand, price, volume);
    }
}
