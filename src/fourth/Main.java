package fourth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Basket basket = new Basket();

        while (true) {
            String message = console.nextLine();
            switch (message) {
                case "add" -> {
                    System.out.println("Ввведите название продукта");
                    String productName = console.nextLine();
                    System.out.println("Ввведите цену продукта");
                    int productPrice = console.nextInt();
                    basket.addProduct(new Product(productName, productPrice));
                }
                case "show" -> {
                    basket.getBasket();
                }
                default -> System.out.println("Такой команды нет");
            }
        }
    }
}
