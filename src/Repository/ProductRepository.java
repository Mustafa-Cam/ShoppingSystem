package Repository;

import Model.Product;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private Map<String, Product> productDatabase = new HashMap<>();

    public void addProduct(Product product) {
        productDatabase.put(product.getId(), product);
    }

    public Product getProduct(String id) {
        return productDatabase.get(id);
    }


}
