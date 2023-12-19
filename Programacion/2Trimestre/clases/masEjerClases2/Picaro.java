/*-Picaro (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida, suerte) y el metodo pegar, robar, abrirPuertas, envenenar.
 */
package masEjerClases2;

public class Picaro {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida, suerte;

    public Picaro() {
    }

    public Picaro(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
            String carisma, String vida, String suerte) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
        this.vida = vida;
        this.suerte = suerte;
    }

    @Override
    public String toString() {
        return "{" +
                " fuerza='" + fuerza + "'" +
                ", destreza='" + destreza + "'" +
                ", constitucion='" + constitucion + "'" +
                ", inteligencia='" + inteligencia + "'" +
                ", sabiduria='" + sabiduria + "'" +
                ", carisma='" + carisma + "'" +
                ", vida='" + vida + "'" +
                ", suerte='" + suerte + "'" +
                "}";
    }

    public static void pegar() {
        System.out.println("fuap");
    }  

    public static void robar() {
        System.out.println("fuap");
    }  

    public static void abrirPuertas() {
        System.out.println("fuap");
    }  
    
    public static void envenenar() {
        System.out.println("fuap");
    }  
    
}
