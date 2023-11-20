import java.util.Scanner;

public class BibliotecaAlejandria {

    // Array bidimensional para almacenar la información de los documentos
    static String[][] inventario = new String[10][6]; // [10] documentos, [6] atributos por documento

    // Variable para almacenar el usuario actual
    static String usuarioActual;

    public static void main(String[] args) {
        iniciarSesion();
        ejecutarMenuPrincipal();
    }

    // Método para iniciar sesión
    static void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        usuarioActual = scanner.nextLine();
        System.out.println("¡Bienvenido, " + usuarioActual + "!");
    }

    // Método para ejecutar el menú principal
    static void ejecutarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------ Menú Principal ------");
            System.out.println("1. Consultar documento");
            System.out.println("2. Visualizar todos los documentos");
            System.out.println("3. Reservar documento");
            System.out.println("4. Devolver documento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    consultarDocumento();
                    break;
                case 2:
                    visualizarDocumentos();
                    break;
                case 3:
                    reservarDocumento();
                    break;
                case 4:
                    devolverDocumento();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

    // Método para consultar un documento específico
    static void consultarDocumento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del documento a consultar: ");
        String nombreDocumento = scanner.nextLine();

        // Implementa la lógica para buscar y mostrar información del documento
        // Puedes utilizar bucles y condiciones para buscar en el inventario
        // y mostrar la información correspondiente.
    }

    // Método para visualizar todos los documentos
    static void visualizarDocumentos() {
        System.out.println("------ Todos los Documentos ------");
        for (String[] documento : inventario) {
            // Imprime la información del documento
            for (String atributo : documento) {
                System.out.print(atributo + "\t");
            }
            System.out.println();
        }
    }

    // Método para reservar un documento
    static void reservarDocumento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del documento a reservar: ");
        String nombreDocumento = scanner.nextLine();

        // Implementa la lógica para reservar el documento
        // Puedes utilizar bucles y condiciones para buscar en el inventario
        // y marcar el documento como reservado.
    }

    // Método para devolver un documento
    static void devolverDocumento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del documento a devolver: ");
        String nombreDocumento = scanner.nextLine();

        // Implementa la lógica para devolver el documento
        // Puedes utilizar bucles y condiciones para buscar en el inventario
        // y marcar el documento como disponible.
    }
}
