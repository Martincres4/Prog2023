/*-Picaro (Fuerza,Destreza,Constitución, Inteligencia, Sabiduria, Carisma, vida, suerte) y el metodo pegar, robar, abrirPuertas, envenenar.
 */
package masEjClases2;

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

    public String getSuerte() {
        return this.suerte;
    }

    public void setSuerte(String suerte) {
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
        System.out.println("Picaro pega");
    }

    public static void robar() {
        System.out.println("Picaro roba");
    }

    public static void abrirPuertas() {
        System.out.println("Picaro abre puerta");
    }

    public static void envenenar() {
        System.out.println("Picaro envenena");
    }

}
