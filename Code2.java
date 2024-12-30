package shazid.code2;
class Student {
    String name;
    int id;
    String covered_credit;
    String SchoolName;
Student (String n, int i, String c, String s) {
       name = n;
       id = i;
       covered_credit = c;
       SchoolName = s;  }
public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("covered_credit: " + covered_credit);
    System.out.println("School Name: " + SchoolName);   }}
public class Code2 {
    public static void main(String[] args) {
Student s1 = new Student("Shazid", 9, "50", "Shazid School");
   System.out.println("Student Information:");
   s1.printDetails();
Student s2 = new Student("Jabir", 2, "55", "Jabir School");
   System.out.println("\nStudent Information:");
   s2.printDetails();
Student s3 = new Student("Sotej", 1, "60", "Sotej School");
    System.out.println("\nStudent Information:");
    s3.printDetails();    }}