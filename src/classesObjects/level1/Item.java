package classesObjects.level1;

class Item {
    // Attributes
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("classesObjects.level1.Item Details:");
        System.out.println("classesObjects.level1.Item Code: " + itemCode);
        System.out.println("classesObjects.level1.Item Name: " + itemName);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the classesObjects.level1.Item class
    public static void main(String[] args) {
        Item item = new Item("I123", "Laptop", 999.99);
        item.displayDetails();
        System.out.println("Total Cost for 3 items: $" + String.format("%.2f", item.calculateTotalCost(3)));
    }
}
