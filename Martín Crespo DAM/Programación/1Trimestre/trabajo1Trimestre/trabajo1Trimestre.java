
/*
Practica 1º DAM, 1º Trimestre
La biblioteca de Alejandría
La biblioteca de Alejandría ha recibido un chivatazo de que la integridad física se ha visto
comprometida. Es por ello que han decidido digitalizar su contenido. Para ello primero han pasado a
digital los libros (los cuales tienen nombre del libro, su autor, editorial, su edición y el número de
páginas), revistas (los cuales tienen un nombre, un grupo de autores, su editorial, el numero de la
revista) y artículos (fecha de publicación, nombre, autor/es). El programa deberá poder llevar un
control de quien tiene qué documento (libro, revista, artículo), por lo tanto, toda persona deberá tener
un usuario/id y contraseña para poder entrar en el programa. Un cliente puede reservar un
documento si no esta reservado por otra persona y devolver un documento, así como consultar un
documento (al menos uno en específico) o visualizar todos/gran número de ellos. También estaría
bien que se pudiese filtrar por algún campo (como por ejemplo nombre/fecha de
publicación/disponibles/no disponibles etc... (opcional para mas nota)). Existe documentos de
temática sensible para menores y por tanto se espera algún tipo de control parental/evitar que
reserven documentos los menores de edad.
Se pide:
• Crear una demo funcional de como crearíais un programa de reserva/gestión de una biblioteca
• El proyecto debe poder ejecutarse en cualquier ordenador que tenga instalado previamente el JDK
(versión 8)
• El programa deberá subirse al aula virtual antes del 13 de diciembre a las 00:00h o se considerará
suspenso
• Todos los miembros del grupo deberán subir el trabajo realizado. El alumno que no lo realice se
seguirán los criterios de evaluación de la asignatura.
• Todo alumno del grupo deberá conocer y entender el código que ha presentado.
• El programa debe ser robusto, es decir debe poder controlarse cualquier error en la medida de lo
posible y recuperarse del error en la medida de lo posible con las herramientas/conocimientos
adquiridos a lo largo del primer trimestre.
• El programa debe seguir las normas de estilo subidas por el aula virtual.
• NO se permite copiar/uso de código de terceras entidades, solo se puede usar el código creado por
los alumnos del grupo + librerías de java + código subido/realizado en clase. • Se realizará una
presentación donde se exponga el trabajo, así como sus partes y una explicación del enfoque realizado
de entre 5-10 minutos.
• Aunque el trabajo será en grupo, la evaluación será individual.
• Se deberá entregar de forma adjunta una documentación/memoria donde se explique el enfoque
realizado, partes del código más difíciles, cuantas horas han realizado cada miembro del grupo etc...
• Todo el código deberá tener un comentario explicativo, especialmente las partes más complejas.
• El código debe ser óptimo, escalable y reutilizable.
• La demo deberá tener una carga de información cada vez que se inicie el programa a modo de prueba 
*/
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


        String ususario_1 = usuario();
        String ususario_2 = usuario();
        String ususario_3 = usuario();
        String ususario_4 = usuario();
        String ususario_5 = usuario();



        String libro_1 = libro(null, "Cien años de soledad", "Gabriel García Márquez", "SM", "4ª");
        String libro_2 = libro(null, "El señor de los anillos ", " J. R. R. Tolkien", "Mondadori", "1ª");
        String libro_3 = libro(null, "1984", "George Orwell", "Tusquets", "1ª");
        String libro_4 = libro(null, "Un mundo feliz", "Aldous Huxley", "Malpaso", "3ª");
        String libro_5 = libro(null,"Orgullo y prejuicio", " Jane Austen", "Anagrama", "5ª");

        String revista_1 = revista(null,"TIME", " Joseph G. Cannon", "Anagrama", 73);
        String revista_2 = revista(null,"PEOPLE", " William Peter Blatty", "Tusquets", 21);
        String revista_3 = revista(null,"WIRED", "Grace Banchober", "Malpaso", 450);
        String revista_4 = revista(null,"NEW YORK MAGAZINE", "Super Woman", "Mondadori", 13);
        String revista_5 = revista(null,"NINTENDO POWER", "Alfredo Tikitiki", "SM", 263);

        String articulo_1 = articulo(null,"1/1/23", "La amnistia", "Luis Patino");
        String articulo_2 = articulo(null,"2/2/23", "Me pica la nariz", "Mosk Sint");
        String articulo_3 = articulo(null,"3/3/23", "Si es si", "DJ Tiesto");
        String articulo_4 = articulo(null,"4/4/23", "La caida de Mostoles", "Carlos Alcaraz");
        String articulo_5 = articulo(null,"5/5/23", "Avila bombardeada", "Luis Puigdemont");

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
                    case "libro_1":
                        System.out.println(libro_1);
                        break;
                    case "libro_2":
                        System.out.println(libro_2);
                        break;
                    case "libro_3":
                        System.out.println(libro_3);
                        break;
                    case "libro_4":
                        System.out.println(libro_4);
                        break;
                    case "libro_5":
                        System.out.println(libro_5);
                        break;
                    default:
                        break;
                }
                break;
            case "2":
                System.out.println("¿Que revista desea buscar?");
                String buscarRevista = scanner.nextLine();
                switch (buscarRevista) {
                    case "revista_1":
                        System.out.println(revista_1);
                        break;
                    case "revista_2":
                        System.out.println(revista_2);
                        break;
                    case "revista_3":
                        System.out.println(revista_3);
                        break;
                    case "revista_4":
                        System.out.println(revista_4);
                        break;
                    case "revista_5":
                        System.out.println(revista_5);
                        break;
                    default:
                        break;
                }
                break;
            case "3":
                System.out.println("¿Que articulo desea buscar?");
                String buscarArticulo = scanner.nextLine();
                switch (buscarArticulo) {
                    case "articulo1":
                        System.out.println(articulo_1);
                        break;
                    case "articulo_2":
                        System.out.println(articulo_2);
                        break;
                    case "articulo_3":
                        System.out.println(articulo_3);
                        break;
                    case "articulo_4":
                        System.out.println(articulo_4);
                        break;
                    case "articulo_5":
                        System.out.println(articulo_5);
                        break;
                    default:
                        break;
                }
                break;
        }

    }

    public static String usuario(String perteneciente, String ususario, String contrasena) {
        String InfoLibro = (
            "Perteneciente: " + perteneciente +
            "\nUsusario: " + ususario +
            "\nContrasena: " + contrasena
            );
    return InfoLibro;
}


    public static String libro(String perteneciente, String nombre, String autor, String editorial, String edicion) {
        String InfoLibro = (
                "Nombre: " + nombre +
                "\nAutor: " + autor +
                "\nEditorial: " + editorial +
                "\nEdicion: " + edicion
                );
        return InfoLibro;
    }

    static String revista(String perteneciente, String nombre, String grupoAutores, String editorial, int numRevista) {
        String InfoRevista = (
                "Nombre: " + nombre +
                "\nAutores: " + grupoAutores +
                "\nEditorial: " + editorial +
                "\nNºRevista: " + numRevista
                );
        return InfoRevista;
    }

    static String articulo(String perteneciente, String fechaPublicacion, String nombre, String autorEs) {
        String InfoArticulo = (
                "Fecha de publicacion: " + fechaPublicacion +
                "\nNombre: " + nombre +
                "\nAutores: " + autorEs
                );
        return InfoArticulo;
    }
}