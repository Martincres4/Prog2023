/*
Hacer un programa que muestre la salida con la constante PI y a continuación que calcule y muestre el area de un círculo de radio de valor 2 metros.
Datos : Area = PI * r² = PI * r * r.
*/

import java.util.Scanner;
public class ej020203 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el radio del circulo del que quieres sacar el area: ");
        double radio = sc.nextDouble();
        areaCirculo(radio);
    }
    
    public static void areaCirculo(double radio){
        double area = Math.PI * radio*radio;
        System.out.println("El area del circulo es: " + area);


    }
}
