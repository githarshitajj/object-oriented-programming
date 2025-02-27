package classesObjects.level1;

class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("classesObjects.level1.Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    // Main method to test the classesObjects.level1.Book class
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
        book.displayDetails();
    }
}
