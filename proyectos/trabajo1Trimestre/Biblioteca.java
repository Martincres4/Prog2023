import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Documento {
    String nombre;
    String autor;
    String editorial;

    public Documento(String nombre, String autor, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }
}

class Libro extends Documento {
    int edicion;
    int numeroPaginas;

    public Libro(String nombre, String autor, String editorial, int edicion, int numeroPaginas) {
        super(nombre, autor, editorial);
        this.edicion = edicion;
        this.numeroPaginas = numeroPaginas;
    }
}

class Revista extends Documento {
    int numeroRevista;

    public Revista(String nombre, String autor, String editorial, int numeroRevista) {
        super(nombre, autor, editorial);
        this.numeroRevista = numeroRevista;
    }
}

class Articulo {
    String fechaPublicacion;
    String nombre;
    String autor;

    public Articulo(String fechaPublicacion, String nombre, String autor) {
        this.fechaPublicacion = fechaPublicacion;
        this.nombre = nombre;
        this.autor = autor;
    }
}

class Usuario {
    String usuario;
    String contrasena;
    boolean esMayor;

    public Usuario(String usuario, String contrasena, boolean esMayor) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.esMayor = esMayor;
    }
}

public class Biblioteca {
    private static Map<String, Documento> documentos = new HashMap<>();
    private static Map<String, Usuario> usuarios = new HashMap<>();
    private static Map<String, String> reservas = new HashMap<>();

    public static void main(String[] args) {
        // Inicialización de documentos, usuarios, etc.

        // Menú principal
        while (true) {
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica de inicio de sesión
                    break;
                case 2:
                    // Lógica de registro
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
    }

    // Métodos para gestionar la biblioteca (reservar, devolver, consultar, filtrar, etc.)
}
