package Upes.Lab_6;

import java.util.Scanner;

// Main.java
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Answer 1");
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.println("Total without GST: " + amount);
        Invoice invoice = new Invoice();
        invoice.displayGST(); // Demonstrates the final method
        System.out.println("Total with GST: " + invoice.calculateTotalWithTax(amount));

        System.out.println("Answer 2");
        SecuritySystem security = new SecuritySystem();
        System.out.println("Enter username and password: ");
        security.authenticateUser(input.next(), input.next());
    }
}
