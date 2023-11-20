//crea una funcion que muestre por pantalla todos los valores de un array de dos 
//dimensiones
package arraysMultidimensionales;
import java.util.Scanner;
public class ej1ArraysMultidimensionales2 {
    public static void main(String[] args){
        int [][] array2 = new int[3][5];
        for(int i = 0; i < 3; i++){
            for(int l = 0; l < 5; l++){
                array2[i][l]= (int)(Math.random()*(509-(-23))+(-23));
                System.out.printf(array2[i][l] + ", ");
            }
            System.out.println();
        }
    }
    
}
