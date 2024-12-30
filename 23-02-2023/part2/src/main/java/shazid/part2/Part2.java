package shazid.part2;
import java.util.Scanner;
public class Part2 {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int Int = scanner.nextInt();
        
        System.out.print("Enter a double: ");
        double Double = scanner.nextDouble();
        
        System.out.print("Enter a float: ");
        float Float = scanner.nextFloat();
        
        System.out.print("Enter a character: ");
        char Char = scanner.next().charAt(0);
        
        System.out.print("Enter a string: ");
        String String = scanner.next();
        
        System.out.print("Enter a short: ");
        short Short = scanner.nextShort();
        
        System.out.print("Enter a long: ");
        long Long = scanner.nextLong();
        
        System.out.print("Enter a boolean (true/false): ");
        boolean Boolean = scanner.nextBoolean();
        
        System.out.println("Int = " + Int);
        System.out.println("Double = " + Double);
        System.out.println("Float = " + Float);
        System.out.println("Char = " + Char);
        System.out.println("String = " + String);
        System.out.println("Short = " + Short);
        System.out.println("Long = " + Long);
        System.out.println("Boolean = " + Boolean);     }}