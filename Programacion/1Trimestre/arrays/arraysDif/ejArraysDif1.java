//Crea un método para ordenar un array de la forma mas eficiente(no se puede usar metodos ya existentes) 
package arrays.arraysDif;

public class ejArraysDif1 {
    public static void main(String[] args){
        int [] array = {2,38,4,10,12};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[j]<array[i]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
            System.out.println(array[i]);
        }

    }
}
