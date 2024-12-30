package shazid.lab5;
public class Lab5 {
public static void main(String[] args) {
    int i=22;
    int j=11;
    int a=add(i,j);
    int s=sub(i,j);
    int m=multiplication(i,j); 
    int d=division(i,j);
 System.out.println("The addition of " +i+ " and "+j+ " is "+a);
 System.out.println("The subtraction of " +i+ " and "+j+ " is "+s);
 System.out.println("The multiplication of " +i+ " and "+j+ " is "+m);
 System.out.println("The division of " +i+ " and "+j+ " is "+d); }
    public static int add(int num1, int num2){
        int add;
        add=num1+num2;
        return add; }
    public static int sub(int num1, int num2){
        int sub;
        sub=num1-num2;
        return sub; }
    public static int multiplication(int num1, int num2){
        int multiplication;
        multiplication=num1*num2;
        return multiplication; }
    public static int division(int num1, int num2){
        int division;
        division=num1/num2;
        return division;   }}