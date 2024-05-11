public class Becario extends Persona{
    private int tiempoPracticas;

    public Becario(int tiempoPracticas, String nombre, String apellido, int edad, String dni) {
        super(apellido, dni, nombre, edad);
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
