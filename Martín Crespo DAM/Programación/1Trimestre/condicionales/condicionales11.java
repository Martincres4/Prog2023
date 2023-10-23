/*muestra un numero aleatorio entre 84 y 98. */
package condicionales;
public class condicionales11 {
    public static void main(String[] args) {
        int numRandom = (int) (Math.random()*(98 - 84))+84;
        System.out.println(numRandom);
    }   
}