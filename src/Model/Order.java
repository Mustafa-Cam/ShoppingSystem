package Model;

import java.util.ArrayList;
import java.util.List;
import Util.IDGenerator;

public class Order {
    private String id;
    private Customer customer;
    private List<Product> products;
    private Invoice invoice;

    public Order( Customer customer) {
        this.id = IDGenerator.generateOrderId();
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "id: " + id + ", customer: " + customer + ", products: " + products + ", invoice: " + invoice;
    }
}
