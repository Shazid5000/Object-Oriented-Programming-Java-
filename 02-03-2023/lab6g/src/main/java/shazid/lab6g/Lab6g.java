package shazid.lab6g;
public class Lab6g {
public static void main(String[] args) {
    int i;
    int array1[]=new int[20];
      array1[0]=50;
      array1[1]=70;
    int array2[]=new int [20];
      array2[0]=75;
      array2[1]=69;
    int arraysum[]=new int [20];
         for( i=0; i<=1; i++)
        {arraysum[i]=array1[i]+array2[i];}
         for(i=0; i<=1; i++)
        {
            System.out.println("The summation of array"+(i+1)+" is "+arraysum[i]);
        } } }