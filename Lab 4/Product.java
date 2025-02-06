package Upes;

class Product {
    private static int totalProducts = 0;
    private int productId;
    private String productName;
    private String category;
    private double price;

    public Product() {
        this.productId = 0;
        this.productName = "Default Product";
        this.category = "General";
        this.price = 0.0;
        totalProducts++;
    }

    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Method to calculate stock value without discount
    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    // Overloaded method to calculate stock value with discount
    public double calculateStockValue(int quantity, double discountRate) {
        double totalValue = price * quantity;
        double discount = totalValue * (discountRate / 100);
        return totalValue - discount;
    }

    public static void main(String[] args) {
        // Creating multiple product objects
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", "Electronics", 750.50);
        Product p3 = new Product(102, "Smartphone", "Electronics", 500.00);

        // Display total number of products
        Product.displayTotalProducts();

        // Display details of each product
        p1.displayProductInfo();
        System.out.println("Stock Value (5 units): $" + p1.calculateStockValue(5));
        System.out.println("Stock Value (5 units, 10% discount): $" + p1.calculateStockValue(5, 10));
        System.out.println();

        p2.displayProductInfo();
        System.out.println("Stock Value (10 units): $" + p2.calculateStockValue(10));
        System.out.println("Stock Value (10 units, 5% discount): $" + p2.calculateStockValue(10, 5));
        System.out.println();

        p3.displayProductInfo();
        System.out.println("Stock Value (20 units): $" + p3.calculateStockValue(20));
        System.out.println("Stock Value (20 units, 15% discount): $" + p3.calculateStockValue(20, 15));
    }
}
