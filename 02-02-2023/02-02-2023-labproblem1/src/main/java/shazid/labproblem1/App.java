//Write a java code with integer, constant, float value, double value, string, character, array.
package shazid.labproblem1;
import java.util.Scanner;
public class App {
  public static final int CONSTANT = 100;
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    int num1;
    float num2;
    double num3;
    String name;
    char letter;
    double[] doubleArray = new double[5];
    char[] charArray = new char[5];
    float[] floatArray = new float[5];

    System.out.println("Enter an integer: ");
    num1 = sc.nextInt();
    System.out.println("Enter a float value: ");
    num2 = sc.nextFloat();
    System.out.println("Enter a double value: ");
    num3 = sc.nextDouble();
    sc.nextLine();
    System.out.println("Enter a string: ");
    name = sc.nextLine();
    System.out.println("Enter a character: ");
    letter = sc.next().charAt(0);
    System.out.println("Enter 5 double values for an array: ");
    for (int i = 0; i < 5; i++) {
      doubleArray[i] = sc.nextDouble();
    }
    System.out.println("Enter 5 characters for an array: ");
    sc.nextLine();
    for (int i = 0; i < 5; i++) {
      charArray[i] = sc.nextLine().charAt(0);
    }
    System.out.println("Enter 5 float values for an array: ");
    for (int i = 0; i < 5; i++) {
      floatArray[i] = sc.nextFloat();
    }

    System.out.println("\nInteger value: " + num1);
    System.out.println("Float value: " + num2);
    System.out.println("Double value: " + num3);
    System.out.println("String value: " + name);
    System.out.println("Character value: " + letter);
    System.out.print("Double array values: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(doubleArray[i] + " ");
    }
    System.out.println();
    System.out.print("Char array values: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(charArray[i] + " ");
    }
    System.out.println();
    System.out.print("Float array values: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(floatArray[i] + " ");
    }

  }
}