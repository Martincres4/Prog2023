package bucles.doWhile;
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcionS;
        int opcion;

       
        do{
            System.out.println("¿Qué desea hacer?");
            System.out.println("1: Dime numero");
            System.out.println("2: Dime char");
            System.out.println("3: Dime String");
            System.out.println("4: Salida");
            opcionS = sc.nextLine();
            opcion = Integer.parseInt(opcionS);

            switch(opcion){
                case 1:
                    System.out.println("Introduce un int: ");
                    String numS = sc.nextLine();
                    int num = Integer.parseInt(numS);
                    System.out.println("El número introducido es: " + num);
                    break;

                case 2:
                    System.out.println("Introduce un char: ");
                    String char1 = sc.nextLine();
                    System.out.println("El char introducido es: " + char1);
                    break;

                case 3:
                    System.out.println("Introduce un String: ");
                    String frase = sc.nextLine();
                    System.out.println("La frase introducida es: " + frase);
                    break;
                
                case 4:
                    System.out.println("Usted ha salido del programa.");
                    break;
               
                default:
                    System.out.println("El número introducido está fuera del rango.");
                    break;
            }
        }while(opcion <= 3);  
    }  
}

