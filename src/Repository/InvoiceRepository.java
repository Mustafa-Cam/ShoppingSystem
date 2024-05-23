package Repository;

import Model.Invoice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceRepository {
    private Map<String, Invoice> invoiceDatabase = new HashMap<>();

    public void addInvoice(Invoice invoice) {
        invoiceDatabase.put(invoice.getId(), invoice);
    }

    public Invoice getInvoice(String id) {
        return invoiceDatabase.get(id);
    }

    public List<Invoice> getAllInvoices() {
        return new ArrayList<>(invoiceDatabase.values());
    }


    // Diğer gerekli işlemler...
}
