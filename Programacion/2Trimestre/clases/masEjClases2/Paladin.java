/*-Paladin (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida, dios) y el método pegar, rezar, ordenAbsoluta */
package masEjClases2;

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

    public String getDios() {
        return this.dios;
    }

    public void setDios(String dios) {
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
        System.out.println("Paladin pega");
    }

    public static void rezar() {
        System.out.println("Paladin reza");
    }

    public static void ordenAbsoluta() {
        System.out.println("Paladin magia absoluta");
    }

}
