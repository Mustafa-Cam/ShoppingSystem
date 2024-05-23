package Repository;

import Model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
    private Map<String, Customer> customerDatabase = new HashMap<>();

    public void addCustomer(Customer customer) {
        customerDatabase.put(customer.getId(), customer);
    }

    public Customer getCustomer(String id) {
        return customerDatabase.get(id);
    }

    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerDatabase.values());
    }


}
