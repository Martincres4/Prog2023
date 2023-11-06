/*Ejercicio 02-09-05PedirDatosPersonales :
Hacer un programa que pida tus datos personales y los almacene en variables adecuadas :
Nombre, Apellidos, DNI, edad, altura, Profesión, Telefono, email, Dirección postal, Codigo Postal, Ciudad y Provincia.
Visualiza estos datos en forma de ficha utilizando los formatos del printf como si fueras a imprimir un DNI o ficha personal de una empresa.
Intenta que salga algo parecido a como aparece en los ejemplos en la medida de lo que puedas.
Claramente no imprimiras ni colores si gráficos, pero el aspecto de la salida debe de ser parecido a los ejemplos.
 */
package primerosDias.scanner;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido1, apellido2, profesion, email, ciudad, provincia, DNI, edad, telefono, dirPos, codPos,
                altura;
        int edadI, telefonoI, codPosI;
        double alturaD;
        System.out.println("Introduzca sus siguientes datos personales: ");
        System.out.println("Nombre: ");
        nombre = sc.nextLine();

        System.out.println("Primer apellido: ");
        apellido1 = sc.nextLine();
        System.out.println("Segundo apellido: ");
        apellido2 = sc.nextLine();

        System.out.println("DNI: ");
        DNI = sc.nextLine();

        System.out.println("Edad: ");
        edad = sc.nextLine();
        
        System.out.println("Altura: ");
        altura = sc.nextLine();
        
        System.out.println("Profesion: ");
        profesion = sc.nextLine();

        System.out.println("Introduzca su teléfono: ");
        telefono = sc.nextLine();
        telefonoI = Integer.parseInt(telefono);
        boolean telefonoB = telefono.contains(1, 2, 3, 4, 5, 6, 7, 8, 9, 0) ? "telefonoI" : "0";
        
        System.out.println("email: ");
        email = sc.nextLine();

        System.out.println("Dirección Postal: ");
        dirPos = sc.nextLine();

        System.out.println("Código Postal: ");
        codPos = sc.nextLine();

        System.out.println("Ciudad: ");
        ciudad = sc.nextLine();

        System.out.println("Provincia: ");
        provincia = sc.nextLine();

        System.out.println(

                "\nDatos personales: \n" +
                        "\nNombre: " + nombre +
                        "\n----------------------------------------------" +
                        "\nApellidos: " + apellido1 + " " + apellido2 +
                        "\n----------------------------------------------" +
                        "\nDNI: " + DNI +
                        "\n----------------------------------------------" +
                        "\nEdad: " + edad +
                        "\n----------------------------------------------" +
                        "\nAltura: " + altura +
                        "\n----------------------------------------------" +
                        "\nProfesión: " + profesion +
                        "\n----------------------------------------------" +
                        "\nTeléfono: " + telefono +
                        "\n----------------------------------------------" +
                        "\nemail: " + email +
                        "\n----------------------------------------------" +
                        "\nDirección Postal: " + dirPos +
                        "\n----------------------------------------------" +
                        "\nCódigo Postal: " + codPos +
                        "\n----------------------------------------------" +
                        "\nCiudad: " + ciudad +
                        "\n----------------------------------------------" +
                        "\nProvincia: " + provincia +
                        "\n----------------------------------------------");
        
        
        edadI = Integer.parseInt(edad);
        alturaD = Double.valueOf(altura);
        codPosI = Integer.parseInt(codPos);
    }

}
