public class Trabajador extends Persona{
    private int sueldo, cif;


    public Trabajador(String nombre, String apellido, int edad, String dni, int sueldo, int cif) {
        super(dni, nombre, apellido, edad);
        this.sueldo = sueldo;
        this.cif = cif;
    }
    
    
    public Trabajador(String nombre, String apellido, int edad, String dni) {
        super(nombre, apellido, dni, edad);
    }


    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCif() {
        return this.cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }


    @Override
    public String toString() {
        return "{" +
            " sueldo='" + sueldo + "'" +
            ", cif='" + cif + "'" +
            "}";
    }

    public void trabajar(){
        System.out.println("A trabajar");
    }

    
}
