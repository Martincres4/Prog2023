/*Escriba un programa que pida una cadena, si la cadena esta en minusculas 
que lo convierta a mayusculas y si esta en mayusculas que lo convierta en 
minusculas */
/*Character. isUpperCase().*/
package condicionales.ejersIfElse;

import java.util.Scanner;

public class condicionales8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();

        if(Character.isUpperCase(cadena.charAt(0))){          
            System.out.println(cadena.toLowerCase());        
        }else{                  
            System.out.println(cadena.toUpperCase());   
        }
    }
}
