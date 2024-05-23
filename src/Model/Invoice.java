package Model;

import Util.IDGenerator;

public class Invoice {
    private String id;
    private Order order;
    private double totalAmount;

    public Invoice(Order order, double totalAmount) {
        this.id = IDGenerator.generateInvoiceId();
        this.order = order;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "id=" + id + ", order=" + order + ", totalAmount=" + totalAmount;
    }
}
