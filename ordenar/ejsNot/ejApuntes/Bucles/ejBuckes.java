package ejApuntes.Bucles;
import java.util.Scanner;
public class ejBuckes {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        //        ----------EJERCICIOS DE BUCLES-----------------------------
        //Escribir un programa que pida al usuario una palabra y la muestre por pantalla 10 veces.
        
        /*System.out.println("Introduce una palabra");
        int contador = 0;
        int contador2 = 0;
        String palabra = sc.nextLine();
        while(contador<2){
            System.out.println(palabra);
            contador++;
        }
        System.out.println("\n\n");
        do{ 
            contador2++;
            System.out.println(palabra);
        }while(contador2<3);
        System.out.println("\n\n");
        for(int i = 0; i<3;i++){
            System.out.println(palabra);
        }*/
        

        //Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
        
        /*System.out.println("Introduzca su edad: ");
        String edadS = sc.nextLine();
        int edad = Integer.valueOf(edadS);
        for(int i = 0;edad>i;edad--){
            System.out.println(edad);

        }*/

        //Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
        
        /*System.out.println("Introduce un númerp: ");
        String num1S = sc.nextLine();
        int num1 = Integer.valueOf(num1S);
        for(int i=0;i<num1;num1--){
            if(num1%2!=0){
                System.out.println(num1);
            }

        }*/
        

        //Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
        /*System.out.println("Introduzca su edad: ");
        String edad2S = sc.nextLine();
        int edad2 = Integer.valueOf(edad2S);
        for(int i = 0;edad2>=i;edad2--){
            if(edad2 == 0){ 
                System.out.println(edad2);
            }else{
                System.out.print(edad2 + ", ");

            }*/
            
        
        //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.
        /*	EJEMPLO:
            *
            **
            ***
            ****
            ***** */
            /* 
        System.out.print("Introduce un número para hacer la piramide: ");
        String num3S = sc.nextLine();
        int num3 = Integer.valueOf(num3S);        
        for(int i=0;i<=num3;i++){
            for(int j= 0;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
            
        }*/
        
        System.out.print("Introduce un número para hacer la pirámide: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i += 2) {
            // Imprimir números en orden descendente en cada fila
            for (int j = i; j >= 1; j -= 2) {
                System.out.print(j + " ");
            }
            // Cambiar de línea después de imprimir los números
            System.out.println();
        }
    


        //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo.
        /*  1
            3 1
            5 3 1
            7 5 3 1
            9 7 5 3 1 */
       /* System.out.println("int num");
        String num3S = sc.nextLine();
        int num3 = Integer.valueOf(num3S); 

        int numImp = 1;
        System.out.println();

        for(int i=0;i<num3;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(numImp + " ");
                numImp +=2;             
            }
            numImp = 1;
            System.out.println( );
        }
    
        for (int i = 1; i <= num3; i++) {
            // Imprimir espacios en blanco al principio de cada fila
            for (int k = num3 - i; k > 0; k--) {
                System.out.print("  ");
            }

            // Imprimir números en orden descendente en cada fila
            for (int j = i * 2 - 1; j >= 1; j -= 2) {
                System.out.print(j + " ");
            }

            // Cambiar de línea después de imprimir los números
            System.out.println();
        }*/
    



        //Escribir un programa que pida al usuario una palabra y luego muestre por pantalla una a una las letras de la palabra introducida empezando por la última.
        /*System.out.println("Introduce una palabra: ");
        String pal = sc.nextLine();
        for(int i=0;i<pal.length();i++){
            System.out.print(pal.charAt(i));
        }*/


        //Escribir un programa en el que se pregunte al usuario por una frase y una letra, y muestre por pantalla el número de veces que aparece la letra en la frase.
        /*System.out.println("Introduce una palabra: ");
        String pal = sc.nextLine();
        System.out.println("Introduce una letra: ");
        String le = sc.nextLine();
        char ci = le.charAt(0);

        int contador=0;
        
        for(int i=0;i<pal.length();i++){
            if(pal.charAt(i) == ci){
                contador ++;

            }
        }
        System.out.println(contador);*/

        //Calcular el factorial
        //Evaluar si una cadena de texto puede transformarse en int(y hacerlo en caso positivo)
        //Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un número primo o no.


        //-------------------MAS BUCLES---------------------------

        //Programa que pida al usuario dos numeros(suponemos que mete el dato bien) y recorre entre dos numeros hasta encontrar el primer impar.
        //Programa que pida al usuario una cadena y determine si es un palindromo
        //mostrar toda la tabla asci(usar bucle while aunque sea peor)
        /*int i = 0; // Valor inicial de la tabla ASCII

        while (i <= 126) { // Valor final de la tabla ASCII
            System.out.println("Código ASCII: " + i + ", Carácter: " + (char) i);
            i++;
        }*/

        //-----------------------ARRAYS---------------------------------------------------------------------
       
            for (int i : queloque(10)) {
                System.out.println(i);
            }
        

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
    public static int[] queloque(int size){
        int [] array1 = new int[size];
        //Crea un método devuelva un array (int) de 10 posiciones.
        for(int i = 0; i < array1.length;i++){
            array1[i]= (int)(Math.random()*(30-20)+20);
            
        }
        return array1;

    }

}
    

