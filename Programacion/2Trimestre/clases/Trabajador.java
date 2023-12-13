//Crear la clase trabajador que tiene los siguientes atributos: nombre, puesto de trabajo, departamento(solo existe el departamento de informatica y recursos humanos), sueldo(ha de ser positivo), nombreJefe
public class Trabajador {
    private String nombre, puestoDeTrabajo, depart, nombreJefe;
    private float sueldo;

    public Trabajador(String nombre, String puestoDeTrabajo, String depart, String nombreJefe, float sueldo) {
        this.nombre = nombre;
        this.puestoDeTrabajo = puestoDeTrabajo;
        this.depart = depart;
        this.nombreJefe = nombreJefe;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuestoDeTrabajo() {
        return this.puestoDeTrabajo;
    }

    public void setPuestoDeTrabajo(String puestoDeTrabajo) {
        this.puestoDeTrabajo = puestoDeTrabajo;
    }

    public String getDepart() {
        return this.depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getNombreJefe() {
        return this.nombreJefe;
    }

    public void setNombreJefe(String nombreJefe) {
        this.nombreJefe = nombreJefe;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", puestoDeTrabajo='" + puestoDeTrabajo + "'" +
            ", depart='" + depart + "'" +
            ", nombreJefe='" + nombreJefe + "'" +
            ", sueldo='" + sueldo + "'" +
            "}";
    }
    
}
