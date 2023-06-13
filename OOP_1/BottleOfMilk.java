package OOP_sem;

public class BottleOfMilk extends Product{
    private double volume;

    private double fatContent;

    public BottleOfMilk(String name, String brand, double price, double volume, double fatContent) {
        super(name, brand, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public String toString() {
        return String.format("{Бутылка} %s - %s - %f - %f - %f", name, brand, price, volume, fatContent);
    }
}
