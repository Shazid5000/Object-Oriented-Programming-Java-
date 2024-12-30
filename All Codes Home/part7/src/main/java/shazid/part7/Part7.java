package shazid.part7;
public class Part7 {
public static void main(String[] args) {
    Triangle triangle = new Triangle("Triangle", 5, 10);
    Rectangle rectangle = new Rectangle("Rectangle", 8, 12);
    Square square = new Square("Square", 6);
// Print initial values of variables
    System.out.println("Initial values:");
    triangle.printInfo();
    rectangle.printInfo();
    square.printInfo();
// Update variables
    triangle.updateHeight(7);
    rectangle.updateWidth(15);
    square.updateSide(9);
// Print updated values of variables
    System.out.println("\nUpdated values:");
    triangle.printInfo();
    rectangle.printInfo();
    square.printInfo();    }}
class Shape {
    String name;
    double height;
    double width;
    double length;
public Shape(String n, double h, double w, double l) {
        name = n;
        height = h;
        width = w;
        length = l;   }
public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);   }}
class Triangle extends Shape {
public Triangle(String name, double height, double width) {
        super(name, height, width, 0);  }
public void updateHeight(double newHeight) {
        height = newHeight;    }
public void updateWidth(double newWidth) {
        width = newWidth;    }}
class Rectangle extends Shape {
public Rectangle(String name, double height, double width) {
        super(name, height, width, 0); }
public void updateHeight(double newHeight) {
        height = newHeight;    }
public void updateWidth(double newWidth) {
        width = newWidth;    }}
class Square extends Shape {
    public Square(String name, double side) {
        super(name, side, side, 0); }
public void updateSide(double newSide) {
        height = newSide;
        width = newSide;   }}