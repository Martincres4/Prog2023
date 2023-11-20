//crea un método que instancie un array de dos dimensiones , 
//cuyo tamaño esta dado por el usuario y sus valores sean aleatorios(entre -23 y +509)
package arraysMultidimensionales;
import java.util.Scanner;
public class ej1ArraysMultidimensionales1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos espaciones tenga la primera dimensión del array: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce cuantos espaciones tenga la segunda dimensión del array: ");
        int num2 = sc.nextInt();
        int [][] array = new int[num1][num2];

        for(int i = 0; i < num1; i++){
            for(int l = 0; l < num2; l++){
                array[i][l]= (int)(Math.random()*(509-(-23))+(-23));
                System.out.printf(array[i][l] + ", ");
            }
            System.out.println();
        }
    }

}
