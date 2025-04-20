import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Store!!!!");

        Book b1 = new Book("Let us C","Yashwant Kanetkar","45fgh6984",1);
        Book b2 = new Book("Let us C++","Yashwant Kanetkar","3dfg561",2);
        Book b3 = new Book("The Indian Economy","Vivek Singh","4456g56h",1);

        Book.getTotalBooks();
        b1.borrowBook();
        Book.getTotalBooks();
        b1.borrowBook();
        Book.getTotalBooks();
        b2.borrowBook();
        Book.getTotalBooks();
        b2.borrowBook();
        Book.getTotalBooks();
        b1.returnBook();
        Book.getTotalBooks();
        b3.borrowBook();
        Book.getTotalBooks();
        b3.borrowBook();
        Book.getTotalBooks();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("NOW FINAL METHOD IS CALLING");
        Book.getTotalBooks();
    }
}