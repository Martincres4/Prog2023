/*dias del mes con switch */
package condicionales.switchEjs;
import java.util.Scanner;
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 1 al 7 que corresponda con un día de la semana: ");
        String diaSemanaS = sc.nextLine();
        int diaSemana = Integer.parseInt(diaSemanaS);
        switch(diaSemana){
        case 1, 8, 15, 22, 29:
            System.out.println("El día introducido es Lunes.");
            break;
        case 2, 9, 16, 23, 30:
            System.out.println("El día introducido es Martes.");
            break;
        case 3, 10, 17, 24:
            System.out.println("El día introducido es Miércoles.");
            break;
        case 4, 11, 18, 25:
            System.out.println("El día introducido es Jueves."); 
            break;    
        case 5, 12, 19, 26:
            System.out.println("El día introducido es Viernes."); 
            break;     
        case 6, 13, 20, 27:
            System.out.println("El día introducido es Sábado."); 
            break;      
        case 7, 14, 21, 28:
            System.out.println("El día introducido es Domingo.");
            break;
        default:
            System.out.println("Los valores introducidos no son correctos.");
            break;
        }

    }
    
}
