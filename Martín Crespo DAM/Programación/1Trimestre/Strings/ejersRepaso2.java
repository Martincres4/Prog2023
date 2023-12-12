package Strings;

public class ejersRepaso2 {
    public static void main(String[] args){
        System.out.println("\nPrograma que muestre si dos cadenas son iguales");
        String igual1 = "Las rubias no somos tontas";
        String igual2 = "Las rubias no somos tontas";
        System.out.println(igual1.equalsIgnoreCase(igual2));

        //* */
        System.out.println("\nPrograma que analice dos cadenas, si son del mismo tamaño, concatenalas en la primera cadena, se mantiene igual");
        String cadena1 = "Longitud variable discontinua 1 ";
        String cadena2 = "Longitud variable discontinua 2 ";
        String iguales = (cadena1.length() == cadena2.length()) ? cadena1.concat(cadena2) : "no lo son";
        System.out.println(iguales);


        System.out.println("\nPrograma que muestre si una cadena \"existe\" dentro de otra (\"Caballo\" existe dentro de \"Caballo oscuro\")");
        String existe1 = "La pelota";
        String existe2 = "La pelota roja";
        System.out.println(existe2.contains(existe1));


        System.out.println("\nPrograma que reemplace todos los caracteres que exista en una cadena por otra");
        String remplaza1 = "jeje";
        String remplaza2 = "jaja";
        System.out.println(remplaza1.replaceAll(remplaza1, remplaza2));

        
        System.out.println("\nDos número capicúa");
        int capicua = 2992;
        String capicuaS = Integer.toString(capicua);
        String capicuaInv = "";

        for (int i = capicuaS.length() - 1; i >= 0; i--) {
         capicuaInv += capicuaS.charAt(i);
        }
        
        System.out.println(capicuaS.equalsIgnoreCase(capicuaInv));
        


        
        System.out.println("\nDos número capicúa solo usando la mitad");
        int capicuaM = 32223;
        String capicuaSS = Integer.toString(capicuaM);
        String prpa ="";
        String sepa ="";
        String prpa2 ="";
        String sepa2 ="";

        if(capicuaM % 2 == 0){
        prpa = capicuaSS.substring(0, capicuaSS.length()/2);
        sepa = capicuaSS.substring(capicuaSS.length()/2, capicuaSS.length());
        String sepaInv ="";
             for (int indice2 = sepa.length() - 1; indice2 >= 0; indice2--) {
                sepaInv += sepa.charAt(indice2);
            }  
        System.out.println(prpa.equalsIgnoreCase(sepaInv));

        }else if(capicuaM % 2 == 1){
        int mprpa2 = (capicuaSS.length()/2);
        int msepa2 = (capicuaSS.length()/2)+1;
        /*System.out.println(mprpa2 + " " +  msepa2 + " " + capicuaSS.length());*/

        prpa = capicuaSS.substring(0, mprpa2);
        sepa = capicuaSS.substring(msepa2, capicuaSS.length());
        String sepaInv2 ="";
             for (int indice3 = sepa.length() - 1; indice3 >= 0; indice3--) {
                sepaInv2 += sepa.charAt(indice3);
            }  
        System.out.println(prpa.equalsIgnoreCase(sepaInv2));
        }
    }
}

