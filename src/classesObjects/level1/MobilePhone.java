package classesObjects.level1;

class MobilePhone {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

    }

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("iphone", "iphone", 10.0);
        mobilePhone.displayDetails();
    }
}
