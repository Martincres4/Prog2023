package Strings;

public class ejersRepaso {
    public static void main(String[] args){


        System.out.println("Programa que concatene dos cadenas de caracteres");
        String frase1 = "Un saludo ";
        String frase2 = "para ti";
        System.out.println(frase1 + frase2);


        System.out.println("\nPrograma que muestre por pantalla el tamaño de una cadena");
        String tamano = "Como estan los xavale";
        System.out.println(tamano.length());


        System.out.println("\nPrograma que muestre si en una cadena dada existe el caracter 'h'");
        String existe = "havion";
        System.out.println(existe.contains("h"));


        System.out.println("\nPrograma que muestre la posicion en una cadena de un caracter previamente declarado");
        char caracter = 'd';
        String posicion="Son las seis del martes";
        System.out.println(posicion.lastIndexOf(caracter));


        System.out.println("\nPrograma que extrae una cadena de una cadena mayor en base a dos posiciones dadas");
        String mayor = "Un buen dia de verano";
        System.out.println(mayor.substring(3, 6));


        System.out.println("\nPrograma que extrae una cadena de una cadena mayor en base a una posicion dadas");
        String mayor2 = "Un buen dia de verano";
        System.out.println(mayor2.substring(3));


        System.out.println("\nPrograma que cambia la cadena todo a mayusculas");
        String aMayus ="todo en mayus";
        System.out.println(aMayus.toUpperCase());


        System.out.println("\nPrograma que cambia la cadena todo a minusculas ");
        String aMinus ="TODO EN MINUS";
        System.out.println(aMinus.toLowerCase());
        
    }
}