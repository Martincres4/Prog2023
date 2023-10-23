/*Escriba un programa que pida un numero de una cifra, si el 
numero no tiene el formato correcto, que lo diga por pantalla  */
package condicionales;
import java.util.Scanner;
public class condicionales7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de una cifra: ");
        String numS = sc.nextLine();
        int num = Integer.parseInt(numS);
        
        if(num>=10){
           System.out.println("El número no es de una cifra");
        }   
    }    
}