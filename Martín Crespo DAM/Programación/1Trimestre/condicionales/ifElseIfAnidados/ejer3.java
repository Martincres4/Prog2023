/*Escribe un programa pida por pantalla un numero y muestre el numero si es negativo,de lo 
contrario le sume 500 si es positivo */
package condicionales.ifElseIfAnidados;
import java.util.Scanner;
public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String numS = sc.nextLine();
        int num = Integer.parseInt(numS);
        boolean negativo = false;   

        if(num<0){
            negativo=true;
        }

        if(negativo){
            System.out.println(num);
        }else{
            num+=500;
            System.out.println(num);
        }
    }
    }
