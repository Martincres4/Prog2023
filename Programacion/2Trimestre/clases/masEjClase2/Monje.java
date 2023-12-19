/*-Monje (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida) y el método pegar */
package masEjClases2;

public class Monje {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida;

    public Monje() {
    }

    public Monje(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
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

    public static void pegar() {
        System.out.println("fuap");
    }  
}
