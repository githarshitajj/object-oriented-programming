package classesObjects.level1;

class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    public void displayDetails() {
        System.out.println("classesObjects.level1.Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", calculateCircumference()));
    }

    // Main method to test the classesObjects.level1.Circle class
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayDetails();
    }
}