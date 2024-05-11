public class Persona extends Homo{

    private String DNI;
    public Persona(String DNI, String nombre, String huesos, String especie){
        super(especie, nombre, huesos);
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "{" +
            "}";
    }
    public void comerPlatanos(){
        System.out.println("Que ricos los platanos");
    }
    public class SerVivo {
    }
    
}
