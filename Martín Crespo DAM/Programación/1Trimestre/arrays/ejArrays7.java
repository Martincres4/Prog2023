//Crea un método que guarde todos los caracteres de la tabla ASCII
//Crea una funcion que imprima todos los caracteres de la tabla ASCII-
package arrays;

public class ejArrays7 {
    public static void main(String[] args) {
        char[] tabla = obtenerTablaASCII();
        System.out.println("\nCaracteres de la Tabla ASCII:");
        imprimirTablaASCII(tabla);
    }

    // Método para guardar todos los caracteres de la tabla ASCII en un array de caracteres
    public static char[] obtenerTablaASCII() {
        char[] tablaASCII = new char[256];

        for (int i = 0; i <= 255; i++) {
            tablaASCII[i] = (char) i;
        }

        return tablaASCII;
    }

    // Función para imprimir todos los caracteres de la tabla ASCII desde un array de caracteres
    public static void imprimirTablaASCII(char[] tabla) {
        for (int i = 0; i <= 255; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}

