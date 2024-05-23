package Repository;

import Model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepository {
    private Map<String, Order> orderDatabase = new HashMap<>();

    public void addOrder(Order order) {
        orderDatabase.put(order.getId(), order);
    }

    public Order getOrder(String id) {
        return orderDatabase.get(id);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orderDatabase.values());
    }

}
