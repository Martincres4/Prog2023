
import java.util.Scanner;
public class TRABAJO_FINAL_LIBROS {

    public static Scanner sc = new Scanner(System.in);

    //  V   A   R   I   A   B   L   E   S      G   L   O   B   A   L   E   S.................................
    //Las ultimas dos columnas siempre deben ser +18 y reservado en ese orden
    static String[][] base_datos_libros = new String[8][6];
    static String[] campos_libros = {"título", "autor", "editorial", "edición", "num paginas", "es +18", "esta reservado por"};
    
    static String[][] base_datos_revistas = new String[8][5];
    static String[] campos_revistas = {"título", "autor1", "autor2", "autor3", "editorial", "num revista", "es +18", "esta reservado por"};

    static String[][] base_datos_articulos = new String[8][5];
    static String[] campos_articulos = {"fecha publicacion", "título", "autor1", "autor2", "autor3", "es +18", "esta reservado por"};

    static String[][] usuarios = {
        { "admin", "admin", "admin" },
        { "usuario1", "usu1", "cliente" },
        { "usuario2", "usu2", "cliente" },
        { "usuario3", "usu3", "cliente" },
        { "usuario4", "usu4", "cliente" },
        { "usuario5", "usu5", "cliente" }
    };



    static int numero_entradas_libros;
    //  V   A   R   I   A   B   L   E   S      G   L   O   B   A   L   E   S.................................


    
    //.................................   M   A   I   N .................................    
    public static void main(String[] args) {
        numero_entradas_libros = 0;
        introducir_datos_DEMO_libros();
        introducir_datos_usuario_libros();
        leer_datos_libros();
        //filtrado_libros_opciones();



        iniciarSesion();
        cargarDatos();
        ejecMenu();


        







    }
//.................................   M   A   I   N .................................  


//MARTIN
static void iniciarSesion() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Usuario: ");
    String usuarioA = sc.nextLine();
    System.out.print("Contraseña: ");
    String contrasenaA = sc.nextLine();

    // Verificar usuario
    boolean correcto = false;
    for (int i = 0; i < usuarios.length; i++) {
        String[] usuario = usuarios[i];
        if (usuario[0].equals(usuarioA) && usuario[1].equals(contrasenaA)) {
            System.out.println("Saludos " + usuarioA + ".");
            correcto = true;
            break;
        }
    }

