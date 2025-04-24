import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        var entrada = "dentro";
        while(entrada == "dentro"){
            Scanner sc = new Scanner(System.in);
            System.out.println("MENÚ BIBLIOTECA: ");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Listar usuarios");
            System.out.println("6. Listar libros");

            int selection = sc.nextInt();

            while(selection < 1 || selection > 6){
                System.out.println("Selecciona una opción existente");
                selection = sc.nextInt();
            }

            switch (selection) {
                case 1: { // Registrar libro
                    String isbn = "aj4hd4";
                    System.out.println("Introduce el nombre del libro: ");
                    sc.nextLine();
                    String nombreLibro = sc.nextLine();
                    System.out.println("Introduce el autor del libro: ");
                    String autorLibro = sc.nextLine();
                    System.out.println("Introduce el año del libro: ");
                    int anhoLibro = sc.nextInt();
                    System.out.println("Introduce la cantidad de unidades que va a entrar en la biblioteca: ");
                    int unidadesTotales = sc.nextInt();
                    boolean disponible = true;

                    biblioteca.addLibro(isbn,nombreLibro, autorLibro,anhoLibro,unidadesTotales,disponible);

                }
                break;
                case 2: {// Registrar usuario
                    System.out.println("Introduce el nombre del nuevo usuario: ");
                    sc.nextLine();
                    String nombreUsuario = sc.nextLine();
                    System.out.println("Introduce el apellido del nuevo usuario: ");
                    String apellidoUsuario = sc.nextLine();
                    System.out.println("Introduce el dni del nuevo usuario: ");
                    String dniUsuario = sc.nextLine();
                    int librosPrestados = 0;
                    biblioteca.addUser(nombreUsuario,apellidoUsuario,dniUsuario,librosPrestados);
                }
                break;
                case 3: {// Pedir libro
                    System.out.println("Selecciona libro por su orden: ");
                    System.out.println(biblioteca);
                    int libroAPrestar = sc.nextInt();

                    biblioteca.pedirLibro(libroAPrestar);
                }
                break;
                case 4: {// Devolver libro
                    System.out.println("Selecciona el libro a devolver: ");
                    int libroADevolver = sc.nextInt();

                    biblioteca.devolverLibro(libroADevolver);

                }break;
                case 5:{// Listar usuarios
                    biblioteca.seeUsers();
                }break;
                case 6:{// Listar libros
                    biblioteca.seeBooks();
                }break;
            }
        }




    }
}