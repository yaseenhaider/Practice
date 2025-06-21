import model.Product;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product; this.quantity = quantity;
    }

    public double getTotal() {
        return quantity * product.getPrice();
    }
}
