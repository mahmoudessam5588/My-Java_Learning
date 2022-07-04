package Invoicing.Service;

import Invoicing.Module.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> generateInvoices();
    static  InvoiceService build(){
        return new InvoiceServiceImpl();
    }
}
