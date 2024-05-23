package Model;
import Util.IDGenerator;

public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
    private int stock;

    public Product( String name, String category, double price, int stock) {
        this.id = IDGenerator.generateProductId();
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Category: " + category + ", Price: " + price;
    }

}
