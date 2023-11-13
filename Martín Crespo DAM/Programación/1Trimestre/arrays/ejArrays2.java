//Crea un método en el que le pasamos un array ya instanciado y devuelva valores aleatorios (int   20-30) .
package arrays;
import java.util.Scanner;    
public class ejArrays2 {
    public static void main(String[] args) {
        devuelveArray();
    }

    static int [] devuelveArray(){
        int [] array1 = new int[10];
        for(int i = 0; i<array1.length; i++){
            array1[i]= (int)(Math.random()*(20-30)+30); 
            System.out.println(array1[i]);
        }   
        return array1;
    }
}
