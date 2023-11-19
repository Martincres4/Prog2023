//Crea un procedimiento que imprima todos los valores que hay en un array pasado por parámetro.
package arrays;
import java.util.Scanner;    
public class ejArrays3 {
    public static void main(String[] args) {
    System.out.println(devuelveArray());
    }
    static int [] devuelveArray(int array[1] = 23){
        int [] array1 = new int[10];
        for(int i = 0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
        return array1;
    }
}
