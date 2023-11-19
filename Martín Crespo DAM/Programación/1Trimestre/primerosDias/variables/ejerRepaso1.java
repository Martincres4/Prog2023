/*Ejercicios extra de repaso
- Dado 3 articulos de ropa, cada uno vale 40e 100e y 400e respectivamente, debido a que son rebajas, si el articulo vale mas de 50 euros se realiza un 
descuento del 10%, si vale mas de 80 se aplica un descuento del 13% y si vale mas de 500e se aplica un descuento del 30%(descuentos no acumulables).
Escribe un programa que calcule el importe total si compro dos articulos del primero, tres del segundo y uno del tercero.*/
package primerosDias.variables;
import java.util.Scanner;
public class ejerRepaso1{
    public static void main(String[] args){
    double art1, art2, art3; 
    art1 = 40;
    art2 = 100;
    art3 = 400;
    double total;

    if(art1>50){
        double operando = art1 * 0.10;
        art1 = art1 - operando;
    }else if(art1>80){
        double operando = art1 * 0.13;
        art1 = art1 - operando;
    }else if(art1>500){
        double operando = art1 * 0.30;
        art1 = art1 - operando;
    }else{

    }
    total = 2 * art1 + 3 * art2 + 1 * art3;
    System.out.println("El resultado total sería: " + total);



    /*-Escribe un programa que convierta los metros a millas( por ejemplo 45670 metros, cuantas millas son). */
    Scanner sc = new Scanner(System.in);
    double metro, milla;
    System.out.println("Introduce los metros que quieres pasar a millas: ");
    double aCambiar = sc.nextDouble();
    double cambiado = 0.00062137 * aCambiar;
    System.out.println("Esos metro en millas son: " + cambiado);



    /*-Escribe un programa que muestre el resto(% simbolo del resto) de una division (por ejemplo 5/2 tiene como resto 1). */
    Scanner sc2 = new Scanner(System.in);
    System.out.print("Ingrese el dividendo: ");
    int dividendo = sc2.nextInt();
    
    System.out.print("Ingrese el divisor: ");
    int divisor = sc2.nextInt();
    
    int resto = dividendo % divisor;
    
    System.out.println("El resto de la división " + dividendo + " / " + divisor + " es: " + resto);
    



    /*-Escribe un programa que intercambia el valor de dos variables (por ejemplo variable=5, variable2=10 -> variable=10,variable2=5)*/
    int varCerveza = 324;
    int varVino =555;
    int aux = varCerveza;
    varCerveza = varVino;
    varVino = aux;
    System.out.println(varCerveza);
    System.out.println(varVino);
    }
}