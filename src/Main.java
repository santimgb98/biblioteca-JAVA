import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        var enterToProgram = "inside";
        while(enterToProgram == "inside"){
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------");
            System.out.println("LIBRARY MENU. Select an option: ");
            System.out.println("--------------------------------");
            System.out.println("1. Register book");
            System.out.println("2. Register user");
            System.out.println("3. Lend book");
            System.out.println("4. Return book");
            System.out.println("5. List users");
            System.out.println("6. List books");
            System.out.println("--------------------------------");

            int selection = sc.nextInt();

            while(selection < 1 || selection > 6){
                System.out.println("Select a existing option: ");
                selection = sc.nextInt();
            }

            switch (selection) {
                case 1: { // Register book
                    String isbn = "aj4hd4";
                    System.out.println("Enter the book's name: ");
                    sc.nextLine();
                    String bookName = sc.nextLine();
                    System.out.println("Enter the book's author: ");
                    String bookAuthor = sc.nextLine();
                    System.out.println("Enter the book's year: ");
                    int bookYear = sc.nextInt();
                    System.out.println("Enter the much units that will enter to library: ");
                    int allUnits = sc.nextInt();
                    boolean available = true;

                    library.addBook(isbn,bookName, bookAuthor,bookYear,allUnits,available);

                }
                break;
                case 2: {// Register user
                    System.out.println("Enter the user name: ");
                    sc.nextLine();
                    String userName = sc.nextLine();
                    System.out.println("Enter the user surname: ");
                    String userSurname = sc.nextLine();
                    System.out.println("Enter the user dni: ");
                    String userDni = sc.nextLine();
                    int lendBooks = 0;
                    library.addUser(userName,userSurname,userDni,lendBooks);
                }
                break;
                case 3: {// Lend book
                    System.out.println("Select a book in order: ");
                    System.out.println(library);
                    int bookToBeLend = sc.nextInt();

                    library.lendBook(bookToBeLend);
                }
                break;
                case 4: {// Return book
                    System.out.println("Select a book to return: ");
                    int bookToBeReturned = sc.nextInt();

                    library.returnBook(bookToBeReturned);

                }break;
                case 5:{// List users
                    library.seeUsers();
                }break;
                case 6:{// List books
                    library.seeBooks();
                }break;
            }
        }
    }
}