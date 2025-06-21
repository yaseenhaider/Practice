
import model.Product;

import java.util.*;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(Product p, int q) {
        items.add(new CartItem(p, q));
    }

    public double getTotal() {
        return items.stream().mapToDouble(CartItem::getTotal).sum();
    }

    public List<CartItem> getItems() {
        return items;
    }
}
