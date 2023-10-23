/*Modificar el ejercicio de la ecuacion de segundo grado para que solo 
muestre dos soluciones si solo tiene dos, una solucion si solo tiene una 
y ninguna solucion si no tiene ninguna posible( y por que) */
package ifElseIfAnidados;
import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {
        String entradaXCuadrado, entradaX, entradaResto;
        double opXCuadrado, opX, resto, raiz, resultado1, resultado2;
        // ecuaciones de segundo grado, formula: (-b±√(b²-4ac))/(2a)
        System.out.println("Calculadora para ecuaciones de segundo grado.\nEcuacion: ax^2+bx+c=0\nA continuacion ingrese los valores");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un valor para a : ");
        entradaXCuadrado = entrada.nextLine();
        opXCuadrado = Double.parseDouble(entradaXCuadrado);

        System.out.print("Ingrese un valor para b : ");
        entradaX = entrada.nextLine();
        opX = Double.parseDouble(entradaX);

        System.out.print("Ingrese un valor para c : ");
        entradaResto = entrada.nextLine();
        resto = Double.parseDouble(entradaResto);

        raiz = Math.sqrt(Math.pow(opX, 2) - 4 * opXCuadrado * resto);

        String error = Double.isNaN(raiz) ? "La ecuación no tiene solucion." : "Los resultados son:";

        resultado1 = (-opX + raiz) / (2 * opXCuadrado);
        resultado2 = (-opX - raiz) / (2 * opXCuadrado);

        System.out.printf("%s\nx1:%f\nx2:%f\n", error, resultado1, resultado2);

        boolean soluciones = true;
        boolean sinSol = true;
        boolean soloSol1 = true;
        boolean soloSol2 = true;
        if(resultado1 == Double.NaN && resultado2 == Double.NaN){
            soluciones=true;
        }
        if(resultado1 != Double.NaN && resultado2 != Double.NaN){
            sinSol=true;
        }
        if(resultado1 != Double.NaN && resultado2 == Double.NaN){
            soloSol2=true;
        }
        if(resultado1 == Double.NaN && resultado2 != Double.NaN){
            soloSol1=true;
        }
        if(soluciones){
            System.out.println("Sol 1: " + resultado1 + "\nSol 2: " + resultado2);
        }
        if(sinSol){
            System.out.println("No hay soluciones.");
        }
        if(soloSol1){
             System.out.println("Sol 1: " + resultado1);
        }
        if(soloSol2){
            System.out.println("Sol 2: " + resultado2);

        }
    }

}
