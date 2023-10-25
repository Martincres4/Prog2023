/*Escribir un programa que pida al usuario un número entero positivo 
y muestre por pantalla la cuenta atrás desde ese número hasta cero 
separados por comas. */
package bucles;
import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Introduce un número entero positivo");
        String numS = sc.nextLine();
        int num = Integer.parseInt(numS);
        while(num>-1){
           System.out.printf(num+",");
            num--;          
        }  
    }    
} 

