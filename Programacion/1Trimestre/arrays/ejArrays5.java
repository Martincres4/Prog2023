//Crea un método que se le pase un array ya instanciado y con numeros y se le pase un parametro int adicional, se debe buscar un numero si existe dentro del array, 
//si lo hay devuelve su posicion, de lo contrario que devuelva que no es posible
package arrays;

import java.util.Scanner;

public class ejArrays5 {
    public static void main(String[] args) {
        devuelveArray();
    }

    static void devuelveArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para comprobar si esta dentro del array: ");
        int num = sc.nextInt();

        int[] array1 = {54, 23, 5, 1, 12, 3, 46, 2, 6, 2};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i]==num){
                System.out.println("*****El número introducido coincide con la posición " + i + "******");
            }else{
                System.out.println("El número introducido no corresponde con la posición del array " + i);
            }   
        }
    }
}
