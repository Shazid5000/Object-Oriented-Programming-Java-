//Create a student class with name, id, school name, colege name and functions update id, set variable.
package shazid.lab2;
class student {
    String name;
    int id;
    String school_name;
    String college_name;}
public class Lab2 {
    public static void main(String[] args) {
    student S1 = new student(); //s1 is the object.
System.out.println("Student Informations :");
    S1.name = "Shazid";
    S1.id = 9;
    S1.school_name = "Shksc";
    S1.college_name = "Dania College";
    System.out.println("The name is "+S1.name);
    System.out.println("The id is "+S1.id);
    System.out.println("School name is "+S1.school_name);
    System.out.println("College name is "+S1.college_name);
    student S2 = new student();
System.out.println("Student Informations :");
    S2.name = "Jabir";
    S2.id = 2;
    S2.school_name = "Jabir School";
    S2.college_name = "Jabir College";
    System.out.println("The name is "+S2.name);
    System.out.println("The id is "+S2.id);
    System.out.println("School name is "+S2.school_name);
    System.out.println("College name is "+S2.college_name);
    student S3 = new student();
System.out.println("Student Informations :");
    S3.name = "Sotej";
    S3.id = 1;
    S3.school_name = "Sotej School";
    S3.college_name = "Sotej College";
    System.out.println("The name is "+S3.name);
    System.out.println("The id is "+S3.id);
    System.out.println("School name is "+S3.school_name);
    System.out.println("College name is "+S3.college_name);
    }}