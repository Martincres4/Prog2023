package Programacion.2Trimestre.herencias.seresVivos;

public class SerVivo {
    private String nombre;

    public SerVivo() {
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
