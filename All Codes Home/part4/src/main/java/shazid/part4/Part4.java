package shazid.part4;
public class Part4 { 
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;}}
        return true;  }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;    }}
System.out.println("Total prime numbers found: " + count);
System.out.println("Total numbers tested: " + (10000 - 2));}}