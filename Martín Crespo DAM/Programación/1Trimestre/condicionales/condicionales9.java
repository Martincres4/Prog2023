/*pide tres numeros y los muestre de forma ordenada(ej: 5,4,7 - > 4,5,7) */
package condicionales;
import java.util.Scanner;
public class condicionales9 {
    public static void main(String[] args) {
        String num1S, num2S, num3S;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1S = sc.nextLine();
        System.out.println("Introduce otro número: ");
        num2S = sc.nextLine();
        System.out.println("Introduce un tercer número: ");
        num3S = sc.nextLine();

        int num1 = Integer.parseInt(num1S);
        int num2 = Integer.parseInt(num2S);
        int num3 = Integer.parseInt(num3S);

        if(num1>num2 && num2>num3){
            System.out.println(num3 + "," + num2 + "," + num1);
        }else if(num2>num1 && num1>num3){
            System.out.println(num3 + "," + num1 + "," + num2);
        }else if(num3>num2 && num1>num3){
            System.out.println(num2 + "," + num3 + "," + num1);
        }else if(num3>num1 && num1>num3){
            System.out.println(num2 + "," + num1 + "," + num3);
        }else if(num1>num2 && num3>num1){
            System.out.println(num1 + "," + num2 + "," + num3);
        }else if(num3>num1 && num2>num3){
            System.out.println(num1 + "," + num3 + "," + num2);
        }  
    }
    
}
