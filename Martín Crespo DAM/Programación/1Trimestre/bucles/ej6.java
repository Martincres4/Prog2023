/*Escribir un programa que pida al usuario un número entero y muestre 
por pantalla un triángulo rectángulo como el de más abajo.
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1 */
package bucles;
import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 2 * i - 1; j >= 1; j -= 2) {
                System.out.print(j);
                if (j > 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        String cadena = scanner.nextLine();
        for(int x = cadena.length();x>0;x--){
            System.out.println(cadena.charAt(x-1));
        }
    }
} 

