/*Esciba un programa que pida una cadena y si su tamaño es menor a 5, añada 5 espacios en blanco */
package condicionales.ejersIfElse;
import java.util.Scanner;
public class condicionales5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        
        if(cadena.length()<5){
            cadena += "     ";
            System.out.println(cadena);
        }else{
            cadena = cadena;
            System.out.println(cadena);
        }
    
    }
    
}
