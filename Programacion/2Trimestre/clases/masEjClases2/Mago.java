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

    public String getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getDestreza() {
        return this.destreza;
    }

    public void setDestreza(String destreza) {
        this.destreza = destreza;
    }

    public String getConstitucion() {
        return this.constitucion;
    }

    public void setConstitucion(String constitucion) {
        this.constitucion = constitucion;
    }

    public String getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getSabiduria() {
        return this.sabiduria;
    }

    public void setSabiduria(String sabiduria) {
        this.sabiduria = sabiduria;
    }

    public String getCarisma() {
        return this.carisma;
    }

    public void setCarisma(String carisma) {
        this.carisma = carisma;
    }

    public String getVida() {
        return this.vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getLibroDeHechizos() {
        return this.libroDeHechizos;
    }

    public void setLibroDeHechizos(String libroDeHechizos) {
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
        System.out.println("Mago magia abjuracion");
    }

}
