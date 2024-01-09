public class Limpiador extends Trabajador{
    private String traje;

    public Limpiador(String nombre, String apellido, int edad, String dni, int sueldo, int cif, String traje) {
        super(nombre, apellido, edad, dni, sueldo, cif);
        this.traje = traje;
    }

    public String getOrdenador() {
        return this.traje;
    }

    public void setOrdenador(String ordenador) {
        this.traje = ordenador;
    }

    @Override
    public String toString() {
        return "{" +
            " ordenador='" + traje + "'" +
            "}";
    }


    public void limpiar(){
        System.out.println("A limpiar");
    }
    
}
