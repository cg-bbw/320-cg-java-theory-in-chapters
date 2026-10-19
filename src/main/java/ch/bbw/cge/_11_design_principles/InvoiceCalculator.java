package ch.bbw.cge._11_design_principles;

public class InvoiceCalculator {

    // Calculation is separated from presentation so each class has a clearer responsibility.
    public double calculateTotal(Invoice invoice) {
        return invoice.getQuantity() * invoice.getUnitPrice();
    }
}
