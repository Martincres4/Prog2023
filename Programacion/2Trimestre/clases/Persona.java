//Crear la clase persona que tiene los siguientes atributos: nombre, apellidos, edad, localizacion, codigo postal, dni
public class Persona{
    private String nombre2, apellido1, apellido2, localizacion, dni;
    private int edad, cp;

    public Persona(String nombre2, String apellido1, String apellido2, int edad, String localizacion, int cp, String dni){
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.localizacion = localizacion;
        this.cp = cp;
        this.dni = dni;
    }

    public String getNombre2() {
        return this.nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getLocalizacion() {
        return this.localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCp() {
        return this.cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre2='" + nombre2 + "'" +
            ", apellido1='" + apellido1 + "'" +
            ", apellido2='" + apellido2 + "'" +
            ", localizacion='" + localizacion + "'" +
            ", dni='" + dni + "'" +
            ", edad='" + edad + "'" +
            ", cp='" + cp + "'" +
            "}";
    }

    
}