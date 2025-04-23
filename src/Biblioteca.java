import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> listaLibros;
    ArrayList<Usuario> listaUsuarios;

    public Biblioteca (){
        this.listaLibros = new ArrayList<Libro>();
        this.listaUsuarios = new ArrayList<Usuario>();
    }

    public void addLibro(String isbn, String nombreLibro, String autorLibro, int anhoLibro, int unidadesTotales, boolean disponible){
        listaLibros.add(new Libro(isbn, nombreLibro, autorLibro, anhoLibro, unidadesTotales, disponible));
    }
    public void addUser(String nombreUsuario, String apellidoUsuario, String dniUsuario, int librosPrestados){
        listaUsuarios.add(new Usuario(nombreUsuario, apellidoUsuario, dniUsuario, librosPrestados));
    }
    public void seeUsers(){
        for( int i=0 ; i<listaUsuarios.size(); i++){
            System.out.println(((i+1+". ")+listaUsuarios.get(i).getNombre()));
        }
    }
    public void pedirLibro(){

    }
    @Override
    public String toString(){
        String mostrarLibro = null;
        for( int i=0 ; i<listaLibros.size(); i++){
            mostrarLibro = ((i+1+". ")+listaLibros.get(i).getNombre());
        }
        return mostrarLibro;


    }


}
