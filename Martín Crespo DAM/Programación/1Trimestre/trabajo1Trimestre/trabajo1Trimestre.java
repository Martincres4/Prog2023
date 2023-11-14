
package trabajo1Trimestre;

import java.util.Scanner;

public class trabajo1Trimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id, idPrueba, contrasenaBuena, contrasenaPrueba;

        /*
         * id = "Martin";
         * contrasenaBuena = "altoSecreto";
         * 
         * System.out.println("Introduzca su nombre de usuario: ");
         * idPrueba = scanner.nextLine();
         * System.out.println("Introduzca su contraseña: ");
         * contrasenaPrueba = scanner.nextLine();
         * 
         * while(!contrasenaBuena.equalsIgnoreCase(contrasenaPrueba)||!id.
         * equalsIgnoreCase(idPrueba)){
         * System.out.println("Ha introducido mal sus datos, intentelo de nuevo.");
         * System.out.println("Introduzca de nuevo su nombre de usuario: ");
         * idPrueba = scanner.nextLine();
         * System.out.println("Introduzca su contraseña: ");
         * contrasenaPrueba = scanner.nextLine();
         * }
         */

        String libro1 = libro("Erase una vez", "Gongora", "SM", "cuarta");
        String libro2 = libro("Erase dos veces", "Luismi", "SoM", "si");
        String libro3 = libro("Busqueda", "fads", "fese", "fss");
        String libro4 = libro("agwega", "gesgasg", "ee", "gee");

        System.out.println("¿Qué desea revisar?");
        System.out.println("1. Libros.");
        System.out.println("2. Revistas.");
        System.out.println("3. Articulos.");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("¿Que libro desea buscar?");
                String buscarLibro = scanner.nextLine();
                switch (buscarLibro) {
                    case "libro1":
                        System.out.println(libro1);
                        break;
                    case "libro2":
                        System.out.println(libro2);
                        break;
                    case "libro3":
                        System.out.println(libro3);
                        break;
                    case "libro4":
                        System.out.println(libro4);
                        break;
                    default:
                        break;
                }
                break;
            case "2":
                System.out.println("¿Que revista desea buscar?");
                String buscarRevista = scanner.nextLine();
                switch (buscarRevista) {
                    case "libro1":
                        System.out.println(libro1);
                        break;
                    case "libro2":
                        System.out.println(libro2);
                        break;
                    case "libro3":
                        System.out.println(libro3);
                        break;
                    case "libro4":
                        System.out.println(libro4);
                        break;
                    default:
                        break;
                }
                break;
            case "3":
                System.out.println("¿Que articulo desea buscar?");
                String buscarArticulo = scanner.nextLine();
                switch (buscarArticulo) {
                    case "libro1":
                        System.out.println(libro1);
                        break;
                    case "libro2":
                        System.out.println(libro2);
                        break;
                    case "libro3":
                        System.out.println(libro3);
                        break;
                    case "libro4":
                        System.out.println(libro4);
                        break;
                    default:
                        break;
                }
                break;
        }

    }

    public static String libro(String nombre, String autor, String editorial, String edicion) {
        String InfoLibro = ("Nombre: "
                + nombre + "\nAutor: "
                + autor + "\nEditorial: "
                + editorial + "\nEdicion: " + edicion);
        return InfoLibro;
    }

    static String Revista(String nombre, String grupoAutores, int editorial, int numRevista) {
        String InfoRevista = ("Nombre: "
                + nombre + "\nAutores: "
                + grupoAutores + "\nEditorial: "
                + editorial + "\nNºRevista: " + numRevista);
        return InfoRevista;
    }

    static String Articulos(String fechaPublicacion, String nombre, String autorEs) {
        String InfoArticulo = ("Fecha de publicacion: "
                + fechaPublicacion + "\nNombre: "
                + nombre + "\nAutores: "
                + autorEs);
        return InfoArticulo;
    }
}