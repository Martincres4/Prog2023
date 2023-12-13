//Crea un método que dado un array ordenado, encuentre de la forma mas eficiente un numero en específico(devuelva su posicion)
package arrays.arraysDif;
import java.util.Scanner;

public class ejArraysDif2 {
    public static void main(String[] args){
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número que buscas a continuación");
        int num = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                System.out.println("El número se encuentra en la posición " + i + ".");
            }
        }

    }
}
