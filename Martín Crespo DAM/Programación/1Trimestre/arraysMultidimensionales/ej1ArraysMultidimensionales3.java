//crea un método que devuelva la posicion del primero 0 que encuentre en un array 
//de dos dimensiones
package arraysMultidimensionales;

public class ej1ArraysMultidimensionales3 {
    public static void main(String[] args){
        int [][] array3 = {{2, 3}, {3, 0}, {4, 9}};

        for(int i = 0; i < 3; i++){
            for(int l = 0; l < 2; l++){
                if(array3[i][l]==0){
                    System.out.printf("El " + array3[i][l] + " esta en la posición " + i + ", " + l + " del array.");
                }
                
            }
            System.out.println();
        }

    }
    
}
