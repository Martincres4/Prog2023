//Crea un método que pida al usuario 10 numeros y guardalos, para luego mostrarlos en orden inverso al que se han introducido
package arrays;
import java.util.Scanner;    
public class ejArrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(devuelveArray());
    }
    static int [] devuelveArray(){
        int [] array1 = new int[10];
        for (int i = 0; i<array1.length; i++){


        }
        for(int i = 0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
        return array1;
    }
}
