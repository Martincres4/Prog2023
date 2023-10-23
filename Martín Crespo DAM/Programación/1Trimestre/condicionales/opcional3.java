/*-Dado 3 lados, determina si se puede formar un triangulo equilatero, 
isosceles o escaleno
 */
package condicionales;
import java.util.Scanner;
public class opcional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un lado del triángulo: ");
        String lado1S = sc.nextLine();
        int lado1 = Integer.parseInt(lado1S);
        System.out.println("Introduce otro lado del triángulo: ");
        String lado2S = sc.nextLine();
        int lado2 = Integer.parseInt(lado2S);
        System.out.println("Introduce ul tercer lado del triángulo: ");
        String lado3S = sc.nextLine();
        int lado3 = Integer.parseInt(lado3S);
        if(lado1==lado2 && lado2==lado3){
            System.out.println("El triángulo es equilátero.");
        }else if(lado1==lado2 || lado2==lado3){
            System.out.println("El triángulo es isósceles.");
        }else{
            System.out.println("El triángulo es escaleno.");
        }
    }
}
