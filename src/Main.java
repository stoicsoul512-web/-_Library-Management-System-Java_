import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LibraryManager lm = new LibraryManager();
        while (true) {
            System.out.println("\n1. Add Book  2. View Books  3. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter id, title, author: ");
                int id = sc.nextInt();
                String title = sc.next();
                String author = sc.next();
                lm.addBook(new Book(id, title, author));
            } else if (ch == 2) {
                lm.viewBooks();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}
