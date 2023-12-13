// WRAPPERS
package primerosDias.Wrapper;
import java.util.Scanner;
public class ejers {
    public static void main(String[] args){
        // Convertir la cadena "12" en byte
        String cadena="12";
        byte resultado = Byte.valueOf(cadena);
     


        // Converit la cadena "12.2" en float
        String cadena2="12.2";
        float resultado2 = Float.valueOf(cadena2);
       


        // Convertir la cadena "H" en char
        String cadena3="H";
        char resultado3 = cadena3.charAt(0);
        


        // Comparar si "234" es igual a "234" usando wrappers
        String num1="234";
        String num2="234";
        String resul = num1.equalsIgnoreCase(num2) ? "Son iguales" : "No son iguales";
        System.out.println(resul);

        // Comparar si "234" es mayora a "224" usando wrappers
        String num3="234";
        String num4="224";
        int res3 =Integer.valueOf(num3);
        int res4 = Integer.valueOf(num4);
        String resul3 = res3 > res4 ? "Es mayor" : "Es menor" ;
        System.out.println(resul3);

        // Extras:
        // Dada una cadena "213213", convertirla en byte(se puede?) -> ¿que podrias hacer?
        String numeros = "213213";
        byte resultadoNum = Byte.valueOf(numeros);
        System.out.println(resultadoNum);


        // convertir la cadena "21312.324f" en float(se puede?¿) -> ¿que podrias hacer?
        String numeros2 = "21312.324f";
        float resultadoNum2 = Float.valueOf(numeros2);
        System.out.println(resultadoNum2);

        
        // Convertir la cadena "Hi" en char (se puede?¿) -> ¿que podrias hacer?
        String hahaRes="Hi";
        char haha = hahaRes.charAt(0);
        System.out.println(haha);
       

            }

 
}