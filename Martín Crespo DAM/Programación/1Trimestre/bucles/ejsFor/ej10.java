/*Evaluar si una cadena de texto puede transformarse en int
(y hacerlo en caso positivo) */
package bucles.ejsFor;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean pasable = false;

        System.out.print("Ingrese una cadena de texto: ");
        String cadenaTextoS = scanner.nextLine();

        if(
            cadenaTextoS.contains("0")||cadenaTextoS.contains("1")||
            cadenaTextoS.contains("2")||cadenaTextoS.contains("3")||
            cadenaTextoS.contains("4")||cadenaTextoS.contains("5")||
            cadenaTextoS.contains("6")||cadenaTextoS.contains("7")||
            cadenaTextoS.contains("8")||cadenaTextoS.contains("9")||
            cadenaTextoS.contains("!")
            ){
            System.out.println("tiene numeros");
            pasable=true;
        }
        
        if(pasable){
            System.out.println("La cadena se pudo convertir a un entero: " + cadenaTextoS);           
        }else{
            System.out.println("La cadena no se pudo convertir a un entero.");
        }
    }
}
