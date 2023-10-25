/*Escribir un programa que pregunte al usuario su edad y muestre por 
pantalla todos los años que ha cumplido (desde 1 hasta su edad). */
package bucles;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Introducetu edad");
        String edadS = sc.nextLine();
        int edad = Integer.parseInt(edadS);
        while(i<edad){
            System.out.println(i);
            i ++;
        }  
    }    
}
