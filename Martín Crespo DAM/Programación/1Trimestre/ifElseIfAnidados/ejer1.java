/*Modificar el ejercicio de la ecuacion de segundo grado para que solo 
muestre dos soluciones si solo tiene dos, una solucion si solo tiene una 
y ninguna solucion si no tiene ninguna posible( y por que) */
package ifElseIfAnidados;
import java.util.Scanner;
public class ejer1 {
    public static void main(String[] args) {
        String opaS, opbS, opcS;
        double opa, opb, opc, raiz, res1, res2;
        // ecuaciones de segundo grado, formula: (-b±√(b²-4ac))/(2a)
        System.out.println("Calculadora para ecuaciones de segundo grado.\nEcuacion: ax^2+bx+c=0\nA continuacion ingrese los valores");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un valor para a : ");
        opaS = entrada.nextLine();
        opa = Double.parseDouble(opaS);

        System.out.print("Ingrese un valor para b : ");
        opbS = entrada.nextLine();
        opb = Double.parseDouble(opbS);

        System.out.print("Ingrese un valor para c : ");
        opcS = entrada.nextLine();
        opc = Double.parseDouble(opcS);

        raiz = Math.sqrt(Math.pow(opb, 2) - 4 * opa * opc);

        res1 = (-opb + raiz) / (2 * opa);
        res2 = (-opb - raiz) / (2 * opa);

        if(!Double.isNaN(res1) && !Double.isNaN(res2)&& res1!=res2 ){
            System.out.println("Sol 1: " + res1 + "\nSol 2: " + res2);
        }
        if(Double.isNaN(res1) && Double.isNaN(res2)){
            System.out.println("No hay soluciones.");
        }
        if(res1==res2){
            System.out.println("Sol: " + res1);
        }
  
    }

}
