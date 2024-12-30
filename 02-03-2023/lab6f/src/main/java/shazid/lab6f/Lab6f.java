package shazid.lab6f;
import java.util.Scanner;
public class Lab6f {
public static void main(String[] args) {
    int array[][][]=new int [2][5][7];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
    int lines=input.nextInt();
      for(int i=1; i<=lines; i++)
      {
      for(int j=1; j<=3; j++)
      {
      for(int k=1;k<=3; k++)
      {
        System.out.print("* ");
      }
        System.out.print("\n");
      }
        System.out.print("\n");     }}}