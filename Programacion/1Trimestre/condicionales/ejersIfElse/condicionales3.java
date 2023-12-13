/*Escribe un programa pida por pantalla un numero y muestre el numero si es negativo, 0
le sume 500 si es positivo y le reste 12 si vale cero. */
package condicionales.ejersIfElse;
import java.util.Scanner;
public class condicionales3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String numS = sc.nextLine();
        
        int num = Integer.parseInt(numS);

        if(num<0){
            System.out.println(num);
        }else if(num>0){
            System.out.println(num+500);
        }else{
            System.out.println(num-12);
        }  
    }
}
