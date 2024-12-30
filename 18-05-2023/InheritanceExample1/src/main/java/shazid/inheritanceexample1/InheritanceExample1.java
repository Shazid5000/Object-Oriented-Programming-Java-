package shazid.inheritanceexample1;
class BaseClass{
    public void doSomething(){
        System.out.println("BaseClass doSomething");
    }
}
class SubClass extends BaseClass{
    
}
public class InheritanceExample1 {

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.doSomething();
        BaseClass bc = new SubClass();
        bc.doSomething();
    }
}
