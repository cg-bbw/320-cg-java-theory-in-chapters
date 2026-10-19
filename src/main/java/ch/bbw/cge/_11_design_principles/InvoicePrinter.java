package ch.bbw.cge._11_design_principles;

public class InvoicePrinter {

    public void print(Invoice invoice, double total) {
        System.out.println("Invoice for " + invoice.getProductName());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Total: CHF " + total);
    }
}
