/*Escribir un programa que pregunte al usuario su edad y muestre por 
pantalla todos los años que ha cumplido (desde 1 hasta su edad). */
package bucles;
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducetu edad");
        String edadS = sc.nextLine();
        int edad = Integer.parseInt(edadS);
        for(int i =1; i<edad;i++){
            System.out.println(i);
        }  
    }    
}
