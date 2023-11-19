package condicionales.eccuacionSegGra;

import java.util.Scanner;

public class eccuacionSegGra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Cuanto vale x^2: ");
        a = sc.nextDouble();
        System.out.println("Cuanto vale x: ");
        b = sc.nextDouble();
        System.out.println("Cuanto vale el entero: ");
        c = sc.nextDouble();

        segundoGrado(a, b, c);

    }

    static void segundoGrado(double a, double b, double c) {
        double sol1 = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        double sol2 = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        String error = sol1 == Double.NaN || sol2 == Double.NaN ? "La ecuación no tiene solucion.\n"
                : "Los resultados son:\n";
        System.out.println(error +
                "La solución 1 sería: " + sol1
                + "\nLa solución 2 sería: " + sol2);

    }

}
