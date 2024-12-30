package shazid.code4;
class Student {
    String name;
    int id;
    String covered_credit;
    String SchoolName;
Student() { name = "Mondira";
            id = 0;
            covered_credit = "0";
            SchoolName = "SFGV";  }
Student(String n, int i, String c, String s) {
        name = n;
        id = i;
        covered_credit = c;
        SchoolName = s;  }
public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Covered Credit: " + covered_credit);
        System.out.println("School Name: " + SchoolName);    }
public void updateID(int newID) {
        id = newID;    }}
public class Code4 {
    public static void main(String[] args) {
        Student s1 = new Student("Shazid", 9, "50", "Shazid School");
        System.out.println("Student Information:");
    s1.printDetails();
Student s2 = new Student();
        s2.printDetails();
Student s3 = new Student();
        s3.printDetails();
        // Update the ID of s2
 s2.updateID(10);
       System.out.println("\nAfter updating ID:");
       s2.printDetails();  }}