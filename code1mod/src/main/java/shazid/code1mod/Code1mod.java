package shazid.code1mod;
class Student {
    String name;
    int id;
    String schoolName;
    String collegeName;
public void setDetails(String n, int i, String sn, String cn) {
        name = n;
        id = i;
        schoolName = sn;
        collegeName = cn;    }
public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("School Name: " + schoolName);
        System.out.println("College Name: " + collegeName);  }}
public class Code1mod {
    public static void main(String[] args) {
Student s1 = new Student();
    System.out.println("Student Information:");
    s1.setDetails("Shazid", 9, "Shksc", "Dania College");
    s1.printDetails();
Student s2 = new Student();
    System.out.println("\nStudent Information:");
    s2.setDetails("Jabir", 2, "Jabir School", "Jabir College");
    s2.printDetails();
Student s3 = new Student();
    System.out.println("\nStudent Information:");
    s3.setDetails("Sotej", 1, "Sotej School", "Sotej College");
    s3.printDetails();    }}