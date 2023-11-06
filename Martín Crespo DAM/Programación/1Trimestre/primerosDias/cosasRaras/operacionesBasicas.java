package primerosDias.cosasRaras;
import java.util.Scanner;
public class operacionesBasicas { 

	public static void main(String[] args) {
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Elige una opción: \n1.Cuadrado. \n2.Rectángulo. \n3.Círculo. \n4.Esfera.");
		

		

		System.out.println("##############################");
		System.out.println("# Elige una opción:          #");
		System.out.println("# 1.Cuadrado.                #");
		System.out.println("# 2.Rectángulo.              #");
		System.out.println("# 3.Círculo.                 #");
		System.out.println("# 4.Esfera.                  #");
		System.out.println("##############################");
		
		
		
		int figura = sc.nextInt();
		switch (figura) {
		case 1:
		//cuadrado
		System.out.println("Introduce el lado del cuandrado: ");
		int a = sc.nextInt();
		int area = a * a;
		System.out.println("El area del cuadrado será: "  + area);
		break;
		
		case 2:
		//rectángulo
		System.out.println("Introduce el lado del rectángulo: ");
		a = sc.nextInt();
		System.out.println("Introduce el ancho del rectángulo: ");
		int b = sc.nextInt();
		area = b * a;
		System.out.println("El area del rectángulo será: "  + area);
		break;
		
		case 3:
		//círculo
		System.out.println("Introduce el radio del círculo: ");
		int r = sc.nextInt();
		double area2 = PI * (r * r);
		System.out.println("El area del círculo será: "  + area2);
		break;
		
		case 4:
		//esfera
		System.out.println("Introduce el radio de la esfera: ");
		r = sc.nextInt();
		area2 = 4 * PI * (r * r);
		System.out.println("El area de la esfera será: "  + area2);
		break;
		
		}
	}

}


