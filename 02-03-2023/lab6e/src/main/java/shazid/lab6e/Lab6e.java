package shazid.lab6e;
import java.util.Scanner;
public class Lab6e {
public static void main(String[] args) {
    Scanner number=new Scanner(System.in);
     int array[][]=new int[10][10];
      System.out.println("*****Welcome dear students*****\n");
      System.out.print("Enter the number of students\n");
     int ID=number.nextInt();
      System.out.print("Enter the number of subjects you have\n");
     int subjects=number.nextInt();
        for(int i=1;i<=ID;i++)
        {
        for(int j=1;j<=subjects;j++)
        {
      System.out.print("Enter the number of "+ i +"students and "+ j +"subject \n");
               (array[i][j])=number.nextInt();
        }}
        for(int i=1;i<=ID;i++) {
        for(int j=1;j<=subjects;j++)
        {
      System.out.print(array[i][j]);
      System.out.print(" ");         }
      System.out.print("\n");  }}}