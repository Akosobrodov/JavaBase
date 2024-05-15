package fourth;

public class Main {
    public static void main(String[] args) {
    Basket basket = new Basket();

    basket.addProduct(new Product("banan", 1));
    basket.addProduct(new Product("apple", 2));
    basket.addProduct(new Product("orange", 3));

    basket.getBasket();

    }
}
