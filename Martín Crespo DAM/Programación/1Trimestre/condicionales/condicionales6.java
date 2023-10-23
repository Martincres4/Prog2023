/*Escriba un programa que pida dos cadenas y si son iguales lo diga por pantalla */
package condicionales;
import java.util.Scanner;
public class condicionales6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena1 = sc.nextLine();
        System.out.println("Introduce una cadena: ");
        String cadena2 = sc.nextLine();

        if(cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("Las dos cadenas son iguales.");
        }
    }    
}
