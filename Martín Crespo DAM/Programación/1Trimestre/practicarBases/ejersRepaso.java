package practicarBases;
import java.util.Scanner;
public class ejersRepaso {
    public static void main(String[] args){
        //Escribir un programa utilizando operadores ternarios en que si una persona tiene mas de 18 años se le asigne la letra 'M' de lo contrario que se le asigne 'm'
        int edad = 23;
        char mayoria = edad >= 18 ? 'M' : 'm';
        System.out.println("Es: " + mayoria);
        
        //Escribir un programa utilizando operadores ternarios en que si el area de una esfera es menor a 1 su valor devuelve 1.
        double area = 0.5;
        double resultado = area < 1 ? 1 : area;
        System.out.println("El área es: " + resultado);

        //Escribir un programa utilizando operadores ternarios en que si una persona es varon ('v') devuelva 500 y si es hembra devuelva 700.
        char genero ='v';
        int sueldo = (genero == 'v') ? 500 : 700;  
        System.out.println("El sueldo es: " + sueldo);
        
        //Escribir un programa utilizando operadores ternarios se le pasa true calcula el area de un circulo y si devuelve false calcule el area de un rectangulo
            boolean calcularCirculo = true;
            double radio, ancho, altura;
            radio = 23;
            ancho = 12.3;
            altura = 7;
            double area3 = calcularCirculo ? (Math.PI * radio * radio) : (ancho * altura);
            System.out.println("El área es: " + area3);
        
        }
    
    }

        

