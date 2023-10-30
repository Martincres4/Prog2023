/*Escribir un programa que pida al usuario un número entero positivo y 
muestre por pantalla todos los números impares desde 1 hasta ese número 
separados por comas. */
package bucles;
import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo");
        String numS = sc.nextLine();
        int num = Integer.parseInt(numS);
        for(int i=1;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
                i ++;
            }
        }  
    }    
}
