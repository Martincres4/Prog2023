package bucles.doWhile;
import java.util.Scanner;
public class ejer2Chat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcionS;
        int opcion;
        boolean entero;

        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1: Dime numero");
            System.out.println("2: Dime char");
            System.out.println("3: Dime String");
            System.out.println("4: Salida");
            opcionS = sc.nextLine();
            opcion = Integer.parseInt(opcionS);
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce un int: ");
                        String numS = sc.nextLine();
                        
                        if (numS >= 0) {
                            int num = Integer.parseInt(numS);
                            System.out.println("El número introducido es: " + num);
                        } else {
                            System.out.println("Error: No es un número entero válido.");
                        }
                        break;

                    case 2:
                        System.out.println("Introduce un char: ");
                        String char1 = sc.nextLine();

                        if (char1.length() == 1) {
                            char c = char1.charAt(0);
                            System.out.println("El char introducido es: " + c);
                        } else {
                            System.out.println("Error: No es un char válido.");
                        }
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
        }while (opcion != 4);
    } 
}

