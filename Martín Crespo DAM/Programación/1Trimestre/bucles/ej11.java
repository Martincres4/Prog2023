/*Escribir un programa que pida al usuario un número entero y muestre 
por pantalla si es un número primo o no. */
package bucles;
import java.util.Scanner;
public class ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean primo= true;

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        for (int i = 2;numero >= i * i; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
        
    }
}
