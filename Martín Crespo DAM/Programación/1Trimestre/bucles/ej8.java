/*Escribir un programa en el que se pregunte al usuario por una frase y 
una letra, y muestre por pantalla el número de veces que aparece la letra 
en la frase */
package bucles;
import java.util.Scanner;
public class ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }
   
}
