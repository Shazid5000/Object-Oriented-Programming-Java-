// Create a student class with name, id, school name, colege name and functions update id, set variable.
package shazid.lab1;

class Student {
    int id;
    String name;
    String schoolName;
    String collegeName;

    public Student(int id, String name, String schoolName, String collegeName) {
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
        this.collegeName = collegeName;
    }
    public void updateId(int newId) {
        this.id = newId;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public String getCollegeName() {
        return collegeName;
    }}
public class Lab1 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Shazid", "Agradut Bidyaniketon High School", " Dania College ");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getId());
        System.out.println("School Name: " + student1.getSchoolName());
        System.out.println("College Name: " + student1.getCollegeName());
        student1.updateId(2);
        student1.setSchoolName("NDUB");
        System.out.println("\nUpdated Student ID: " + student1.getId());
        System.out.println("Updated School Name: " + student1.getSchoolName());
    }}
// Write this code again without using (this.).