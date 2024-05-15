package fourth;

class Product {
    public String name;

    public double price;

    Product(String name, double price) {
        this.name = name;

        this.price = price;
    }

    public String getNameProduct() {
        return name;
    }

    public double getPriceProduct() {
        return price;
    }
}
