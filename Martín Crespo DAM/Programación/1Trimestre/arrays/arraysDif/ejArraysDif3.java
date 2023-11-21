//Crea un método que migre todos los datos de un array a otro de mayor tamaño(por ejemplo de un array de tamaño 10 a otro de tamaño 20)
package arrays.arraysDif;

public class ejArraysDif3 {
    public static void main(String[] args){
        int [] array ={1,2,3,4,5,6,7,8,9,10};
        int [] array2 = new int [20];

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }  
        array[11]= 33;

        array2 = array;
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
        
       
    }
}
