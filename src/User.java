import java.util.ArrayList;

public class User {
    public String name;
    public String surname;
    public String dni;
    public int lendBooks;

    public User(String name, String surname, String dni, int lendBooks){
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.lendBooks = lendBooks;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getDni() {
        return dni;
    }
    public int getLendBooks() {
        return lendBooks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setLendBooks(int lendBooks) {
        this.lendBooks = lendBooks;
    }

    @Override
    public String toString(){
        ArrayList<User> listaUsuarios = new ArrayList<User>();
        for(int i =0; i <listaUsuarios.size(); i++){
            System.out.println(listaUsuarios.get(i).getName());
        }
        return ("name: "+name+"\nsurname: "+surname+
                "\nDNI: "+dni+"\nLend books: "+lendBooks);

    }
}
