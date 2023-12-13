package Strings;
import java.util.Scanner;
public class capicuaSoloMitad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEjercicio número capicua.");
        System.out.println("Introduce un número: ");
            int capicuaM = sc.nextInt();
            String capicuaSS = Integer.toString(capicuaM);
            String prpa ="";
            String sepa ="";
            String sepaInv ="";
            //condicional para Cantidad de numeros pares
            if(capicuaSS.length() % 2 == 0){
            prpa = capicuaSS.substring(0, capicuaSS.length()/2);
            sepa = capicuaSS.substring(capicuaSS.length()/2, capicuaSS.length());
            
                for (int indice = sepa.length() - 1; indice >= 0; indice--) {
                    sepaInv += sepa.charAt(indice);
                }  
            //condicional para Cantidad de numeros impaper
            }else{
                //para tenerlos en int
            int mprpa2 = (capicuaSS.length()/2);
            int msepa2 = (capicuaSS.length()/2)+1;
            prpa = capicuaSS.substring(0, mprpa2);
            sepa = capicuaSS.substring(msepa2, capicuaSS.length());
                for (int indice = sepa.length() - 1; indice >= 0; indice--) {
                    sepaInv += sepa.charAt(indice);
                }  
            }
            //para decir si son capicuas i no
            if(prpa.equalsIgnoreCase(sepaInv) == true){
                System.out.println("El número es capicúa.");
            }else{
                System.out.println("El número no es capicúa.");
            }
        
    }
}