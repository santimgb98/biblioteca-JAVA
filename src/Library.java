import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookList;
    ArrayList<User> userList;

    public Library (){
        this.bookList = new ArrayList<Book>();
        this.userList = new ArrayList<User>();
    }

    // METHOD TO ADD BOOK
    public void addBook(String isbn, String nameBook, String autorBook, int yearBook, int allUnits, boolean available, boolean availableFalse){
        bookList.add(new Book(isbn, nameBook, autorBook, yearBook, allUnits, available, availableFalse));
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
    public boolean lendBook(int newValue){
        boolean availability = false;
        for( int i=0 ; i<bookList.size(); i++){
            System.out.println(bookList.get(newValue-1).getName());
            availability = bookList.get(newValue-1).isAvailable();
        }
        return availability;
    }

    // METHOD TO RETURN BOOK
    public boolean returnBook(int bookToBeLend){
        boolean change = false;
        for( int i=0 ; i<bookList.size() ; i++){
            isAvailable() = false;
            System.out.println(((i+1+". ")+"Book: "+bookList.get(bookToBeLend-1).getName()+
                    ", "+"Author: "+bookList.get(bookToBeLend-1).getAuthor()+
                    ", "+"Year: "+bookList.get(bookToBeLend-1).getYear()+
                    ", "+"All units: "+bookList.get(bookToBeLend-1).getAllUnits()+
                    ", "+"Availability: "+bookList.get(bookToBeLend-1).isAvailableFalse()+
                    ", "+"ISBN: "+bookList.get(bookToBeLend-1).getIsbn()));
        }
        return change;
    }


    @Override
    public String toString(){
        String mostrarBook = "there aren't books yet";
        for( int i=0 ; i<bookList.size(); i++){
            mostrarBook = ((i+1+". ")+"Book: "+bookList.get(i).getName()+
                    ", "+"Author: "+bookList.get(i).getAuthor()+
                    ", "+"Year: "+bookList.get(i).getYear()+
                    ", "+"All units: "+bookList.get(i).getAllUnits()+
                    ", "+"Availability: "+bookList.get(i).isAvailable()+
                    ", "+"ISBN: "+bookList.get(i).getIsbn());
        }
        return mostrarBook;
    }
}
