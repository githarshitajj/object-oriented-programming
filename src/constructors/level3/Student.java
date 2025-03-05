package constructors.level3;

public class Student {
    public int rollNo;
    protected String name;
    private double CGPA;
    Student(){}
    Student(int rollNo, String name, double CGPA) {
        this.rollNo = rollNo;
        this.name = name;
        this.CGPA = CGPA; //this setting the CGPA
        System.out.println("Roll No: " + rollNo + "\nName: " + name + "\nCurrent CGPA: " + CGPA);
    }
//    public double getCGPA(){
//        return CGPA;
//    }
    public void modifyCGPA(){
        this.CGPA = this.CGPA + 0.5;
        System.out.println("New CGPA: " + this.CGPA);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "James", 3.4);
        s1.modifyCGPA();
    }
}
class PostgraduateStudent extends Student {
    String name = "Harshita"; //is it over-ridding?
    public void modifyName() {
        super.name = this.name;
        System.out.println(name);
        //i'll have to make a separate main class for the right application of all of it
    }
}
