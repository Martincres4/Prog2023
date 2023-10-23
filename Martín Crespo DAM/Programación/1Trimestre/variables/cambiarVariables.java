package variables;
/*
Ejercicio: realizar un ejemplo todas las combinaciones que hay:
Tipo inicial		Tipo final
byte				short, int, long, float, double
short			int, long, float, double
char				int, long, float, double
int				long, float, double
long				float, double
float				double 
*/
public class cambiarVariables {
    public static void main(String[] args){
        byte apartado1=1;
        short apartado2=2;
        char apartado3=3;
        int apartado4=4;
        long apartado5=5;
        float apartado6=6;

        System.out.println("----APARTADO 1(byte)----");
        short byteA1 = (short) apartado1;
        System.out.println("- Byte a Short: " + byteA1*2);
        int byteA2 = (int) apartado1;
        System.out.println("- Byte a Int: " + byteA2*3);
        long byteA3 = (long) apartado1;
        System.out.println("- Byte a Long 1.3.: " + byteA3*4);
        float byteA4 = (float) apartado1;
        System.out.println("- Byte a float.: " + byteA4*5);
        double byteA5 = (double) apartado1;
        System.out.println("- Byte a Double.: " + byteA5*6 + "\n");

        System.out.println("----APARTADO 2(short)----");
        int shortA1 = (int) apartado2;
        System.out.println("- Short a Int: " + shortA1/1);
        long shortA2 = (long) apartado2;
        System.out.println("- Short a Long: " + shortA2/2);
        float shortA3 = (float) apartado2;
        System.out.println("- Short a Float: " + shortA3/3);
        double shortA4 = (double) apartado2;
        System.out.println("- Short a Double: " + shortA4/4 + "\n");

        
        System.out.println("----APARTADO 3(char)----");
        int chartA1 = (int) apartado3;
        System.out.println("- Char a Int: " + chartA1+1);
        long charA2 = (long) apartado3;
        System.out.println("- Char a Long: " + charA2+2);
        float charA3 = (float) apartado3;
        System.out.println("- Char a Float: " + charA3+3);
        double charA4 = (double) apartado3;
        System.out.println("- Char a Double: " + charA4+4 + "\n");

        System.out.println("----APARTADO 4(int)----");
        long intA1 = (long) apartado4;
        System.out.println("- Int a Long: " + (intA1-1));
        float intA2 = (float) apartado4;
        System.out.println("- Int a Float: " + (intA2-1));
        double intA3 = (double) apartado4;
        System.out.println("- Int a Double: " + (intA3-3) + "\n");

        System.out.println("----APARTADO 5(long)----");
        float longA1 = (float) apartado5;
        System.out.println("- Long a Float: " + longA1*(longA1+1));
        double longA2 = (double) apartado5;
        System.out.println("- Long a Double: " + longA2*(longA1+2) + "\n");
        
        System.out.println("----APARTADO 6(double)----");
        float doubleA1 = (float) apartado6;
        System.out.println("- Double a Float: " + doubleA1*(doubleA1/10));

        // Conversiones complicadas

        //Short a Byte
        /*System.out.println("COMPLICADOS");
        short apartado7=126;
        System.out.println(apartado7.toString());
        System.out.println(Short.toString((short)10));

        byte complicado1 = (byte)apartado7;
        System.out.println(complicado1);




        Short shortValue = 10;
        System.out.println(shortValue.toString());
        System.out.println(Short.toString((short)10))*/
    } 
}

