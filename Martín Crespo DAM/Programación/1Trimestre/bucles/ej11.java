/*Escribir un programa que pida al usuario un número entero y muestre 
por pantalla si es un número primo o no. */
package bucles;
import java.util.Scanner;
public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num = sc.nextInt();
        if(num){
            System.out.println("El número es primo.");
        }else{
            System.out.println("El número no es primo");
        }
    


    }
}
