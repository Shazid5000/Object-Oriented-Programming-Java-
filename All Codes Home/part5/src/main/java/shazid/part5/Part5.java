package shazid.part5;
import java.util.*;
class Student{
    String name;
    int rollNo;
    String schoolName;
    String collegeName;
    public Student(String Name, int RollNo, String SchoolName, String CollegeName) {
        name = Name;
        rollNo = RollNo;
        schoolName = SchoolName;
        collegeName = CollegeName;    }
public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("School Name: " + schoolName);
        System.out.println("College Name: " + collegeName);    }
public void updateRollNo(int newRollNo) {
        rollNo = newRollNo;   }}
public class Part5 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
// Get details for the first student
    System.out.println("Enter details for Student 1:");
    System.out.print("Enter name: ");
    String name1 = input.nextLine();
    System.out.print("Enter roll number: ");
    int roll1 = input.nextInt();
    input.nextLine();
    System.out.print("Enter school name: ");
    String school1 = input.nextLine();
    System.out.print("Enter college name: ");
    String college1 = input.nextLine();
    Student student1 = new Student(name1, roll1, school1, college1);
// Get details for the second student
    System.out.println("\nEnter details for Student 2:");
    System.out.print("Enter name: ");
    String name2 = input.nextLine();
    System.out.print("Enter roll number: ");
    int roll2 = input.nextInt();
    input.nextLine();
    System.out.print("Enter school name: ");
    String school2 = input.nextLine();
    System.out.print("Enter college name: ");
    String college2 = input.nextLine();
    Student student2 = new Student(name2, roll2, school2, college2);
// Get details for the third student
    System.out.println("\nEnter details for Student 3:");
    System.out.print("Enter name: ");
    String name3 = input.nextLine();
    System.out.print("Enter roll number: ");
    int roll3 = input.nextInt();
    input.nextLine();
    System.out.print("Enter school name: ");
    String school3 = input.nextLine();
    System.out.print("Enter college name: ");
    String college3 = input.nextLine();
    Student student3 = new Student(name3, roll3, school3, college3);
// Print the details for all three students
    System.out.println("\nDetails of Student 1:");
    student1.printInfo();
    System.out.println("\nDetails of Student 2:");
    student2.printInfo();
    System.out.println("\nDetails of Student 3:");
    student3.printInfo();   }}