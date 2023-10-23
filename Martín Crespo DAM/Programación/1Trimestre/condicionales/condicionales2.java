/*Crea un programa que pida dos numeros y muestre solo el mas grande */
package condicionales;
import java.util.Scanner;
public class condicionales2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String num1S = sc.nextLine();
    
        System.out.println("Introduce otro número: ");
        String num2S = sc.nextLine();

        int num1 = Integer.parseInt(num1S);
        int num2 = Integer.parseInt(num2S);

        if(num1<num2){
            System.out.println(num2);
        }
        if(num2<num1){
            System.out.println("El número mayor es: " + num1);
        }
    
    }
    
}
