/*-Paladin (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida, dios) y el método pegar, rezar, ordenAbsoluta */
package masEjerClases2;

public class Paladin {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida, dios;

    public Paladin() {
    }

    public Paladin(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
            String carisma, String vida, String dios) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
        this.vida = vida;
        this.dios = dios;
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
                ", dios='" + dios + "'" +
                "}";
    }

    public static void pegar() {
        System.out.println("fuap");
    }  

    public static void rezar() {
        System.out.println("fuap");
    }  

    public static void ordenAbsoluta() {
        System.out.println("fuap");
    }  
    
}
