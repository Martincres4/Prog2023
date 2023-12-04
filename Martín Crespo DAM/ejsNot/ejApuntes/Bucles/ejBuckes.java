package ejApuntes.Bucles;
import java.util.Scanner;
public class ejBuckes {
    static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        //        ----------EJERCICIOS DE BUCLES-----------------------------
        //Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces.
        System.out.println("Introduce una palabra");
        int contador = 0;
        String palabra = sc.nextLine();
        while(contador<3){
            System.out.println(palabra);
            contador++;
        }
        

        //Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
        //Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
        //Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
        //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.
        /*	EJEMPLO:
            *
            **
            ***
            ****
            ***** */
        //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo.
        /*  1
            3 1
            5 3 1
            7 5 3 1
            9 7 5 3 1 */
        //Escribir un programa que pida al usuario una palabra y luego muestre por pantalla una a una las letras de la palabra introducida empezando por la última.
        //Escribir un programa en el que se pregunte al usuario por una frase y una letra, y muestre por pantalla el número de veces que aparece la letra en la frase.
        //Calcular el factorial
        //Evaluar si una cadena de texto puede transformarse en int(y hacerlo en caso positivo)
        //Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un número primo o no.


        //-------------------MAS BUCLES---------------------------

        //Programa que pida al usuario dos numeros(suponemos que mete el dato bien) y recorre entre dos numeros hasta encontrar el primer impar.
        //Programa que pida al usuario una cadena y determine si es un palindromo
        //mostrar toda la tabla asci(usar bucle while aunque sea peor)

        //-----------------------ARRAYS---------------------------------------------------------------------

        //Crea un método devuelva un array (int) de 10 posiciones.
        //Crea un método en el que le pasamos un array ya instanciado y devuelva valores aleatorios (int   20-30) .
        //Crea un procedimiento que imprima todos los valores que hay en un array pasado por parámetro.
        //Crea un método que pida al usuario 10 numeros y guardalos, para luego mostrarlos en orden inverso al que se han introducido

        //Crea un método que divida una cadena de caracteres separados por espacio en posiciones dentro del array(Ej: hola me llamo pepe ->["hola"]["me"]["llamo"]["pepe"])
        //Crea un método que guarde todos los caracteres de la tabla ASCII
        //Crea una funcion que imprima todos los caracteres de la tabla ASCII


        //***IGNORAR ESTOS HASTA UN POCO MAS ADELANTE**///
        //Extra dificil
        //Crea un método para ordenar un array de la forma mas eficiente(no se puede usar metodos ya existentes) 
        //Crea un método que dado un array ordenado, encuentre de la forma mas eficiente un numero en específico(devuelva su posicion)
        //Crea un método que migre todos los datos de un array a otro de mayor tamaño(por ejemplo de un array de tamaño 10 a otro de tamaño 20)



        ///ARRAYS MULTIDIMIENSIONALES


        //crea un método que instancie un array de dos dimensiones , cuyo tamaño esta dado por el usuario y sus valores sean aleatorios(entre -23 y +509)
        //crea una funcion que muestre por pantalla todos los valores de un array de dos dimensiones
        //crea un método que devuelva la posicion del primer 0 que encuentre en un array de dos dimensiones
        //crea un método que devuelva la  ultima posicion del primero 0 que encuentre en un array de dos dimensiones
        //crea una funcion que dado un array de 4 dimensiones, muestra todo su contenido
        //crea una funcion que dado un array de 4 dimensiones, devuelva si en su contenido hay un par

    
    
    
    }
    
}
