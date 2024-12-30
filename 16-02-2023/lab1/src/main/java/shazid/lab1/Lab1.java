package shazid.lab1;
public class Lab1 {
public static void main(String[] args) {
    //Main method
    int i= 5;
    int j= 2;
    int k=max(i,j);
    System.out.println(" The maximum of " +i+" and " +j+" is " +k);
    }
    
    // Return the max of two numbers
    public static int max(int num1, int num2){
        int result;
    if(num1>num2)
    {   result= num1;}
    else
    {   result= num2;}
    return result;
    }}