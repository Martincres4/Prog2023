public class Rosa extends Planta{
    

    public Rosa(String nombre, String hoja) {
        super(hoja, nombre);
    }

    @Override
    public String toString() {
        return "{" +
            "}";
    }


    public static void HueleBien(){
        System.out.println("Huele bien");
    }
}
