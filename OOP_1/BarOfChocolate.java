package OOP_sem;

public class BarOfChocolate extends Product {
    private double cacaoContent;
    private double sugarContent;
    private String chocolateType;

    public BarOfChocolate(String name, String brand, double price, double cacaoContent, double sugarContent, String chocolateType) {
        super(name, brand, price);
        this.cacaoContent = cacaoContent;
        this.sugarContent = sugarContent;
        checkChocolateType(chocolateType);
    }

    public double getCacaoContent() {
        return cacaoContent;
    }

    public void setCacaoContent(double cacaoContent) {
        this.cacaoContent = cacaoContent;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        checkChocolateType(chocolateType);

    }

    protected void checkChocolateType(String chocolateType) {
        if (chocolateType.equalsIgnoreCase("white") ||
                chocolateType.equalsIgnoreCase("black") ||
                chocolateType.equalsIgnoreCase("milk")) {
            this.chocolateType = chocolateType.toLowerCase();
        } else this.chocolateType = "undefined";
    }

    @Override
    public String toString() {
        return String.format("{Шоколад} %s - %s - %f - %s -Какао: %f - Сахар: %f", name, brand, price, chocolateType, cacaoContent, sugarContent);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + chocolateType.hashCode() * 7 + (int) cacaoContent * 11 + (int) sugarContent * 13;
    }
}
