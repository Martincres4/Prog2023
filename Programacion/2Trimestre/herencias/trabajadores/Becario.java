public class Becario extends Persona{
    private int tiempoPracticas;

    public Becario(String nombre, String apellido, int edad, String dni) {
        super(dni, nombre, apellido, dni);
    }

    public Becario(int tiempoPracticas, String nombre, String apellido, int edad, String dni) {
        super(dni, nombre, apellido, dni);
        this.tiempoPracticas = tiempoPracticas;
    }

    public int getTiempoPracticas() {
        return this.tiempoPracticas;
    }

    public void setTiempoPracticas(int tiempoPracticas) {
        this.tiempoPracticas = tiempoPracticas;
    }

    @Override
    public String toString() {
        return "{" +
            " tiempoPracticas='" + tiempoPracticas + "'" +
            "}";
    }
    public void pringar(){
        System.out.println("Te toca pringar");        
    }
    
}
