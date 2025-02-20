package Upes.Lab_6.ECommerce;

public class Product {
    private String name ;
    private double price;
    private int stock;
    public Product(String name,double price,int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public void getProductDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price:" + price);
        System.out.println("Stock: " + stock);
    }
    protected void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
        System.out.println("Discount applied! New Price: $" + price);
    }
    void updateStock(int newStock) {
        this.stock = newStock;
        System.out.println("Stock updated: " + stock);
    }
    private void calculateProfit() {
        double profit = price * 0.35;
        System.out.println("Profit: $" + profit);
    }
}
