import java.util.ArrayList;

public class Book {
    public String isbn;
    public String name;
    public String author;
    public int year;
    public int allUnits;
    public boolean available;


    public Book (String isbn, String name, String author, int year , int allUnits, boolean available){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.year = year;
        this.allUnits = allUnits;
        this.available = available;


    }

    public String getIsbn() {
        return isbn;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public int getAllUnits() {
        return allUnits;
    }
    public boolean isAvailable() {
        return available;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAllUnits(int allUnits) {
        this.allUnits = allUnits;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }


    @Override
    public String toString(){
        
        return ("Isbn: "+isbn+"\nname: "+name+"\nauthor: "+author+
                "\nAño: "+year+"\nUnidades totales: "+allUnits+"\navailable: "+available);
    }

}
