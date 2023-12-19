/*-Hechicero  (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida) y el método hechizoCaotico */
package masEjClases2;

public class Hechicero {
    private String fuerza, destreza, constitucion, inteligencia, sabiduria, carisma, vida;

    public Hechicero() {
    }

    public Hechicero(String fuerza, String destreza, String constitucion, String inteligencia, String sabiduria,
            String carisma, String vida) {
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.carisma = carisma;
        this.vida = vida;
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

    public static void hechizoCaotico() {
        System.out.println("Hechicero hechizo caotico");
    }
}
