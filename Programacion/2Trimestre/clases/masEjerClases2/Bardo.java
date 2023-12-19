/*-Bardo  (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida) y el método curar, pegar, canto  */
package masEjerClases2;

public class Bardo {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida;

    public Bardo() {
    }

    public Bardo(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
            String carisma, String vida) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
        this.vida = vida;
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
                "}";
    }

    public static void curar() {
        System.out.println("fiuuuu");
    }

    public static void pegar() {
        System.out.println("pium");
    }

    public static void canto() {
        System.out.println("ole");
    }
    
}
