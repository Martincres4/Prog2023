//Crear la clase animal que tiene los siguientes atributos: nombre,tamaño, peso, subespecie y tiene como método comer,reproduccion y matar.
public class Animal {
    private String nombre, subespecie;
    private float tamano, peso;

    
    
    public Animal(String nombre, float tamano, float peso, String subespecie){
        this.nombre = nombre;
        this.tamano = tamano;
        this.peso = peso;
        this.subespecie = subespecie;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSubespecie() {
        return this.subespecie;
    }

    public void setSubespecie(String subespecie) {
        this.subespecie = subespecie;
    }

    public float getTamano() {
        return this.tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    public static void comer(){
        System.out.println("He comido");
    }
    public static void reproduccion(){
        System.out.println("reproduccion");
    }
    public static void matar(){
        System.out.println("matao");
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", subespecie='" + subespecie + "'" +
            ", tamano='" + tamano + "'" +
            ", peso='" + peso + "'" +
            "}";
    }

}

