/*-Barbaro (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida, daño) y el método pegar */
package masEjClases2;

public class Barbaro {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida, dano;

    public Barbaro() {
    }

    public Barbaro(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
            String carisma, String vida, String dano) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
        this.vida = vida;
        this.dano = dano;
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
                ", dano='" + dano + "'" +
                "}";
    }

    public static void pegar() {
        System.out.println("pium");
    }
}
