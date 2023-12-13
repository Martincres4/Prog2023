//crea una funcion que dado un array de 4 dimensiones, devuelva si en su contenido hay un par
package arraysMult;
import java.util.Scanner;
public class ej1ArraysMultidimensionales6 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos espaciones tenga la primera dimensión del array: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce cuantos espaciones tenga la segunda dimensión del array: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce cuantos espaciones tenga la tercera dimensión del array: ");
        int num3 = sc.nextInt();
        System.out.println("Introduce cuantos espaciones tenga la cuarta dimensión del array: ");
        int num4 = sc.nextInt();
        int [][][][] array = new int[num1][num2][num3][num4];

        for(int i = 0; i < num1; i++){
            for(int l = 0; l < num2; l++){
                for(int s = 0; s< num3; s++){
                    for(int t = 0; t< num4;t++){
                        array[i][l][s][t]= (int)(Math.random()*100);
                            if(array[i][l][s][t]%2 == 0){
                                System.out.println("El " + array[i][l][s][t] + " esta en la posición " + i + ", " + l + ", " + s + ", " + t +" del array.");
                            }
                    }
                }
            }
        }

        

    }
}
