/*-Similar al anterior pero pide un dia del mes, partiendo de que un mes 
tiene 30 dias y empieza en lunes  */
package condicionales;
import java.util.Scanner;
public class opcional2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de 1 al 7 que corresponda con un día de la semana: ");
        String diaMesS = sc.nextLine();
        int diaMes = Integer.parseInt(diaMesS);
        if(diaMes==1||diaMes==8||diaMes==15||diaMes==22||diaMes==29){
            System.out.println("El día introducido es Lunes.");
        }
        if(diaMes==2||diaMes==9||diaMes==16||diaMes==23||diaMes==30){
            System.out.println("El día introducido es Martes.");
        }  
        if(diaMes==3||diaMes==10||diaMes==17||diaMes==24){
            System.out.println("El día introducido es Miércoles.");
        } 
        if(diaMes==4||diaMes==11||diaMes==18||diaMes==25){
            System.out.println("El día introducido es Jueves.");
        }       
        if(diaMes==5||diaMes==12||diaMes==19||diaMes==26){
            System.out.println("El día introducido es Viernes.");
        }        
        if(diaMes==6||diaMes==13||diaMes==20||diaMes==27){
            System.out.println("El día introducido es Sábado.");
        }        
        if(diaMes==7||diaMes==14||diaMes==21||diaMes==28){
            System.out.println("El día introducido es Domingo.");
        }   
    }
}

    
