package Upes.Lab_6;

// TaxCalculator.java
class TaxCalculator {
    // Final variable to ensure GST rate remains unchanged
    protected final double GST_RATE = 18.0;

    // Final method to display GST rate
    public final void displayGST() {
        System.out.println("GST Rate: " + GST_RATE + "%");
    }
}

// Invoice.java
class Invoice extends TaxCalculator {
    // Method to calculate total amount after applying GST
    public double calculateTotalWithTax(double amount) {
        return amount + (amount * GST_RATE / 100);
    }
}
