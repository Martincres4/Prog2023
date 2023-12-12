public class ej1 {
    public static void main(String[] Args) {

        // Ejemplos :
        int i = 7, j = 9;
        System.out.println("Prueba operadores Logicos : " + (i > j));
        System.out.println("Prueba operadores Logicos : " + (i <= j));
        System.out.println("Prueba operadores Logicos : " + (i != j));
        System.out.printf("%2d es mayor que %d : es %b\n", i, j, (i > j));

        /*
         * long a = 10, b = 8, c = -3;
         * int resultado;
         * result = (int) (a/(b+c));5p
         * System.out.println( result );
         * 
         * Ejercicio: realizar un ejemplo todas las combinaciones que hay:
         * Tipo inicial Tipo final
         * byte short, int, long, float, double
         * short int, long, float, double
         * char int, long, float, double
         * int long, float, double
         * long float, double
         * float double
         */
        byte varByte = 4;
        short vatShort = (short) varByte;
        int varInt = (short) varByte;
        long varLong = (long) varByte;
        float varFloat = (float) varByte;
        double varDouble = (double) varByte;

        short varShort2 = 1223;
        varInt = (int) varShort2;
        varLong = (long) varShort2;
        varFloat = (float) varShort2;
        varDouble = (double) varShort2;
        // ...

        String cadena1 = "Holiwi ";
        String cadena2 = "Holiwi2";
        String cadena3 = "";
        int posicion;
        boolean existe;

        // Programa que concatene dos cadenas de caracteres.
        cadena3 = cadena1.concat(cadena2);
        System.out.println(cadena3);

        // Programa que muestre por pantalla el tamaño de una cadena
        System.out.println(cadena3.length());

        // Programa que muestre si en una cadena dada existe el caracter 'h'
        System.out.println(existe = cadena3.indexOf('H') > 0 ? true : false);

        // Programa que muestre la posicion en una cadena de un caracter previamente
        // declarado
        System.out.println(posicion = cadena3.indexOf('i'));

        // Programa que extrae una cadena de una cadena mayor en base a dos posiciones
        // dadas
        System.out.println(cadena1.substring(3, 4));

        // Programa que extrae una cadena de una cadena mayor en base a una posicion
        // dadas
        System.out.println(cadena3.substring(3));

        // Programa que cambia la cadena todo a mayusculas
        System.out.println(cadena3.toUpperCase());

        // Programa que cambia la cadena todo a minusculas
        System.out.println(cadena3.toLowerCase());

        // Programa que muestre si dos cadenas son iguales
        System.out.println(cadena1.equalsIgnoreCase(cadena2));

        // Programa que analice dos cadenas, si son del mismo tamaño, concatenalas en la
        // primera cadena, se mantiene igual
        int longCad1 = cadena1.length();
        int longCad2 = cadena2.length();
        boolean si = longCad1 == longCad2 ? true : false;
        if (si) {
            cadena1.concat(cadena2);
        }

        // Programa que muestre si una cadena "existe" dentro de otra ("Caballo" existe
        // dentro de "Caballo oscuro")
        System.out.println(cadena1.contains(cadena2));

        // Programa que reemplace todos los caracteres que exista en una cadena por otra
        System.out.println(cadena1.replaceAll(cadena1, cadena2));


        // WRAPPERS
        // Convertir la cadena "12" en byte
        String Cad = "12";
        byte byteCad = Byte.valueOf(Cad);
        byteCad = Byte.parseByte(Cad);
        System.out.println(byteCad);

        // Converit la cadena "12.2" en float
        String Cad2 = "12.2";
        float floatCad = Float.valueOf(Cad2);
        floatCad = Float.parseFloat(Cad2);
        System.out.println(floatCad);

        // Convertir la cadena "H" en char
        String x = "H";
        char y = x.charAt(0);

        // Comparar si "234" es igual a "234" usando wrappers
        String num1S = "234";
        String num2S = "234";
        int num1 = Integer.valueOf(num1S);
        int num2 = Integer.parseInt(num2S);
        boolean mayor = num1 ==  num2;
        if(mayor){
            System.out.println("Si");
        }


        // Comparar si "234" es mayora a "224" usando wrappers

        // Extras:
        // Dada una cadena "213213", convertirla en byte(se puede?) -> ¿que podrias
        // hacer?
        // convertir la cadena "21312.324f" en float(se puede?¿) -> ¿que podrias hacer?
        // Convertir la cadena "Hi" en char (se puede?¿) -> ¿que podrias hacer?
        

    }
    public static boolean primoONo(int number){

        int sqrt = (int) Math.round(Math.sqrt(number));
        boolean esPrimo = true;

        if(number == 1) esPrimo = false;

        for(int i = 2; i <= sqrt; i++){
            if(number % i == 0){
                esPrimo = false;
            }
        }

        return esPrimo;
    }
}
