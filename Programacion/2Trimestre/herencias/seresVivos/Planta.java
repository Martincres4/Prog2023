public class Planta extends SerVivo{
    private String hoja;

    public Planta(String hoja, String nombre) {
        super(nombre);
        this.hoja = hoja;
    }
    
    public String getHoja() {
        return this.hoja;
    }

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    @Override
    public String toString() {
        return "{" +
            " hoja='" + hoja + "'" +
            "}";
    }
}