    if (!correcto) {
        System.out.println("Credenciales incorrectas.");
        System.exit(0);
    }
}
static void ejecMenu() {
    Scanner sc = new Scanner(System.in);
    int opcionM;
    do {
        añadir_saltos_linea(10);
        System.out.println("#############################################");
        System.out.println("# Menú Principal                            #");
        System.out.println("# 1. Consultar documento                    #");
        System.out.println("# 2. Visualizar todos los documentos        #");
        System.out.println("# 3. Reservar documento                     #");
        System.out.println("# 4. Devolver documento                     #");
        if(usuarios[0][0]){
            System.out.println("# 5. Introducir un nuevo documento          #");
            System.out.println("# 6. Salir                                  #");
        }else{
            System.out.println("# 5. Salir                                  #");
        }
        System.out.println("# 4. Introducir un nuevo documento          #");
        System.out.println("# 5. Salir                                  #");
        System.out.println("#############################################");
        opcionM = sc.nextInt();
        sc.nextLine();
        

        switch (opcionM) {
            case 1:
                 do {
                        System.out.println("#############################################");
                        System.out.println("# ¿Qué tipo de documento quiere consultar?  #");
                        System.out.println("# 1. Un libro                               #");
                        System.out.println("# 2. Una revista                            #");
                        System.out.println("# 3. Un artículo                            #");
                        System.out.println("#############################################");
                        int opcionC = sc.nextInt();
                        sc.nextLine();

                        switch (opcionC) {
                            case 1:
                                consultarLibro();
                                break;
                            case 2:
                                consultarRevista();
                                break;
                            case 3:
                                consultarArticulo();
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    } while (opcionM != 3);
                break;
            case 2:
                 do {
                        System.out.println("##############################################");
                        System.out.println("# ¿Qué tipo de documento quiere visualizar?  #");
                        System.out.println("# 1. Un libro                                #");
                        System.out.println("# 2. Una revista                             #");
                        System.out.println("# 3. Un artículo                             #");
                        System.out.println("# 4. Visualizar todo                         #");
                        System.out.println("##############################################");
                        int opcionC = sc.nextInt();
                        sc.nextLine();

                        switch (opcionC) {
                            case 1:
                                visualizarLibro();
                                break;
                            case 2:
                                visualizarRevista();
                                break;
                            case 3:
                                visualizarArticulo();
                                break;
                            case 4:
                                mos;
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    } while (opcionM != 4);
                break;
            case 3:
                do {
                        System.out.println("##############################################");
                        System.out.println("# ¿Qué tipo de documento quiere reservar?    #");
                        System.out.println("# 1. Un libro                                #");
                        System.out.println("# 2. Una revista                             #");
                        System.out.println("# 3. Un artículo                             #");
                        System.out.println("##############################################");
                        int opcionC = sc.nextInt();
                        sc.nextLine();

                        switch (opcionC) {
                            case 1:
                                reservarLibro();
                                break;
                            case 2:
                                reservarRevista();
                                break;
                            case 3:
                                reservarArticulo();
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    } while (opcionM != 3);
                break;
            case 4:
                do {
                        System.out.println("##############################################");
                        System.out.println("# ¿Qué tipo de documento quiere devolver  ?  #");
                        System.out.println("# 1. Un libro                                #");
                        System.out.println("# 2. Una revista                             #");
                        System.out.println("# 3. Un artículo                             #");
                        System.out.println("##############################################");
                        int opcionC = sc.nextInt();
                        sc.nextLine();

                        switch (opcionC) {
                            case 1:
                                devolverLibro();
                                break;
                            case 2:
                                devolverRevista();
                                break;
                            case 3:
                                devolverArticulo();
                                break;
                            case 4:
                                devolverLibro();
                                devolverRevista();
                                devolverArticulo();
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                        }
                    } while (opcionM != 4);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
        }
    } while (opcionM != 5);
}
static void consultarLibro() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere consultar?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_libros.length; i++) {
        String[] doc = base_datos_libros[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            // consultar el documento
            System.out.println("Información del documento: ");
            for (int l = 0; l < doc.length; l++) {
                String atributo = doc[l];
                System.out.println(atributo);
            }
            return;
        }
    }
    System.out.println("Documento no encontrado.");
}

static void visualizarLibro() {
    System.out.println("Todos los Documentos:");
    for (int j = 0; j < base_datos_libros.length; j++) {
        String[] doc = base_datos_libros[j];
        if (doc != null && doc[0] != null) {
            // Imprime información del doc
            for (int i = 0; i < doc.length; i++) {
                String atributo = doc[i];
                System.out.print(atributo + "\t");
            }
            System.out.println();
        }
    }
}

static void consultarRevista() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere consultar?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_revistas.length; i++) {
        String[] doc = base_datos_revistas[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            // consultar el documento
            System.out.println("Información del documento: ");
            for (int l = 0; l < doc.length; l++) {
                String atributo = doc[l];
                System.out.println(atributo);
            }
            return;
        }
    }
    System.out.println("Documento no encontrado.");
}

static void visualizarRevista() {
    System.out.println("Todos los Documentos:");
    for (int j = 0; j < base_datos_revistas.length; j++) {
        String[] doc = base_datos_revistas[j];
        if (doc != null && doc[0] != null) {
            // Imprime información del doc
            for (int i = 0; i < doc.length; i++) {
                String atributo = doc[i];
                System.out.print(atributo + "\t");
            }
            System.out.println();
        }
    }
}

static void consultarArticulo() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere consultar?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_articulos.length; i++) {
        String[] doc = base_datos_articulos[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            // consultar el documento
            System.out.println("Información del documento: ");
            for (int l = 0; l < doc.length; l++) {
                String atributo = doc[l];
                System.out.println(atributo);
            }
            return;
        }
    }
    System.out.println("Documento no encontrado.");
}

static void visualizarArticulo() {
    System.out.println("Todos los Documentos:");
    for (int j = 0; j < base_datos_articulos.length; j++) {
        String[] doc = base_datos_articulos[j];
        if (doc != null && doc[0] != null) {
            // Imprime información del doc
            for (int i = 0; i < doc.length; i++) {
                String atributo = doc[i];
                System.out.print(atributo + "\t");
            }
            System.out.println();
        }
    }
}


//METODOS RESERVAR
static void reservarLibro() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué libro quiere  reservar?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_libros.length; i++) {
        String[] doc = base_datos_libros[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            //reservar el documento
            if (doc[3].equalsIgnoreCase("disponible")) {
                doc[3] = "reservado";
                System.out.println("Ha reservado el documento.");
            } else {
                System.out.println("No disponible.");
            }
            return;
        }
    }

    System.out.println("No encontrado.");
}

