package constructors.level2;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts; //static instance variable is a class variable as it does not belong to a particular object
    public Product(){  //whenever any object of the product class is made it will be considered a new product
     totalProducts++;
    }
    public void displayProductDetails(String productName, double price) {
        this.productName = productName;
        this.price = price;
        System.out.println("Product: " + productName + "\nPrice: " + price);
    }
    public static int displayTotalProducts() {
        return totalProducts;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        product1.displayProductDetails("Book", 700);
        int totalProduct = displayTotalProducts();
        System.out.println("Total products: " + totalProduct);
    }
}
