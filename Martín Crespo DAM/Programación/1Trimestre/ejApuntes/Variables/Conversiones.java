package ejApuntes.Variables;

public class Conversiones {
    public static void main (String[]args){
        ejercicio020540();

   
    /*Wrappers
        tipo    Wrapper--
        ======= =========
        boolean Boolean
        byte    Byte
        char    Character
        int     Integer
        float   Float
        double  Double
        long    Long
        short   Short


    Pasar de String a int, float y double.
        En Java para cadenas de caracteres tipo char se usa el tipo definido String.

        //Conversiones de tipo
            String numDecimalString = "8.978"; //¿Número con comillas?
            float numFloat = Float.valueOf(numDecimalString).floatValue(); // numFloat = 8,979
            double numDouble = Double.valueOf(numDecimalString).doubleValue();// numDouble = 8,979
            String numIntString = "1001";
            int numInt = Integer.valueOf(numIntString).intValue(); // numInt = 1001
            //.intValue() ; .doubleValue() ; .floatValue() son Opcionales.

            //Ejemplo :
            int numInt2 = Integer.valueOf(numIntString) // numInt2 = 1001
            //Otro método es parseInt()....................
            //Utilizamos el método parseInt de la clase Integer.
            String cadena = "1234";
            int numero = 0;
            numero = Integer.parseInt(cadena);

      
    Pasar de int a String (2 maneras)

        Nos hacemos del método valueOf de la clase String o del toString de la clase Integer.
        //Conversiones de tipo
        int numeroEntero = 1234;
        String cadena = "";
        cadena = String.valueOf(numeroEntero);
        cadena = Integer.toString(numeroEntero);

        El método valueof() y toString() existe para casi todos los tipos.
        El métdo toString() es muy importante y se verá con mayor detenimiento más adelante.
        Ejercicio 02-05-30 : Probar el ejemplo anterior y ampliarlo a float y double.
        Ejercicio 02-05-40 : Probar y explicar el siguiente código :

        //ejercicio020540
         */
    }
    public static void ejercicio020540(){
        int numeroEntero = 1234, i = 0;
        String cadena = "";
        System.out.println( cadena );
        cadena = String.valueOf(numeroEntero);
        System.out.println( "Otras cosas =============" );
        System.out.println( ++i + " - " + cadena + " : " + String.valueOf(numeroEntero) + Integer.toString(numeroEntero) );
        System.out.println( ++i + " - " + cadena + " : " + (cadena + Integer.valueOf(cadena)) );
        System.out.println( ++i + " - " + cadena + " : " + (cadena + Integer.valueOf(cadena).doubleValue()) );
        System.out.println( ++i + " - " + cadena + " : " + (Integer.valueOf(cadena).intValue() + Integer.valueOf(cadena)) );
        System.out.println( ++i + " - " + cadena + " : " + (Integer.parseInt(cadena) + Integer.parseInt(cadena)) );
        System.out.println( ++i + " - " + cadena + " : " + (Integer.valueOf(cadena).floatValue() + Integer.valueOf(cadena)) );
        System.out.println( ++i + " - " + cadena + " : " + (Integer.valueOf(cadena).doubleValue() + Integer.valueOf(cadena)) );

    }
}
