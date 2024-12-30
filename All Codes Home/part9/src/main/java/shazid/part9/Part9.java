package shazid.part9;
class Vehicle {
    String name;
    String color;
    double xPosition;
    double yPosition;
    double speed;
public Vehicle(String n, String c, double xPos, double yPos, double spd) {
        name = n;
        color = c;
        xPosition = xPos;
        yPosition = yPos;
        speed = spd;    }
public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
        System.out.println("Speed: " + speed + " mph");    }
public void updatePosition(double newX, double newY) {
        xPosition = newX;
        yPosition = newY;    }
public double findSpeed() {
        return speed;    }
public void updateSpeed(double newSpeed) {
        speed = newSpeed;    }}
public class Part9 {
    public static void main(String[] args) {
// create a vehicle object
        Vehicle car = new Vehicle("Car", "Red", 0, 0, 60);
// print the initial information
        System.out.println("Initial Information:");
        car.printInfo();
// update the position of the vehicle
        car.updatePosition(10, 20);
// print the updated information
        System.out.println("\nUpdated Information:");
        car.printInfo();
// find the speed of the vehicle
        double speed = car.findSpeed();
        System.out.println("\nSpeed: " + speed + " mph");
// update the speed of the vehicle
        car.updateSpeed(80);
// print the updated information
        System.out.println("\nUpdated Information:");
        car.printInfo();  }}