import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Method to update a product
    public void updateProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Method to delete a product
    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    // Method to get a product by productId
    public Product getProduct(String productId) {
        return products.get(productId);
    }
}
