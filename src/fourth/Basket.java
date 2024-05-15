package fourth;

import java.util.ArrayList;
import java.util.List;

class Basket {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void getBasket() {
        for (Product product : products) {
            System.out.println("Name: " + product.getNameProduct() + " Price: " + product.getPriceProduct());
        }
    }
}
