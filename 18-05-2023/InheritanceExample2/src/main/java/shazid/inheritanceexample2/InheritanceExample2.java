package shazid.inheritanceexample2;
class BaseClass{
    public void doSomething()	{
System.out.println("BaseClass doSomething");
    }}
class SubClass extends BaseClass{
    public void doSomething()    	{
        System.out.println("SubClass doSomething");
    }}
public class InheritanceExample2 {

public static void main(String args[])    {
        SubClass sc = new SubClass();
        sc.doSomething();
        BaseClass bc = new SubClass();
        bc.doSomething();   }}