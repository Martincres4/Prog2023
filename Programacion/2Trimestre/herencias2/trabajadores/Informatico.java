public class Informatico extends Trabajador{
    private String ordenador;

    public Informatico(String nombre, String apellido, int edad, String dni, int sueldo, int cif, String ordenador) {
        super(nombre, apellido, edad, dni, sueldo, cif);
        this.ordenador = ordenador;
    }

    public String getOrdenador() {
        return this.ordenador;
    }

    public void setOrdenador(String ordenador) {
        this.ordenador = ordenador;
    }

    @Override
    public String toString() {
        return "{" +
            " ordenador='" + ordenador + "'" +
            "}";
    }


    public void trabajar(){
        System.out.println("A trabajar");
    }
    
}
