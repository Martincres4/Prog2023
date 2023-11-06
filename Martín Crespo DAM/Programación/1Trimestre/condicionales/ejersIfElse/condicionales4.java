/*Escriba un programa que pida un año y diga si es bisiesto. Año bisiesto es el divisible entre 4, salvo que sea año secular -último de cada siglo, 
terminado en «00»-, en cuyo caso también ha de ser divisible entre 400.*/
package condicionales.ejersIfElse;
import java.util.Scanner;
public class condicionales4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un año: ");
        String anoS = sc.nextLine();

        String ultimosS = anoS.substring((anoS.length()-2), anoS.length());
        int ano = Integer.parseInt(anoS);
        int ultimos = Integer.parseInt(ultimosS);

        if((ultimos==00 && ano%4==0 && ano%400==0) || ((ano%4==0 || ano==0) && ultimos != 00)){
            System.out.println("El año es bisiesto.");
        }else{
            System.out.println("El año no es bisiesto.");
        }  
    }    
}
