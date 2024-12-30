package shazid.part3;
  public class Part3 {
    public static boolean isPerfect(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;}}
                return sum == num; }
public static void main(String[] args) {
  for (int i = 1; i <= 1000; i++) {
    if (isPerfect(i)) {
        System.out.print(i + " = 1");
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                System.out.print(" + " + j);}}
                System.out.println();}}}}