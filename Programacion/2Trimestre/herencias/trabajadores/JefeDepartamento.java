public class JefeDepartamento extends Manager{
    private String nombreDep;

    public JefeDepartamento(String nombreDep, String[] nombreEmple, String nombre, String apellido, int edad, String dni, int sueldo, int cif) {
        super(nombreEmple, nombre, apellido, edad, dni, sueldo, cif);
        this.nombreDep = nombreDep;
    }

    public String getNombreDep() {
        return this.nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    @Override
    public String toString() {
        return "{" +
            " nombreDep='" + nombreDep + "'" +
            "}";
    }

    public void informe(){
        System.out.println("Hazme el informe");
    }
    
}
