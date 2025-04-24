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
            String availability = null;
            if(bookList.get(i).isAvailable() == true){
                availability = "available";
            }else{availability = "NO available";}
            System.out.println(((i+1+". ")+bookList.get(i).getName())+", "+availability);
        }
    }

    // METHOD TO LEND BOOK
    public boolean lendBook(int nuevoValor){
        boolean availability = false;
        for( int i=0 ; i<bookList.size(); i++){
            availability = bookList.get(nuevoValor-1).isAvailable();
        }
        return availability;
    }

    // METHOD TO RETURN BOOK
    public boolean returnBook(int BookADevolver){
        boolean availability = true;
        for( int i=0 ; i<bookList.size() ; i++){
            availability = bookList.get(BookADevolver).isAvailable();
        }
        return availability;
    }


    @Override
    public String toString(){
        String mostrarBook = null;
        for( int i=0 ; i<bookList.size(); i++){
            mostrarBook = ((i+1+". ")+bookList.get(i).isAvailable());
        }
        return mostrarBook;
    }
}
