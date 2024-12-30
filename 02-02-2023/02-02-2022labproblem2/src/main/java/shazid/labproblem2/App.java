package shazid.labproblem2;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    double a, b, c;
    double x;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a: ");
    a = sc.nextDouble();
    System.out.println("Enter value of b: ");
    b = sc.nextDouble();
    System.out.println("Enter value of c: ");
    c = sc.nextDouble();
    x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    System.out.println("The value of x is: " + x);
  }}