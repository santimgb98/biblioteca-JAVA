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
    public void seeBooks(){
        for( int i=0 ; i<listaLibros.size(); i++){
            String disponibilidad = null;
            if(listaLibros.get(i).isDisponible() == true){
                disponibilidad = "disponible";
            }else{disponibilidad = "NO disponible";}
            System.out.println(((i+1+". ")+listaLibros.get(i).getNombre())+", "+disponibilidad);
        }
    }
    public boolean pedirLibro(int nuevoValor){

        boolean disponibilidad = false;
        // Cambia el atributo de disponible del libro elegido a no disponible
        for( int i=0 ; i<listaLibros.size(); i++){
            disponibilidad = listaLibros.get(nuevoValor-1).isDisponible();
        }
        return disponibilidad;
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
