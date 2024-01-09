public class Manager extends Trabajador{
    private String[] nombreEmple;


    public Manager(String[] nombreEmple, String nombre, String apellido, int edad, String dni, int sueldo, int cif) {
        super(nombre, apellido, edad, dni, sueldo, cif);
        this.nombreEmple = nombreEmple;
    }

    public String[] getNombreEmple() {
        return this.nombreEmple;
    }

    public void setNombreEmple(String[] nombreEmple) {
        this.nombreEmple = nombreEmple;
    }

    @Override
    public String toString() {
        return "{" +
            " nombreEmple='" + nombreEmple + "'" +
            "}";
    }

    public void informe(){
        System.out.println("Hacer informe desde manager");
    }
    
}
