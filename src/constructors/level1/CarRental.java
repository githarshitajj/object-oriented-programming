package constructors.level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    int totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        System.out.println("Name: " + customerName + "\nCar Rented: " + carModel + "\nRenting for no. of days: " + rentalDays);
        totalCost = 2000 * rentalDays;
        //System.out.println("Total cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental car1 = new CarRental("Dishank Bishnoi", "Maruti Suzuki Breeza", 5);
        System.out.println("Cost of renting: " + car1.totalCost);
    }
}
