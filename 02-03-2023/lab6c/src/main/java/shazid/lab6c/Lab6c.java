package shazid.lab6c;
import java.util.Scanner;
public class Lab6c {
public static void main(String[] args) {
    int i;
Scanner input= new Scanner(System.in);        
      System.out.println("Enter the array size : ");
    int size=input.nextInt();
      
    int array[]=new int [size];        
       for( i=0; i<size; i++)
    { System.out.println("Enter the "+i+" number : ");
            array[i]=input.nextInt();        }
       for( i=0; i<size; i++)
    { System.out.println("The "+i+" number is "+array[i]);  }}}