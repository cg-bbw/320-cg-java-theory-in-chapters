package ch.bbw.cge._11_design_principles;

public class Main {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Keyboard", 2, 79.90);
        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter();

        double total = calculator.calculateTotal(invoice);
        printer.print(invoice, total);
    }
}
