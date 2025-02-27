package classesObjects.level2;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item
    public void addItem(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " " + itemName + "(s) added to cart.");
    }

    // Method to remove an item
    public void removeItem(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough items in cart!");
        }
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display total cost
    public void displayTotalCost() {
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item = new CartItem("Apple", 0.5, 10);
        item.addItem(5);
        item.removeItem(3);
        item.displayTotalCost();
    }
}
