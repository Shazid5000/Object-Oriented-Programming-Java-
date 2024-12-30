package shazid.lecture11page7;
abstract class Shape{
    abstract void draw();
    void test(){
        System.out.println("Test......");
    }}
class Rectangle extends Shape{
    void draw(){
    System.out.println("drawing rectangle");}
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle");
}}
public class Lecture11page7 {

    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.test();   }}