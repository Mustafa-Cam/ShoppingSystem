package Service;

import Model.Order;
import Model.Customer;
import Model.Product;
import Repository.OrderRepository;

import java.util.List;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    public Order createOrder(Customer customer) {
        Order order = new Order(customer);
        orderRepository.addOrder(order);
        return order;
    }

    public void addProductToOrder(Order order, Product product) {
        order.addProduct(product);
    }

    public void getAllOrders() {
        List<Order> allOrders = orderRepository.getAllOrders();
        for (Order order : allOrders) {
            System.out.println("Order ID: " + order.getId());
            System.out.println("Customer Name: " + order.getCustomer().getName());
            System.out.println("Order products:"+ order.getProducts());

        }
    }



    public Order getOrder(String id) {
        return orderRepository.getOrder(id);
    }

    public int getProductCountForCustomer(String customerName) {
        List<Order> allOrders = orderRepository.getAllOrders();
        int productCount = 0;
        for (Order order : allOrders) {
            if (order.getCustomer().getName().equals(customerName)) {
                productCount += order.getProducts().size();
            }
        }
        return productCount;
    }


}
