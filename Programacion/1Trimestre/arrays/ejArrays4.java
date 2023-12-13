//Crea un método que pida al usuario 10 numeros y guardalos, para luego mostrarlos en orden inverso al que se han introducido
package arrays;

import java.util.Scanner;

public class ejArrays4 {
    public static void main(String[] args) {
        devuelveArray();
    }

    static void devuelveArray() {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduce un número: ");
            array1[i] = sc.nextInt();
        }
        for (int l = 9; l >= 0; l--) {
            if (l!=0){
                System.out.print(array1[l] + ", ");
            }else{
                System.out.print(array1[l]);
            }   
        }
    }
}
