//Crea un método devuelva un array (int) de 10 posiciones.
package arrays;
import java.util.Scanner;    
public class ejArrays1 {
    public static void main(String[] args) {
    System.out.println(devuelveArray());
    }
    static int [] devuelveArray(){
        int [] array1 = new int[10];
        for(int i = 0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
        return array1;
    }
}
