public class Persona extends SerVivo{
    private String apellido, dni;

    public Persona(String nombre, int edad){
        super(nombre, edad);

    }

    public Persona(String apellido, String dni, String nombre, int edad) {
        super(nombre, edad);
        this.apellido = apellido;
        this.dni = dni;
    }


    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        return "{" +
            " apellido='" + apellido + "'" +
            ", dni='" + dni + "'" +
            "}";
    }
    
}
