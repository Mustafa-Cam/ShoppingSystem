package Service;

import Model.Customer;
import Model.Invoice;
import Model.Order;
import Model.Product;
import Repository.InvoiceRepository;

import java.util.List;

public class InvoiceService {
    private InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void addInvoice(Invoice invoice) {
        invoiceRepository.addInvoice(invoice);
    }

    public Invoice createInvoice(Order order) {

        double totalAmount = order.getProducts().stream().mapToDouble(Product::getPrice).sum();
        Invoice invoice = new Invoice(order, totalAmount);
        invoiceRepository.addInvoice(invoice);
        return invoice;
    }

    public Invoice getInvoice(String id) {
        return invoiceRepository.getInvoice(id);
    }

    public void InvoiceDetails(String invoiceId) {
        Invoice invoice = getInvoice(invoiceId);
        if (invoice == null) {
            System.out.println("Invoice not found!");
            return;
        }

        Order order = invoice.getOrder();
        System.out.println("Invoice ID: " + invoice.getId());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Order ID: " + order.getId());
        System.out.println("Products in Order:");
        for (Product p : order.getProducts()) {
            System.out.println(" - " + p.getName() + ": $" + p.getPrice());
        }
        System.out.println("Total Amount: $" + invoice.getTotalAmount());
    }

    public double getTotalAmountForCustomersWithName(String name) {
        List<Invoice> invoices = invoiceRepository.getAllInvoices();
        double totalAmount = 0;
        for (Invoice invoice : invoices) {
            Order order = invoice.getOrder();
            Customer customer = order.getCustomer();
            if (customer.getName().equals(name) && customer.getAge() > 25 && customer.getAge() < 30) {
                totalAmount += invoice.getTotalAmount();
            }
        }
        return totalAmount;
    }

    public void listInvoicesAboveAmount(int amount) {
        List<Invoice> invoices = invoiceRepository.getAllInvoices();
        System.out.println("Invoices above "+amount+"TL:");
        for (Invoice invoice : invoices) {
            if (invoice.getTotalAmount() > amount) {
                System.out.println("Invoice ID: " + invoice.getId());
                System.out.println("Total Amount: $" + invoice.getTotalAmount());
                System.out.println("-----------------------------------------");
            }
        }
    }



}
