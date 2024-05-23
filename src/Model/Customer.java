package Model;

import Util.IDGenerator;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String name;
    private List<Order> orders;
    private int age;

    public Customer(String name, int age) {
        this.id = IDGenerator.generateCustomerId();
        this.name = name;
        this.orders = new ArrayList<>();
        this.age = age;
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

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", age: " + age;
    }
}
