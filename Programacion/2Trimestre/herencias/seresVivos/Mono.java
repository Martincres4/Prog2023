public class Mono extends Homo{
    public Mono(String nombre, String huesos, String especie){
        super(especie, nombre, huesos);

    }

    @Override
    public String toString() {
        return "{" +
            "}";
    }
    public void comerPlatanos(){
        System.out.println("Que ricos los platanos");
    }
    
}
