import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    public String isbn;
    public String nombre;
    public String autor;
    public int anho;
    public int unidadesTotales;
    public boolean disponible;

    public Libro (String isbn, String nombre, String autor, int anho , int unidadesTotales, boolean disponible){
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.anho = anho;
        this.unidadesTotales = unidadesTotales;
        this.disponible = disponible;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }

    public int getAnho() {
        return anho;
    }

    public int getUnidadesTotales() {
        return unidadesTotales;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void setUnidadesTotales(int unidadesTotales) {
        this.unidadesTotales = unidadesTotales;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }



    @Override
    public String toString(){

        ArrayList<Libro> listaLibros = new ArrayList<Libro>();
        for(int i =0; i <listaLibros.size(); i++){
            System.out.println(listaLibros.get(i).getNombre());
        }
        return ("Isbn: "+isbn+"\nNombre: "+nombre+"\nAutor: "+autor+
                "\nAño: "+anho+"\nUnidades totales: "+unidadesTotales+"\nDisponible: "+disponible);
    }

}
