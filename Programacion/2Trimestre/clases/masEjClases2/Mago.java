/*-Mago (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida, libro de hechizos) y el método magiaAbjuración */
package masEjClases2;

public class Mago {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida, libroDeHechizos;

    public Mago() {
    }

    public Mago(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
            String carisma, String vida, String libroDeHechizos) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
        this.vida = vida;
        this.libroDeHechizos = libroDeHechizos;
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
                ", libroDeHechizos='" + libroDeHechizos + "'" +
                "}";
    }

    public static void magiaAbjuración() {
        System.out.println("fuap");
    }    
    
}
