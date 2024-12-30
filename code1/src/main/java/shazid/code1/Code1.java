//Build a student class of 3 students using 3 objects, give name. id,
//covered_credit, College name.
package shazid.code1;
class Student {
    String name;
    int id;
    int covered_credit;
    String schoolname;}
public class Code1 {
    public static void main(String[] args) {
Student s1 = new Student(); // s1 is the object.
      System.out.println("Student Information:");
      s1.name = "Shazid";
      s1.id = 9;
      s1.covered_credit = 50;
      s1.schoolname = "Shazid School";
      System.out.println("Name: " + s1.name);
      System.out.println("ID: " + s1.id);
      System.out.println("covered_credit: " + s1.covered_credit);
      System.out.println("School Name: " + s1.schoolname);
Student s2 = new Student();// s2 is the object.
      System.out.println("\nStudent Information:");
      s2.name = "Jabir";
      s2.id = 2;
      s2.covered_credit = 55;
      s2.schoolname = "Jabir School";
      System.out.println("Name: " + s2.name);
      System.out.println("ID: " + s2.id);
      System.out.println("covered_credit: " + s2.covered_credit);
      System.out.println("School Name: " + s2.schoolname);
Student s3 = new Student();// s3 is the object.
      System.out.println("\nStudent Information:");
      s3.name = "Sotej";
      s3.id = 1;
      s3.covered_credit = 60;
      s3.schoolname = "Sotej School";
      System.out.println("Name: " + s3.name);
      System.out.println("ID: " + s3.id);
      System.out.println("covered_credit: " + s3.covered_credit);
      System.out.println("School Name: " + s3.schoolname);   }}