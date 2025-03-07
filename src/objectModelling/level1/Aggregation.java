package objectModelling.level1;

import java.util.List;

class Book{
    private String title;
    private String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
class Library{
    private String LibraryName;
    private List<Book> books;
    public Library(String LibraryName){
        this.LibraryName = LibraryName;
    }
    public String getLibraryName() {
        return LibraryName;
    }
}

public class Aggregation {
    public static void main(String[] args) {

    }
}
