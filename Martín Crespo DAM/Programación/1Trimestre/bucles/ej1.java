/*Escribir un programa que pida al usuario una palabra y la muestre por 
pantalla 10 veces. */
package bucles;
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();
        for(int i = 1; i<10; i++){
            System.out.println(palabra);

        }  
    }    
}
