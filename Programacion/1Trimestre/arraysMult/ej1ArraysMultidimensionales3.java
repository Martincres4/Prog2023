//crea un método que devuelva la posicion del primero 0 que encuentre en un array 
//de dos dimensiones
package arraysMult;

public class ej1ArraysMultidimensionales3 {
    public static void main(String[] args){
        boolean haha = false;
        int [][] array3 = {{2, 0}, {3, 0}, {4, 9}};

        for(int i = 0; i < array3.length; i++){
            for(int l = 0; l < array3[0].length; l++){
                if(array3[i][l]==0 && !haha){
                    System.out.printf("El " + array3[i][l] + " esta en la posición " + i + ", " + l + " del array.");
                    haha = true;
                }
                
            }
            System.out.println();
        }

    }
    
}
