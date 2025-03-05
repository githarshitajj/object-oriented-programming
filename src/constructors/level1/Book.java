package constructors.level1;

public class Book {
    private String title;
    private String author;
    private double price;
    Book(){
        System.out.println("This is the Book class");
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("The book's name is " + title + " written by " + author + " and is sold at " + price);
    }
    public static void main(String[] args) {
        Book book = new Book("1984", "Goerge Orwell", 1000.56);
        new Book();

    }
}
