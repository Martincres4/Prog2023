//Crear la clase Coche que tiene los siguientes atributos: nombre, modelo, marca, peso, precio. Crear 3 objetos con diferentes valores y mostrarlos por pantalla.
public class Coche {
    private String nombre, modelo, marca;
    private double peso, precio;

    Coche coche1 = new Coche("bmw", "32", "audi", 30.4, 50);

    public Coche(String nombre, String modelo, String marca, double peso, float precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.peso = peso;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", modelo='" + modelo + "'" +
            ", marca='" + marca + "'" +
            ", peso='" + peso + "'" +
            ", precio='" + precio + "'" +
            "}";
    }

}
