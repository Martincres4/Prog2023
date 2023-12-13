/*Calcular el factorial. multiplicar todos los números enteros positivos que hay
 entre ese número y el 1 */
package bucles.ejsFor;
import java.util.Scanner;
public class ej9 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int resultado=1;
		
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		
		for(int i=numero;i>0;i--) {
			resultado = resultado * i;
			
		}
		System.out.println("El factorial de " + numero + " es " + resultado);

	}

}
