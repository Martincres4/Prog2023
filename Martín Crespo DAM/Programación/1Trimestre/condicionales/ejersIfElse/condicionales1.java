/*Modificar el ejercicio de la ecuacion de segundo grado para que solo muestre dos soluciones si solo tiene dos, 
una solucion si solo tiene una y ninguna solucion si no tiene ninguna posible( y por que)*/
package condicionales.ejersIfElse;
import java.util.Scanner;
public class condicionales1 {
    public static void main(String[] args) {
        String entradaXCuadrado, entradaX, entradaResto;
        double opXCuadrado, opX, resto, raiz, res1, res2;
        
        // ecuaciones de segundo grado, formula: (-b±√(b²-4ac))/(2a)
        System.out.println(
                "Calculadora para ecuaciones de segundo grado.\nEcuacion: ax^2+bx+c=0\nA continuacion ingrese los valores");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un valor para a : ");
        entradaXCuadrado = entrada.nextLine();

        System.out.print("Ingrese un valor para b : ");
        entradaX = entrada.nextLine();

        System.out.print("Ingrese un valor para c : ");
        entradaResto = entrada.nextLine();

        opXCuadrado = Double.parseDouble(entradaXCuadrado);
        opX = Double.parseDouble(entradaX);
        resto = Double.parseDouble(entradaResto);

        raiz = Math.sqrt(Math.pow(opX, 2) - 4 * opXCuadrado * resto);

        res1 = (-opX + raiz) / (2 * opXCuadrado);
        res2 = (-opX - raiz) / (2 * opXCuadrado);

        if (!Double.isNaN(raiz) && res1 != res2) {
            System.out.println("La primera solución sería: " + res1 +
                    "\nLa segunda solución sería: " + res2);
        } else if (!Double.isNaN(raiz) && res1 == res2) {
            System.out.println("La única solución sería: " + res1);
        } else if (Double.isNaN(raiz)) {
            System.out.println("No hay resultados");
        }
    }
}