static void reservarRevista() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere  reservar?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_revistas.length; i++) {
        String[] doc = base_datos_revistas[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            //reservar el documento
            if (doc[3].equalsIgnoreCase("disponible")) {
                doc[3] = "reservado";
                System.out.println("Ha reservado el documento.");
            } else {
                System.out.println("No disponible.");
            }
            return;
        }
    }

    System.out.println("No encontrado.");
}

static void reservarArticulo() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere  reservar?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_articulos.length; i++) {
        String[] doc = base_datos_articulos[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            //reservar el documento
            if (doc[3].equalsIgnoreCase("disponible")) {
                doc[3] = "reservado";
                System.out.println("Ha reservado el documento.");
            } else {
                System.out.println("No disponible.");
            }
            return;
        }
    }

    System.out.println("No encontrado.");
}


//METODOS DEVOLVER
static void devolverLibro() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere devolver?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_libros.length; i++) {
        String[] doc = base_datos_libros[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            //devolver el documento
            if (doc[3].equalsIgnoreCase("reservado")) {
                doc[3] = "disponible";
                System.out.println("Documento devuelto con éxito.");
            } else {
                System.out.println("El documento no está reservado.");
            }
            return;
        }
    }

    System.out.println("Documento no encontrado.");
}

static void devolverRevista() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere devolver?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_revistas.length; i++) {
        String[] doc = base_datos_revistas[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            //devolver el documento
            if (doc[3].equalsIgnoreCase("reservado")) {
                doc[3] = "disponible";
                System.out.println("Documento devuelto con éxito.");
            } else {
                System.out.println("El documento no está reservado.");
            }
            return;
        }
    }

    System.out.println("Documento no encontrado.");
}

