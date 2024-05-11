public class SerVivo {
    private String nombre;

    public SerVivo(String nombre, int edad) {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            "}";
    }

}
