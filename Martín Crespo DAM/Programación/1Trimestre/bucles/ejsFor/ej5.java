/*Escribir un programa que pida al usuario un número entero y 
muestre por pantalla un triángulo rectángulo como el de más abajo, 
de altura el número introducido */
package bucles.ejsFor;
import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducetu un número entero");
        String numS = sc.nextLine();
        int num = Integer.parseInt(numS);

        for(int i=0;i<num; i++){
            System.out.println();
            for(int j = -1; j<i; j++){
                System.out.printf("*");
            }
        }
        
            
            String cadena = sc.nextLine();
            int numero = Integer.parseInt(cadena);
            int aux2=-1;
            String aux="";
            for(int x=1;x<=numero;x++){
                aux2+=2;
                aux=+aux2+" ".concat(aux);
                System.out.println(aux);
            }
         
    }  
}