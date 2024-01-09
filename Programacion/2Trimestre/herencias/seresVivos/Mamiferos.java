public class Mamiferos extends Vertebrados{
    private String especie;
    public Mamiferos(String especie, String nombre, String huesos){
        super(huesos, nombre);
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String Especie) {
        this.especie = Especie;
    }

    @Override
    public String toString() {
        return "{" +
            " Especie='" + especie + "'" +
            "}";
    }

    
}
