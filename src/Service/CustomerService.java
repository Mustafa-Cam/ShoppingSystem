package Service;

import Model.Customer;
import Repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    public static void displayAllCustomers(CustomerRepository customerRepository) {
        List<Customer> allCustomers = customerRepository.getAllCustomers();
        for (Customer customer : allCustomers) {
            System.out.println("Customer ID: " + customer.getId());
            System.out.println("Customer Name: " + customer.getName());
            System.out.println("Customer Age: " + customer.getAge());
        }
    }


    public Customer getCustomer(String id) {
        return customerRepository.getCustomer(id);
    }
    public int getCustomerCount() {
        List<Customer> allCustomers = customerRepository.getAllCustomers();
        return allCustomers.size();
    }

    public int getProductCountForCustomer(String name) {
        List<Customer> customersWithName = customerRepository.getAllCustomers().stream()
                .filter(customer -> customer.getName().equals(name))
                .collect(Collectors.toList());

        int totalProductCount = 0;
        for (Customer customer : customersWithName) {
            totalProductCount += customer.getOrders().stream()
                    .mapToInt(order -> order.getProducts().size())
                    .sum();
        }

        return totalProductCount;
    }


}
