/*dias del mes con switch */
package switchEjs;
import java.util.Scanner;
public class ejer2OtraForma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 1 al 7 que corresponda con un día de la semana: ");
        String diaSemanaS = sc.nextLine();
        int diaSemana = Integer.parseInt(diaSemanaS)%7;
        switch(diaSemana){
        case 1:
            System.out.println("El día introducido es Lunes.");
            break;
        case 2:
            System.out.println("El día introducido es Martes.");
            break;
        case 3:
            System.out.println("El día introducido es Miércoles.");
            break;
        case 4:
            System.out.println("El día introducido es Jueves."); 
            break;    
        case 5:
            System.out.println("El día introducido es Viernes."); 
            break;     
        case 6:
            System.out.println("El día introducido es Sábado."); 
            break;      
        case 0:
            System.out.println("El día introducido es Domingo.");
            break;
        default:
            System.out.println("Sin negativos");
            break;
        }

    }
    
}