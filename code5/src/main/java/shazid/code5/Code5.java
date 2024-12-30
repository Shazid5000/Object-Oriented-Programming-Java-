package shazid.code5;
public class Code5 {
    static class Book {
        String purpose;
        int page_no;
        String author;
        int publish_year;
        String genre;   
void setDetails(String a, int b, String c, int d, String e) {
        purpose = a;
        page_no = b;
        author = c;
        publish_year = d;
        genre = e;        }   
void printDetails() {
        System.out.println("\nPurpose: " + purpose);
        System.out.println("Page no: " + page_no);
        System.out.println("Author: " + author);
        System.out.println("Publish Year: " + publish_year);
        System.out.println("Genre: " + genre);    }   }
static class Dictionary extends Book {
int last_Update_year;    
void setDDetails(String a, int b, String c, int d, String e, int f) {
        purpose = a;
        page_no = b;
        author = c;
        publish_year = d;
        genre = e;
        last_Update_year = f;    }        
void printDDetails() {
        System.out.println("\nPurpose: " + purpose);
        System.out.println("Page no: " + page_no);
        System.out.println("Author: " + author);
        System.out.println("Publish Year: " + publish_year);
        System.out.println("Genre: " + genre);
        System.out.println("Last Update Year: " + last_Update_year);}}
 public static void main(String[] args) {
    Book book = new Book();
        book.setDetails("Reading", 1000, "Shazid", 2023, "Horror");
        book.printDetails();      
    Dictionary dictionary = new Dictionary();
        dictionary.setDDetails("Word Meaning", 500, "Naeem", 1998, "Dictionary", 2023);
        dictionary.printDDetails();   }}