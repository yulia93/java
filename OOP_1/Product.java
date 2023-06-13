package OOP_sem;

public class Product {
    protected String name;
    protected String brand;
    protected double price;


    public Product() {
        this("noname", -1);
    }

    public Product(String brand, double price) {
        this("product", brand, price);
    }

    public Product(String name, String brand, double price) {
        checkName(name);
        this.brand = brand;
        checkPrice(price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return String.format("%s - %s - %f -hash: %d ", name, brand, price, hashCode());
    }

    @Override
    public int hashCode() {
        return name.hashCode() + brand.hashCode() * 3 + (int) (price * 5);
    }

    protected void checkPrice(double price) {
        if (price < -1) {
            this.price = -1;
        } else {
            this.price = price;
        }
    }

    protected void checkName(String name) {
        if (name.length() < 5) {
            this.name = "product";
        } else {
            this.name = name;
        }
    }
}
