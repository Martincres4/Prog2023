package primerosDias.cosasRaras;
public class binariosModificar {

    public static void main(String[] args) {
    
        int num1=1;
        int num2=2;
        int num3=4;
        int num4=8;
        int num5=16;
        int num6=32;
        int num7=64;
        int num8=128;

        int tusmuertos = 110;
        int tusmuertos2 = 11;
        int tusmuertos3 = 1;
        int tusmuertos4 = 10;
        int tusmuertos5 = 0010;
        int tusmuertos6 = 1101;

        System.out.println((num1<<2) + " " + (num2<<1) + " " + (num3<<2) + " " + (num4<<1) + " " + (num5<<2) + " "+ (num6<<1) + " " + (num7<<2) + " " + (num8<<1));
        
        System.out.println((num1>>2) + " " + (num2>>1) + " " + (num3>>2) + " " + (num4>>1) + " " + (num5>>2) + " "+ (num6>>1) + " " + (num7>>2) + " " + (num8>>1));

        System.out.println((~ tusmuertos) + " " + (~tusmuertos2) + " " + (~tusmuertos3) + " " + (~tusmuertos4) + " " + (~tusmuertos5) + " " + (~tusmuertos6)); 
    
    }
    
}
