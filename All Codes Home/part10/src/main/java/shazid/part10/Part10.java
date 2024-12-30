package shazid.part10;
class Employee {
String firstName;
String lastName;
double monthlySalary;
public Employee(String fName, String lName, double mS) {
        firstName = fName;
        lastName = lName;
        if (mS > 0) {
        monthlySalary = mS; }}
public String getFirstName() {
        return firstName;}
public void setFirstName(String fName) {
        firstName = fName;}
public String getLastName() {
        return lastName; }
public void setLastName(String lName) {
        lastName = lName; }
public double getMonthlySalary() {
        return monthlySalary; }
public void setMonthlySalary(double monthlyS) {
        if (monthlyS > 0) {
        monthlySalary = monthlyS;  }}
public double getYearlySalary() {
        return monthlySalary * 12; }
public double getRaiseAmount() {
        return monthlySalary * 0.1; }
public void applyRaise() {
        monthlySalary += getRaiseAmount();    }}
public class Part10 {
public static void main(String[] args) {
    Employee employee1 = new Employee("Naeem", "Uddin", 5000);
    Employee employee2 = new Employee("Shazidul", "Alam", 6000);
System.out.println("Yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() +
           " is " + employee1.getYearlySalary());
System.out.println("Yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() +
           " is " + employee2.getYearlySalary());
    employee1.applyRaise();
    employee2.applyRaise();
System.out.println("After 10% raise, yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() +
           " is " + employee1.getYearlySalary());
System.out.println("After 10% raise, yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() +
           " is " + employee2.getYearlySalary());    }}