package shazid.part8;
class Shape {
    String name;
    double height;
    double width;
    double length;  
    public Shape(String n, double h, double w, double l) {
        name = n;
        height = h;
        width = w;
        length = l;    }  
public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);    }   
public void updateDimensions(double h, double w, double l) {
        height = h;
        width = w;
        length = l;    }}
class Rectangle extends Shape {
    public Rectangle(String name, double height, double width, double length) {
        super(name, height, width, length);    }   
public double getArea() {
        return height * width;    }   
public double getPerimeter() {
        return 2 * (height + width);    }}
class Triangle extends Shape {
public Triangle(String name, double height, double width, double length) {
        super(name, height, width, length);    }   
public double getArea() {
        return 0.5 * height * width;    }
public double getPerimeter() {
        return height + width + length;    }}
public class Part8 {
public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle("Rectangle1", 4, 6, 0);
    Rectangle rectangle2 = new Rectangle("Rectangle2", 3, 5, 0);
    Triangle triangle1 = new Triangle("Triangle1", 5, 7, 8);
    Triangle triangle2 = new Triangle("Triangle2", 6, 9, 10);      
// Print the initial dimensions and area/perimeter of each shape
    System.out.println("Initial Dimensions:");
    rectangle1.printInfo();
    System.out.println("Area: " + rectangle1.getArea());
    System.out.println("Perimeter: " + rectangle1.getPerimeter() + "\n");       
    rectangle2.printInfo();
    System.out.println("Area: " + rectangle2.getArea());
    System.out.println("Perimeter: " + rectangle2.getPerimeter() + "\n");        
    triangle1.printInfo();
    System.out.println("Area: " + triangle1.getArea());
    System.out.println("Perieter: " + triangle1.getPerimeter() + "\n");       
    triangle2.printInfo();
    System.out.println("Area: " + triangle2.getArea());
    System.out.println("Perameter: " + triangle2.getPerimeter() + "\n");       
// Update the dimensions of Rectangle1 and Triangle2
    rectangle1.updateDimensions(5, 8, 0);
    triangle2.updateDimensions(8, 12, 15);        
// Print the updated dimensions and area/perimeter of each shape
    System.out.println("Updated Dimensions:");
    rectangle1.printInfo();
    System.out.println("Area: " + rectangle1.getArea());
    System.out.println("Perimeter: " + rectangle1.getPerimeter() + "\n");      
    triangle2.printInfo();
    System.out.println("Area: " + triangle2.getArea());
    System.out.println("Perimeter: " + triangle2.getPerimeter() + "\n");  }}