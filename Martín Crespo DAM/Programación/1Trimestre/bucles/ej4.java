/*Escribir un programa que pida al usuario un número entero positivo 
y muestre por pantalla la cuenta atrás desde ese número hasta cero 
separados por comas. */
package bucles;
import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero positivo");
        String numS = sc.nextLine();
        int num = Integer.parseInt(numS);
        
        for(int i=1;num>=0;num--){
            if(num!=0){
                System.out.printf(num+",");
            }else{
                System.out.print(num);
            }         
        }  
    }    
} 

