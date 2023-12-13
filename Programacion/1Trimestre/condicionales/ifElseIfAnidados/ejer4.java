/*Pide un numero, si es par, debera sumarle 10(de lo contrario sumar 1), si es mayor que 
500, le restara 10, ademas  si es divisible entre 5 multiplicarlo por 3*/
package condicionales.ifElseIfAnidados;
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        boolean par = false;
        boolean mayor = false;
        boolean divisible = false;
        String numS;
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numS = sc.nextLine();
        num = Integer.parseInt(numS);
        
        if (num % 2 == 0) {
            par = true;
        }
        if (num > 500) {
            mayor = true;
        }
        if (num % 5 == 0) {
            divisible = true;
        }

        if (par) {
            num += 10;
            if (mayor) {
                num -= 10;
            }
            if (divisible) {
                num = num * 3;
            }
        } else {
            num = num + 1;
            if (mayor) {
                num -= 10;
            }
            if (divisible) {
                num *= 3;
            }
        }
        System.out.println(num);
    }
}
