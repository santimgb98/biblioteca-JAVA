import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList;
    ArrayList<User> userList;

    public Library (){
        this.bookList = new ArrayList<Book>();
        this.userList = new ArrayList<User>();
    }

    // METHOD TO ADD BOOK
    public void addBook(String isbn, String nameBook, String autorBook, int yearBook, int allUnits, boolean available){
        bookList.add(new Book(isbn, nameBook, autorBook, yearBook, allUnits, available));
    }

    // METHOD TO ADD USER
    public void addUser(String nameUser, String surnameUser, String dniUser, int BooksPrestados){
        userList.add(new User(nameUser, surnameUser, dniUser, BooksPrestados));
    }

    // METHOD TO LIST USERS
    public void seeUsers(){
        for( int i=0 ; i<userList.size(); i++){
            System.out.println(((i+1+". ")+userList.get(i).getName()+" "+userList.get(i).getSurname()));
        }
    }

    // METHOD TO LIST BOOKS
    public void seeBooks(){
        for( int i=0 ; i<bookList.size(); i++){
            System.out.println(((i+1+". ")+bookList.get(i).getName()+" "+bookList.get(i).isAvailable()));
        }
    }

    // METHOD TO CHANGE AVAILABILITY BOOKS
    public boolean changeAvailability(int bookIndex) {
        if (bookIndex < 1 || bookIndex > bookList.size()) {
            return false;
        }
        Book book = bookList.get(bookIndex-1);
        book.setAvailable(!book.isAvailable());
        return true;
    }


    @Override
    public String toString(){
        String mostrarBook = null;
        for( int i=0 ; i<bookList.size(); i++){
            mostrarBook = ((i+1+". ")+bookList.get(i).getName()+", Available: "+bookList.get(i).isAvailable());
        }
        return mostrarBook;
    }
}
