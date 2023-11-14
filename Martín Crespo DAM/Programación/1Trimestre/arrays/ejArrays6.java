//Crea un método que divida una cadena de caracteres separados por espacio en posiciones dentro del array(Ej: hola me llamo pepe ->["hola"]["me"]["llamo"]["pepe"])
package arrays;

import java.util.Scanner;

public class ejArrays6 {
    public static void main(String[] args) {
        devuelveArray();
    }

    static void devuelveArray() {
        Scanner sc = new Scanner(System.in);

        String[] array1 = {"hola", "me", "llamo", "pepe"};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");  
        }
    }
}
