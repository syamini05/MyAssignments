package week1.day2;

public class Library {
        public void addBook(String bookTitle){
            System.err.println("The Book "+bookTitle+" is added successfully");
        }
        public void issueBook(){
           System.out.println("Book issued successfully");
        }
public static void main(String[] args){
    Library obj = new Library();
        obj.addBook("Positive Attitude");
        obj.issueBook();
    }
}