static void devolverArticulo() {
    Scanner sc = new Scanner(System.in);
    System.out.print("¿Qué documento quiere devolver?");
    String nombreDoc = sc.nextLine();

    for (int i = 0; i < base_datos_articulos.length; i++) {
        String[] doc = base_datos_articulos[i];
        if (doc != null && doc[0] != null && doc[0].equalsIgnoreCase(nombreDoc)) {
            //devolver el documento
            if (doc[3].equalsIgnoreCase("reservado")) {
                doc[3] = "disponible";
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
    Scanner sc = new Scanner(System.in);
    System.out.println("###########################################");
    System.out.println("# Configuración                           #");
    System.out.println("# 1. Activar/Desactivar control parental  #");
    System.out.println("# 2. Volver al Menú Principal             #");
    System.out.println ("# Seleccione una opción:                 # ");
    System.out.println("###########################################");
    int opcionCP = sc.nextInt();
    sc.nextLine();

    switch (opcionCP) {
        case 1:
            contParAct = !contParAct;
            System.out.println("Control parental " + (contParAct ? "activado." : "desactivado."));
            break;
        case 2:
            System.out.println("Volviendo al Menú Principal.");
            break;
        default:
            System.out.println("Opción no válida. Inténtelo de nuevo.");
    }
}















//🡣...🡣...🡣...🡣...🡣...🡣...   F  I  L  T  R  A  D  O   🡣...🡣...🡣...🡣...🡣...🡣... 
    //me tienen que indicar campo/columna y tengo que buscar fila a fila
    static void filtrado_libros_opciones() {
        System.out.printf("Introduzca el número del campo desea introducir:\n");
        for (int index = 0; index < campos_libros.length; index++) {
            System.out.printf("%d: %s\n", index, campos_libros[index]);
        }
        String respuesta = sc.nextLine();                       //!!!cuidado con su uso que les cambio el valor luego en el if        
        int campo = Integer.parseInt(respuesta);
        
        System.out.printf("Introduzca la palabra de busqueda:\n");
        String busqueda = sc.nextLine(); 
        int posicion_busqueda = filtrado_por_campo_libros(busqueda, campo);//Encontramos la posicion para eso
        
        if (posicion_busqueda != 010101) {//codigo para saber si se habia encontrado o no, en caso de valer eso no encontrada la busqueda
            System.out.printf("Introduzca el numero asignado a lo que quiere hacer\n"
                    + "1.leer datos de la busqueda\n2.");
            respuesta = sc.nextLine(); 
            int opcion = Integer.parseInt(respuesta);
            switch (opcion) {
                case 1:
                    lectura_por_filtrado_libros(posicion_busqueda);
                    break;                    
            }
        }

    }

    static int filtrado_por_campo_libros(String busqueda, int campo) {

        int posicion = 0;//Esto guarda la fila, porque la columna es el campo que nos indica que busquemos
        boolean encontrado = false;
        int fila = 0;
        do{
           if (base_datos_libros[fila][campo]!=null && base_datos_libros[fila][campo].equals(busqueda)) {
                posicion = fila;//fila, porque la fila es la entrada completa de datos 
                System.out.println(base_datos_libros[fila][campo]);
                //añadir_saltos_linea(10);
                encontrado = true;
            } 
            System.out.println(fila);
            fila++;
        }while(encontrado);
        /*borrar
        for (int fila = 0; fila < base_datos_libros.length; fila++) {
            System.out.println(fila);
            if (base_datos_libros[fila][campo]!=null && base_datos_libros[fila][campo].equals(busqueda)) {
                posicion = fila;//fila, porque la fila es la entrada completa de datos 
                System.out.println(base_datos_libros[fila][campo]);
                //añadir_saltos_linea(10);
                encontrado = true;
            }
            System.out.println(fila);
        }
        */
        
        if (encontrado) {
            System.out.printf("Su busqueda fue encontrada en la entrada número %d.\n", posicion);
        } else {
            posicion = 010101; //codigo para saber que no fue encontrada
            System.out.printf("Lo lamentamos, su busqueda no fue encontrada en nuestros registros.\n");
        }
        return posicion;
    }

    static void lectura_por_filtrado_libros(int entrada) {
        for (int campo = 0; campo < campos_libros.length; campo++) {
            System.out.printf("%s es:  %s\n", campos_libros[campo], base_datos_libros[campo][entrada]);
        }
    }

//🡡...🡡...🡡...🡡...🡡...🡡...   F  I  L  T  R  A  D  O   🡡...🡡...🡡...🡡...🡡...🡡...  

//🡣...🡣...🡣...🡣...🡣...🡣...   I   N   T  R  O  D  U  C  I  R      D  A  T  O  S   🡣...🡣...🡣...🡣...🡣...🡣... 
    static void introducir_datos_usuario_libros() {
        if (numero_entradas_libros != base_datos_libros.length) { //si siguen habiendo huecos en la base de datos)
            String[] datos_introducidos = new String[5];
            for (int filas = 0; filas < datos_introducidos.length - 1; filas++) {//Pongo el menos 2 porque las dos ultimas son mayor de edad y reservado
                System.out.printf("Introduzca %s:", campos_libros[filas]);
                datos_introducidos[filas] = sc.nextLine(); 
            }
            boolean bucle = true;
            while (bucle) {
                System.out.printf("¿Es para mayores de 18 años? (si/no):");
                String respuesta = sc.nextLine(); 
                if (respuesta.equals("si") || respuesta.equals("no")) {
                    datos_introducidos[datos_introducidos.length - 1] = respuesta;
                    bucle = false;
                }
            }
            introducir_datos_libros(datos_introducidos);
        } else {
            System.out.printf("Lo sentimos, pero la base de datos de libros esta llena para otra entrada.\n");
        }
        añadir_saltos_linea(5);
    }

    static void introducir_datos_libros(String[] datos) {
        for (int columnas = 0; columnas < datos.length; columnas++) {
            base_datos_libros[numero_entradas_libros][columnas] = datos[columnas];
        }
        numero_entradas_libros++;
    }

    static void introducir_datos_DEMO_libros() {
        String[][] datos = datos_libros_demo();
        for (int filas = numero_entradas_libros; filas < datos.length; filas++) {
            for (int columnas = 0; columnas < datos[0].length; columnas++) {
                base_datos_libros[filas][columnas] = datos[filas][columnas];
            }
            numero_entradas_libros++;
        }

    }

    static void leer_datos_libros() {
        boolean comparacion;
        int espacios = 0;
        int tamaño_espacios_total = 42;
        //titulos de campos
        int tamaño_campos_libros = 0;
        for (int campos = 0; campos < campos_libros.length; campos++) {
            añadir_separador1();
            espacios = (tamaño_espacios_total - campos_libros[campos].length()) / 2;
            añadir_espacios(espacios);

            System.out.printf("%s", campos_libros[campos]);

            añadir_espacios(espacios);
            if (par(campos_libros[campos]) == false) {
                añadir_espacios(1);
            }
            tamaño_campos_libros = tamaño_campos_libros + campos_libros[campos].length() + espacios;
        }
        System.out.println();
        añadir_separador2(tamaño_campos_libros);
        añadir_saltos_linea(2);

        //leer entradas
        for (int filas = 0; filas < base_datos_libros.length; filas++) {
            comparacion = false;
            for (int columnas = 0; columnas < base_datos_libros[0].length; columnas++) {
                if (base_datos_libros[filas][columnas] != null) {
                    añadir_separador1();
                    espacios = (tamaño_espacios_total - base_datos_libros[filas][columnas].length()) / 2;
                    añadir_espacios(espacios);

                    System.out.printf("%s", base_datos_libros[filas][columnas]);

                    añadir_espacios(espacios);
                    comparacion = true;
                }
            }
            if (comparacion) {
                añadir_saltos_linea(2);
            }

        }
    }



//🡣...🡣...  DATOS DEMO  ...🡣...🡣 
    static String[][] datos_libros_demo() {
        String[][] libros = {
            {"Sombras en el Abismo Estelar", "Alejandro Rodríguez", "Editorial Galaxia", "Primera Edición", "Sí", "user2"},
            {"El Susurro del Tiempo Perdido", "María Gómez", "Ediciones Temporales", "Segunda Edición", "No", "nadie"},
            {"Códigos de la Realidad Oculta", "Carlos Fernández", "Libros Invisibles", "Edición Especial", "Sí", "Alejandro"},
            {"Travesía a través del Espejo Cuántico", "Ana Sánchez", "Editorial Cuántica", "Edición Limitada", "No", "nadie"},
            {"El Último Aliento del Bosque Ancestral", "Javier López", "Ediciones Naturaleza", "Tercera Edición", "Sí", "user1"},
            {"Intrigas en la Ciudad de los Sueños Rotos", "Patricia Ramos", "Editorial Misterio", "Edición de Bolsillo", "No", "nadie"}
        };
        return libros;
    }

     static String[][] datos_libros_revista() {
        String[][] libros = {
            {"National Geographic", "National Geographic Society", "123", "Sí", "user2"},
            {"Time", "Time Inc.", "124", "No", "nadie"},
            {"Scientific American", "Springer Nature", "125", "Sí", "Alejandro"},
            {"Vogue", "Condé Nast", "126", "No", "nadie"},
            {"The Economist", "The Economist Group", "127", "No", "nadie"}
        };
        return libros;
    }

     static String[][] datos_libros_articulo() {
        String[][] libros = {
            {"2023-11-20", "Research Report", "Researcher 1", "Sí", "user2"},
            {"2023-11-21", "User Manual", "Company XYZ", "Author 2", "No", "nadie"},
            {"2023-11-22", "Service Agreement", "Client ABC", "Author 3", "Sí", "Alejandro"},
            {"2023-11-23", "Presentation", "Sales Team", "Author 4", "No", "nadie"},
            {"2023-11-24", "Privacy Policy", "Company DEF", "disponible", "Author 5", "No", "nadie"}
        };
        return libros;
    }


//🡡...🡡...  DATOS DEMO  ...🡡...🡡 







//🡡...🡡...🡡...🡡...🡡...🡡...   I   N   T  R  O  D  U  C  I  R    D  A  T  O  S   🡡...🡡...🡡...🡡...🡡...🡡...  







//🡣...🡣...🡣...🡣...🡣...🡣...  UTILIDADES  ...🡣...🡣...🡣...🡣...🡣...🡣
    static void añadir_saltos_linea(int a) {
        for (int index = 0; index <= a; index++) {
            System.out.println();
        }
    }

    static void añadir_espacios(int espacios) {
        if (espacios > 0) {
            for (int index = 0; index <= espacios; index++) {
                System.out.printf(" ");
            }
        }
    }

    static void añadir_separador1() {
        System.out.printf("##");
    }

    static void añadir_separador2(int tamaño) {
        if (tamaño > 0) {
            for (int index = 0; index <= tamaño; index++) {
                System.out.printf("_");
            }
        }
    }

    /*
    static String Scanner() {
        Scanner entrada = new Scanner(System.in);
        String respuesta = entrada.nextLine();
        return respuesta;
    }
    */
    /*static boolean par(String entrada) {
        int numero_letras = entrada.length();
        boolean par = true;
        if (numero_letras % 2 != 0) {
            par = false;
        }
        return par;
    }*/

//🡡...🡡...🡡...🡡...🡡...🡡...  UTILIDADES  ...🡡...🡡...🡡...🡡...🡡...🡡 
}//filal