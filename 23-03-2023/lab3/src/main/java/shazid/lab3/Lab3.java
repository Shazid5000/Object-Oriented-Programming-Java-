//Create a student class (with shortcut i for 10 students) with name, id, school name, college name and functions update id, set variable.
package shazid.lab3;
import java.util.Scanner;
public class Lab3 {
    static class Student {
        String name;
        int id;
        String schoolName;
        String collegeName;    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of students:");
        Student[] s = new Student[10];
    for (int i = 0; i < 10; i++) {
          s[i] = new Student();
          System.out.println("Enter information of Student " + (i + 1) + ":");
          s[i].name = in.nextLine();
          s[i].id = Integer.parseInt(in.nextLine());
          s[i].schoolName = in.nextLine();
          s[i].collegeName = in.nextLine();
        }    }   }
