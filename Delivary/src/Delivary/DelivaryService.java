package Delivary;

import Invoicing.Module.Invoice;
import Invoicing.Service.InvoiceService;

import java.util.List;

public class DelivaryService {
    private final InvoiceService  service = InvoiceService.build();

    public  void  deliver(){
        List<Invoice> invoices = service.generateInvoices();
            invoices.forEach(System.out::println);

    }

    }

