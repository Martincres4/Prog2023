/*-Druida  (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida) y el método hechizoNaturaleza */
package masEjerClases2;

public class Druida {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida;

    public Druida() {
    }

    public Druida(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
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

    public static void hechizoNaturaleza() {
        System.out.println("fuap");
    }
    
}
