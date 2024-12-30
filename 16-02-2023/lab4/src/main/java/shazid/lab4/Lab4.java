package shazid.lab4;
import java.util.Scanner;
public class Lab4 {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the value");
    int value=input.nextInt();    
    marks(value);}
     public static void marks(int result){
     if(result>=80){
     System.out.println("A+");}
     else if(result>=70){
     System.out.println("B+");}
     else if(result>=60){
     System.out.println("C+");}
     else if(result>=50){
     System.out.println("D+");}
     else if(result>=40){
     System.out.println("Pass");}}}