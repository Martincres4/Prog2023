/*-Escribe un un dia del 1-7, y determina que dia de la semana 
es(lunes, martes miercoles jueves...) */
package condicionales.ejersIfElse;
import java.util.Scanner;
public class opcional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 1 al 7 que corresponda con un día de la semana: ");
        String diaSemanaS = sc.nextLine();
        int diaSemana = Integer.parseInt(diaSemanaS);
        if(diaSemana==1){
            System.out.println("El día introducido es Lunes.");
        }
        if(diaSemana==2){
            System.out.println("El día introducido es Martes.");
        }  
        if(diaSemana==3){
            System.out.println("El día introducido es Miércoles.");
        } 
        if(diaSemana==4){
            System.out.println("El día introducido es Jueves.");
        }       
        if(diaSemana==5){
            System.out.println("El día introducido es Viernes.");
        }        
        if(diaSemana==6){
            System.out.println("El día introducido es Sábado.");
        }        
        if(diaSemana==7){
            System.out.println("El día introducido es Domingo.");
        }   
    }
}
