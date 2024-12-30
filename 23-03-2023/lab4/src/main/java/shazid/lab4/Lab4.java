// Make a plant class for 5 plants and store their name, color, season, size and print all the details.
package shazid.lab4;
class Plant {
    String name;
    String color;
    String season;
    String size;}
public class Lab4 {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Rose";
        plant1.color = "Red";
        plant1.season = "Spring";
        plant1.size = "Medium";

        Plant plant2 = new Plant();
        plant2.name = "Sunflower";
        plant2.color = "Yellow";
        plant2.season = "Summer";
        plant2.size = "Large";

        Plant plant3 = new Plant();
        plant3.name = "Tulip";
        plant3.color = "Pink";
        plant3.season = "Spring";
        plant3.size = "Small";

        Plant plant4 = new Plant();
        plant4.name = "Lavender";
        plant4.color = "Purple";
        plant4.season = "Summer";
        plant4.size = "Medium";

        Plant plant5 = new Plant();
        plant5.name = "Maple Tree";
        plant5.color = "Orange";
        plant5.season = "Fall";
        plant5.size = "Large";

        System.out.println("Details of Plant 1:");
        System.out.println("Name: " + plant1.name);
        System.out.println("Color: " + plant1.color);
        System.out.println("Season: " + plant1.season);
        System.out.println("Size: " + plant1.size);

        System.out.println("Details of Plant 2:");
        System.out.println("Name: " + plant2.name);
        System.out.println("Color: " + plant2.color);
        System.out.println("Season: " + plant2.season);
        System.out.println("Size: " + plant2.size);

        System.out.println("Details of Plant 3:");
        System.out.println("Name: " + plant3.name);
        System.out.println("Color: " + plant3.color);
        System.out.println("Season: " + plant3.season);
        System.out.println("Size: " + plant3.size);

        System.out.println("Details of Plant 4:");
        System.out.println("Name: " + plant4.name);
        System.out.println("Color: " + plant4.color);
        System.out.println("Season: " + plant4.season);
        System.out.println("Size: " + plant4.size);

        System.out.println("Details of Plant 5:");
        System.out.println("Name: " + plant5.name);
        System.out.println("Color: " + plant5.color);
        System.out.println("Season: " + plant5.season);
        System.out.println("Size: " + plant5.size);   }}