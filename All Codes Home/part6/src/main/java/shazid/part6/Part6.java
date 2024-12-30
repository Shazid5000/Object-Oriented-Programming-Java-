package shazid.part6;
import java.util.*;
class Plant {
    String name;
    double size;
    String type;
    String primaryColor;
    String weather;
    String season;
    double price;
Plant(String plantname, double plantsize, String planttype, String primaryclr, String weathertype, String plantseason, double plantprice) {
        name = plantname;
        size = plantsize;
        type = planttype;
        primaryColor = primaryclr;
        weather = weathertype;
        season = plantseason;
        price = plantprice;    }
public void printPlant() {
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Primary Color: " + primaryColor);
        System.out.println("Weather: " + weather);
        System.out.println("Season: " + season);
        System.out.println("Price: " + price);    }
public void updatePlant(String n, double s, String t, String pColor, String wr, String sn, double pr) {
        name = n;
        size = s;
        type = t;
        primaryColor = pColor;
        weather = wr;
        season = sn;
        price = pr;   }}
public class Part6 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of orange:");
        double value1 = sc.nextDouble();
        System.out.print("Enter the price of tomato:");
        double value2 = sc.nextDouble();
        System.out.print("Enter the price of pine tree:");
        double value3 = sc.nextDouble();
        Plant orange = new Plant("Orange", 4.5, "Fruit", "Orange", "Sunny", "Summer", value1);
        Plant tomato = new Plant("Tomato", 2.5, "Vegetable", "Red", "Sunny", "Summer", value2);
        Plant pineTree = new Plant("Pine Tree", 60.0, "Tree", "Green", "Cold", "Winter", value3);
System.out.println("Before Update:");
        orange.printPlant();
        tomato.printPlant();
        pineTree.printPlant();
        orange.updatePlant("Sweet Orange", 5.5, "Fruit", "Orange", "Sunny", "Summer",value1);
        tomato.updatePlant("Cherry Tomato", 1.5, "Vegetable", "Red", "Sunny", "Summer", value2);
        pineTree.updatePlant("Christmas Tree", 72.0, "Tree", "Green", "Cold", "Winter", value3);            
System.out.println("\nAfter Update:");
        orange.printPlant();
        tomato.printPlant();
        pineTree.printPlant(); }}