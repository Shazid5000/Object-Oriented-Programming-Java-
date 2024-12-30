package shazid.lab5again;
import java.util.Scanner;
public class Lab5again {
 public static double add(double x,double y) {
        double z=x+y;
        return z;    }
 public static double multiply(double number1,double number2) {
        double result=number1*number2;
        return result;    }
 public static double sub(double value1,double value2) {
        double result1;
        if   (value1>value2) {
              result1=value1-value2;
              return result1;        }
        else{ double result2 = value2-value1;
              return result2;    } }
 public static double division(double number1, double number2) {
    double result3;
    if (number1>number2) {
        result3=number1/number2;
        return result3;   }
    else {
        double result4;
        result4=number2/number1;
        return result4;  }}
 public static void main(String[] args) {
     try(Scanner input = new Scanner(System.in)) {
        System.out.println("Enter the first number : ");
        double num1=input.nextDouble();
        System.out.println("Enter the  second number");
        double num2=input.nextDouble();
        System.out.println("""
        What do you want to do ?
        1.Addition 2.Subtraction 3.Multiplication 4.Division """);
        int operation=input.nextInt();
          switch (operation) {
            case 1 -> { double z=add(num1, num2);
                System.out.println("The result is "+z);  }
            case 2 -> { double z=sub(num1, num2);
                System.out.println("The result is "+z);  }
            case 3 -> { double z=multiply(num1, num2);
                System.out.println("The result is "+z);  }
            case 4 -> { double z=division(num1, num2);
                System.out.println("The result is "+z);  }
            default -> System.out.println("Invalid input");  }}}}

