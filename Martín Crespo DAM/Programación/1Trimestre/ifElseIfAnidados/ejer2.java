/*Crea un programa que pida dos numeros y si el primero es el mas grande, muestralo por 
pantalla de lo contrario dividir el numero entre un numero aleatorio entre 3 y 5 */
package ifElseIfAnidados;
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        boolean mayor=false;
        double random;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String num1S = sc.nextLine();
        double num1 = Integer.parseInt(num1S);

        System.out.println("Introduce un número: ");
        String num2S = sc.nextLine();
        double num2 = Integer.parseInt(num2S);

        if(num1>num2){
            mayor=true;
        }

        if(mayor){
            System.out.println(num1);
        }else{
            random=(Math.random()*(5 - 3))+3;
            num1=num1/random;
            System.out.println(random);
            System.out.println("EL primer número entre un aleatorio entre 3 y 5 sería: " + num1);
        }  
    }   
}
