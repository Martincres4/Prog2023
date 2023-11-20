import java.util.Scanner;

public class practica1MartinCrespo {

    static String[][] inventario = new String[15][6];
    static String[][] usuarios = {
        { "admin", "admin123", "admin" },
        { "usuario1", "pass1", "cliente" },
        { "usuario2", "pass2", "cliente" },
        { "usuario3", "pass3", "cliente" },
        { "usuario4", "pass4", "cliente" },
        { "usuario5", "pass5", "cliente" }
};
    static String usuarioActual;
    static boolean controlParentalActivado = true;

    public static void main(String[] args) {
        iniciarSesion();
         cargarDatosDeEjemplo();
        ejecutarMenuPrincipal();
    }   
      

    static void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        usuarioActual = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar credenciales
        boolean credencialesValidas = false;
        for (String[] usuario : usuarios) {
            if (usuario[0].equals(usuarioActual) && usuario[1].equals(contrasena)) {
                System.out.println("¡Bienvenido, " + usuarioActual + "!");
                credencialesValidas = true;
                break;
            }
        }

        if (!credencialesValidas) {
            System.out.println("Credenciales incorrectas. Saliendo del programa.");
            System.exit(0);
        }
    }

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

    static void consultarDocumento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del documento a consultar: ");
        String nombreDocumento = scanner.nextLine();

        for (int i = 0; i < inventario.length; i++) {
            String[] documento = inventario[i];
            if (documento != null && documento[0] != null && documento[0].equalsIgnoreCase(nombreDocumento)) {
                // Logica para consultar el documento
                System.out.println("Información del documento: ");
                for (String atributo : documento) {
                    System.out.println(atributo);
                }
                return;
            }
        }
        System.out.println("Documento no encontrado.");
    }

    static void visualizarDocumentos() {
        System.out.println("------ Todos los Documentos ------");
        for (String[] documento : inventario) {
            if (documento != null && documento[0] != null) {
                // Imprime la información del documento
                for (String atributo : documento) {
                    System.out.print(atributo + "\t");
                }
                System.out.println();
            }
        }
    }

    static void reservarDocumento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del documento a reservar: ");
        String nombreDocumento = scanner.nextLine();

        for (int i = 0; i < inventario.length; i++) {
            String[] documento = inventario[i];
            if (documento != null && documento[0] != null && documento[0].equalsIgnoreCase(nombreDocumento)) {
                // Logica para reservar el documento
                if (documento[5].equalsIgnoreCase("disponible")) {
                    documento[5] = "reservado";
                    System.out.println("Documento reservado con éxito.");
                } else {
                    System.out.println("El documento no está disponible para reservar.");
                }
                return;
            }
        }

        System.out.println("Documento no encontrado.");
    }

    static void devolverDocumento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del documento a devolver: ");
        String nombreDocumento = scanner.nextLine();

        for (int i = 0; i < inventario.length; i++) {
            String[] documento = inventario[i];
            if (documento != null && documento[0] != null && documento[0].equalsIgnoreCase(nombreDocumento)) {
                // Logica para devolver el documento
                if (documento[5].equalsIgnoreCase("reservado")) {
                    documento[5] = "disponible";
                    System.out.println("Documento devuelto con éxito.");
                } else {
                    System.out.println("El documento no está reservado.");
                }
                return;
            }
        }

        System.out.println("Documento no encontrado.");
    }

    static void configuracion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ Configuración ------");
        System.out.println("1. Activar/Desactivar control parental");
        System.out.println("2. Volver al Menú Principal");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                controlParentalActivado = !controlParentalActivado;
                System.out.println("Control parental " + (controlParentalActivado ? "activado." : "desactivado."));
                break;
            case 2:
                System.out.println("Volviendo al Menú Principal.");
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
        }
    }
    static void cargarDatosDeEjemplo() {
        // Ejemplos de libros
        inventario[0] = new String[]{"Libro 1", "Autor 1", "Editorial 1", "1", "300", "disponible"};
        inventario[1] = new String[]{"Libro 2", "Autor 2", "Editorial 2", "2", "400", "disponible"};
        inventario[2] = new String[]{"Libro 3", "Autor 3", "Editorial 3", "3", "250", "disponible"};
        inventario[3] = new String[]{"Libro 4", "Autor 4", "Editorial 4", "1", "500", "disponible"};
        inventario[4] = new String[]{"Libro 5", "Autor 5", "Editorial 5", "2", "450", "disponible"};

        // Ejemplos de revistas
        inventario[5] = new String[]{"Revista 1", "Autor Revista 1", "Editorial Revista 1", "123", "disponible"};
        inventario[6] = new String[]{"Revista 2", "Autor Revista 2", "Editorial Revista 2", "124", "disponible"};
        inventario[7] = new String[]{"Revista 3", "Autor Revista 3", "Editorial Revista 3", "125", "disponible"};
        inventario[8] = new String[]{"Revista 4", "Autor Revista 4", "Editorial Revista 4", "126", "disponible"};
        inventario[9] = new String[]{"Revista 5", "Autor Revista 5", "Editorial Revista 5", "127", "disponible"};

        // Ejemplos de documentos
        inventario[10] = new String[]{"2023-11-20", "Documento 1", "Editor 1", "Author 1", "disponible"};
        inventario[11] = new String[]{"2023-11-21", "Documento 2", "Editor 2", "Author 2", "disponible"};
        inventario[12] = new String[]{"2023-11-22", "Documento 3", "Editor 3", "Author 3", "disponible"};
        inventario[13] = new String[]{"2023-11-23", "Documento 4", "Editor 4", "Author 4", "disponible"};
        inventario[14] = new String[]{"2023-11-24", "Documento 5", "Editor 5", "Author 5", "disponible"};
    }
}

