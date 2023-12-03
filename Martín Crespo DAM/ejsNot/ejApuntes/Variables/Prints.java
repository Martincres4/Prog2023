package ejApuntes.Variables;

import java.util.Scanner;
public class Prints {
    public static final double PI=3.14159265358979323846;
    public static void main (String[] args){
        

        Scanner sc = new Scanner (System.in);



        // Extensión : Probar printf, println y print
        System.out.printf("Tengo %05d Euros pero me debes %06.2f de ayer\n", 200, 23.5);

        System.out.println("Tengo " + 200 + " euros pero me debes " + 23.5 + " de ayer" );
        
        System.out.print("Tengo " + 200 + " Euros pero me debes " + 23.5 + " de ayer");
        System.out.println("\n\n\n\n");

        /*Si no se especifica un valor en su declaración, las variable primitivas se inicializan a cero salvo boolean y char, que se inicializan a false y ASCII(0).
        Análogamente las variables de tipo referencia son inicializadas por defecto a un valor especial: null */
   
        /*printf
            %[indice_del_argumento$][flags][width][.precision]Caracter_Conversion

            Caracter_Conversion:
            b -> boolean
            c -> char
            d -> integer, long, short, byte
            f -> float, double
            g -> decimal / float, double (según contenido).
            e -> float, double en notación científica
            s -> string, char[]
            x,X -> Hexadecimal
            o -> Octal

            Flags
            "-" Justificar el argumento a la izquierda.
            "+" El argumento tiene un signo (+ or -).
            "0" Rellenar con ceros a la izquierda hasta llegar al tamaño máximo.
            "," El argumento tiene grupos separados por comas, así: 123,456.
            "(" Paréntesis para encerrar números negativos.

            Width:
            Mínimo valor a imprimir.

            .precision:
            Sólo para flotantes. Especifica la precisión, cuantos valores después de la coma.*/
        //Ejemplos de printf :
        System.out.printf("Inicio %05d %-5d Fin\n", 10, 10);
        System.out.printf("Inicio %015.2f %-5.2f Fin\n", 1.2, 1.2);
        System.out.printf("Inicio %15s %-15s Fin\n", "Hola", "Hola");
        System.out.println("\n\n");
        ejercicioPrintf();;



    }






    public static void areaCirculo(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el radio del circulo del que quieres sacar el area: ");
        double radio = sc.nextDouble();
        double area = PI * radio*radio;
        System.out.println("El area del circulo es: " + area);
        System.out.printf("Tengo %15.4f de area", radio*radio*PI);
    }

    public static void areaCuadrado(){
        /*Ejercicio02-03-02AreaRectangulo
        Hacer un programa que declare dos variables de tipo coma flotante, de nombres base y altura.
        El programa mostrará los valores de dichas variables que han sido asignados dentro del programa así como el área del rectángulo con dichos valores.
        Una vez terminado probar a declarar otras variables con otros tipos primitivos y mostrar su valor por pantalla.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce base: ");
        float base = sc.nextInt();
        System.out.println("Introduce altura: ");
        float altura = sc.nextInt();
        System.out.printf("El area del rectangulo de %f de base y %f altura sería %f",base,altura,base*altura);
    }
    public static void ejercicioCombinaPrintf(){
        /*Hacer un programa que muestre no menos de 20 líneas diferentes con diferentes combinaciones de printf.
        Utilizar combinaciones de todos los posibles valores de la cadena de formato.
        Prescindir generalmente del índice del argumento. No resulta demasiado interesante.
        */ 

    }
    public static void ejercicioMisDatos(){
        /*Hacer un programa que muestre con sucesivos printf tus datos personales.
        Poner atención ya que cada dato será de un tipo diferente.
        Cuantos más muestres será mejor.
        */

    }
    public static void ejercicioPrintf (){
        /*Escribir las lineas de código Java necesarias para obtener la siguiente salida por pantalla utilizando sentencias printf para cada linea de salida con el
        formato adecuado en cada caso.
        //Ejemplo de printf
        10.001 es mayor que 0010.0001
        16 (decimal) es 10 (hexadecimal) y 12 (octal)
        13/3 = 04.33333
        1234.1234 = 1.23e3
 */
        System.out.printf("%.3f es mayor que %.4f",10.001, 10.0001);
        System.out.println();
        System.out.printf("%d (decimal) es %x (hexadecimal) y %o (octal)",16,16,16);
        System.out.println();
        System.out.printf("%d/%d = %f0.5", 13,3,(double)13/3);
        System.out.println();
        System.out.printf("%.4f = %.2e%n",1234.1234,1234.1234);

    }
    
}
