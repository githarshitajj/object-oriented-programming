package classesObjects.level1;

class Employee {
    // Attributes
    private String name;
    private String id;
    private double salary;

    // Constructor to initialize the attributes
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("classesObjects.level1.Employee Name: " + name);
        System.out.println("classesObjects.level1.Employee ID: " + id);
        System.out.println("classesObjects.level1.Employee Salary: $" + String.format("%.2f", salary));
    }

    // Main method to test the classesObjects.level1.Employee class
    public static void main(String[] args) {
        // Create an instance of the classesObjects.level1.Employee class
        Employee emp1 = new Employee("John Doe", "E12345", 75000.00);

        // Display the employee details
        emp1.displayDetails();
    }
}