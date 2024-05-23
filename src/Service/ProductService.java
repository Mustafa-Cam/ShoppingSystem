package Service;

import Model.Product;
import Repository.ProductRepository;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public Product getProduct(String id) {
        return productRepository.getProduct(id);
    }
}
