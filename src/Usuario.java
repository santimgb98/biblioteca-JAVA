import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    public String nombre;
    public String apellidos;
    public String dni;
    public int librosPrestados;

    public Usuario(String nombre, String apellidos, String dni, int librosPrestados){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.librosPrestados = librosPrestados;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDni() {
        return dni;
    }
    public int getLibrosPrestados() {
        return librosPrestados;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setLibrosPrestados(int librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString(){
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        for(int i =0; i <listaUsuarios.size(); i++){
            System.out.println(listaUsuarios.get(i).getNombre());
        }
        return ("Nombre: "+nombre+"\nApellidos: "+apellidos+
                "\nDNI: "+dni+"\nLibros Prestados: "+librosPrestados);

    }
}
