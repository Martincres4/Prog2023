//crea un método que devuelva la  ultima posicion del primero 0 que encuentre en un 
//array de dos dimensiones
package arraysMult;

public class ej1ArraysMultidimensionales4 {
    public static void main(String[] args){
        boolean haha = false;
        int [][] array3 = {{2, 3}, {3, 0}, {4, 0}};

        for(int i = array3.length-1; i > 0; i--){
            for(int l = array3[0].length-1; l > 0; l--){
                if(array3[i][l]==0 && !haha){
                    System.out.printf("El " + array3[i][l] + " esta en la posición " + i + ", " + l + " del array.");
                    haha = true;
                }
                break;
                
            }
            System.out.println();
        }

    }
}
