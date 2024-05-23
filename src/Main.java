

import Model.*;
import Repository.*;
import Service.*;



public class Main {
    public static void main(String[] args) {
        // Repositories
        CustomerRepository customerRepository = new CustomerRepository();
        ProductRepository productRepository = new ProductRepository();
        OrderRepository orderRepository = new OrderRepository();
        InvoiceRepository invoiceRepository = new InvoiceRepository();

        // Services
        CustomerService customerService = new CustomerService(customerRepository);
        ProductService productService = new ProductService(productRepository);
        OrderService orderService = new OrderService(orderRepository);
        InvoiceService invoiceService = new InvoiceService(invoiceRepository);

        // Sample Data Creation Using Services
        Customer customer = new Customer("John Doe", 12);
        customerService.addCustomer(customer);

        Customer customer2 = new Customer("Cem", 28);
        customerService.addCustomer(customer2);

        Customer customer3 = new Customer("Cem", 35);
        customerService.addCustomer(customer2);


        Product product1 = new Product("Laptop", "Electronics", 1000.0, 10);
        Product product2 = new Product("Smartphone", "Electronics", 500.0, 20);
        Product product3 = new Product("Boat", "Vehicle", 55000.0, 2);
        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);


        Order order = orderService.createOrder(customer);
        orderService.addProductToOrder(order, product1);
        orderService.addProductToOrder(order, product2);

        Order order2 = orderService.createOrder(customer2);
        orderService.addProductToOrder(order2, product1);
        orderService.addProductToOrder(order2, product2);

        Order order3 = orderService.createOrder(customer3);
        orderService.addProductToOrder(order3, product1);
        orderService.addProductToOrder(order3, product2);
        orderService.addProductToOrder(order3, product3);


        Invoice invoice = invoiceService.createInvoice(order);
        String invoiceId = invoice.getId();
        invoiceService.InvoiceDetails(invoiceId);

        Invoice invoice2 = invoiceService.createInvoice(order2);
        String invoiceId2 = invoice2.getId();
        invoiceService.InvoiceDetails(invoiceId2);

        Invoice invoice3 = invoiceService.createInvoice(order3);
        String invoiceId3 = invoice3.getId();
        invoiceService.InvoiceDetails(invoiceId3);


        // Sistemdeki tüm müşterilerin sayısı
        int customerCount = customerService.getCustomerCount();
        System.out.println("\n Total Number of Customers : " + customerCount);


        CustomerService.displayAllCustomers(customerRepository);


        System.out.println("\n all orders \n");
        orderService.getAllOrders();


        System.out.println("\n ---- \n");

        // İsmi Cem olan müşterilerin aldıkları ürün sayısı
        int productCountbyname = orderService.getProductCountForCustomer("Cem");
        System.out.println("Product count for customers : " + productCountbyname);


        // İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarı
        double totalAmountForCustomersWithNameCemBetween25And30 = invoiceService.getTotalAmountForCustomersWithName("Cem");
        System.out.println("Total amount for customers named Cem between the ages of 25 and 30: $" + totalAmountForCustomersWithNameCemBetween25And30);

        // Sistemdeki 1500 TL üzerindeki faturaları listeleyin
        invoiceService.listInvoicesAboveAmount(1500);
    }
    }
