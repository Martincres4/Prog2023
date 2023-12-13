package practicar;

public class variables {
    public static void main(String[]args){
        boolean b = true;

        //boolean toBe = false;
       
        if (b) {
            System.out.println("no");
        
        }else{
            System.out.println("si");
        }

        primitivos();
        wrapper();
        compBooleansRaro();
        ejBooleans();
    }
    public static void primitivos(){
        /*Create all of the primitives (except long and double) with 
        different values. Concatenate them into a string and print it 
        to the screen so it will print: H3110 w0r1d 2.0 true*/
        boolean b = true;
        char c = ' ';

        byte by = 0;
        short s = 3;
        int i = 1;
        //long l;

        float f = 2.0f;
        //double d;

        System.out.println("H" + s + i + i + by + c + "w" + s + by + "r" + i + "d" + c + f + c + b);
        
    }
    public static void wrapper(){
        int a = 4;
        int result = a == 4 ? 1 : 8;

        // result will be 1
        // This is equivalent to
       

        if (a == 4) {
            result = 1;
        } else {
            result = 8;
        }
    }
    public static void compBooleansRaro(){
        String a = new String("Wow");
        String b = new String("Wow");
        String sameA = a;

        boolean r1 = a == b;      // This is false, since a and b are not the same object
        boolean r2 = a.equals(b); // This is true, since a and b are logically equals
        boolean r3 = a == sameA;  // This is true, since a and sameA are really the same object
    }
    public static void ejBooleans(){
        //Change the variables in the first section, so that each 
        //if statement resolves as true.
        
        String a = "Wow";
        String b = a;
        String c = "Wow!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }else {
            System.out.println("nope");
        }
    

    }



}
