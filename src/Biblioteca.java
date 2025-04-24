import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> listaLibros;
    ArrayList<Usuario> listaUsuarios;

    public Biblioteca (){
        this.listaLibros = new ArrayList<Libro>();
        this.listaUsuarios = new ArrayList<Usuario>();
    }

    // METODO PARA AÑADIR UN LIBRO
    public void addLibro(String isbn, String nombreLibro, String autorLibro, int anhoLibro, int unidadesTotales, boolean disponible){
        listaLibros.add(new Libro(isbn, nombreLibro, autorLibro, anhoLibro, unidadesTotales, disponible));
    }

    // METODO PARA AÑADIR UN USUARIO
    public void addUser(String nombreUsuario, String apellidoUsuario, String dniUsuario, int librosPrestados){
        listaUsuarios.add(new Usuario(nombreUsuario, apellidoUsuario, dniUsuario, librosPrestados));
    }

    // METODO PARA LISTAR LOS USUARIOS
    public void seeUsers(){
        for( int i=0 ; i<listaUsuarios.size(); i++){
            System.out.println(((i+1+". ")+listaUsuarios.get(i).getNombre()+" "+listaUsuarios.get(i).getApellidos()));
        }
    }

    // METODO PARA LISTAR LOS LIBROS
    public void seeBooks(){
        for( int i=0 ; i<listaLibros.size(); i++){
            String disponibilidad = null;
            if(listaLibros.get(i).isDisponible() == true){
                disponibilidad = "disponible";
            }else{disponibilidad = "NO disponible";}
            System.out.println(((i+1+". ")+listaLibros.get(i).getNombre())+", "+disponibilidad);
        }
    }

    // METODO PARA PEDIR UN LIBRO
    public boolean pedirLibro(int nuevoValor){
        boolean disponibilidad = false;
        for( int i=0 ; i<listaLibros.size(); i++){
            disponibilidad = listaLibros.get(nuevoValor-1).isDisponible();
        }
        return disponibilidad;
    }

    // METODO PARA DEVOLVER UN LIBRO
    public boolean devolverLibro(int libroADevolver){
        boolean disponibilidad = true;
        for( int i=0 ; i<listaLibros.size() ; i++){
            disponibilidad = listaLibros.get(libroADevolver).isDisponible();
        }
        return disponibilidad;
    }

    // METODO PARA LIMPIAR CONSOLA


    @Override
    public String toString(){
        String mostrarLibro = null;
        for( int i=0 ; i<listaLibros.size(); i++){
            mostrarLibro = ((i+1+". ")+listaLibros.get(i).getNombre());
        }
        return mostrarLibro;
    }
}
