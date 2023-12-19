/*Escribir un programa que pida al usuario una palabra y luego muestre 
por pantalla una a una las letras de la palabra introducida empezando 
por la última */
//package bucles.ejsFor;
import java.util.Scanner;
public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();
        for(int i = palabra.length(); i<0;i--){
            System.out.println(palabra.charAt(i));    
        }
    }
}