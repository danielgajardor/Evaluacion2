
import java.util.Scanner;


/**
 *
 * @author vina
 */

public class Principal {

    public static void main(String[] args) {

        Libro lib1 = new Libro("Muchas vidas, muchos maestros", 145, 15000);      
        Libro lib2 = new Libro ("Cien años de soledad", 200, 10000);
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("****BIENVENID@*****");
        System.out.println("ELIJA UNA OPCION:");
        System.out.println("1.-AGREGAR LIBRO");
        System.out.println("2.-MOSTRAR TOTAL LIBRO INFANTIL");
        System.out.println("3.-OBTENER TOTAL");
        System.out.println("4.-ELIMINAR UN LIBRO");
        System.out.println("5.- SALIR");
        System.out.print("SELECCIONE UNA OPCION: ");

            int opcion = scanner.nextInt();    
            scanner.nextLine(); 

            switch (opcion) {
                case 1:          
                    System.out.print("INGRESE NOMBRE LIBRO: ");
                    scanner.nextLine();  
                    String nombre = scanner.nextLine();
                    System.out.print("INGRESE TIPO DE LIBRO");
                    String tipoLibro;
                    tipoLibro = scanner.nextLine();
                    registrarLibro();
                    break;
                case 2:
                    System.out.println("LA LISTA DE LIBROS ES:");
                case 3:
                    System.out.println("TOTAL DE LIBROS:"); 
                    mostrarLibros();
                    break;
                case 4:
                    eliminarLibro();
                    break;
                case 5:
                    System.out.println("HASTA LA PRÓXIMA!");
                    break;
                default:
                    System.out.println("ERROR, INGRESE UNA OPCIÓN VÁLIDA");
                    break;
            }
        }
    }

    private static void eliminarLibro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void mostrarLibros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void registrarLibro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

