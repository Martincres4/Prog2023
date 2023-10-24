/*Crea un programa que calcule un numero aleatorio entre -5 y 10 y si el numero 
es negativo que muestre su valor absoluto, de lo contrario muestra su version en 
negativo (Usar libreria Math) */
package ifElseIfAnidados;

public class ejer5 {
    public static void main(String[] args) {
        boolean positivo= false;
        double random;

        random = Math.random()*(10 + 5)-5;
        System.out.println(random);

        if(random>=0){
            positivo = true;
        }

        if(positivo){
            System.out.println("-"+random);  
        }else{
            Math.abs(random);
            System.out.println(random);
        }



    }
}
