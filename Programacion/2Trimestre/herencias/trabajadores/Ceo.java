public class Ceo extends JefeDepartamento{
    private boolean dueño;
    private String coche;

    public Ceo(boolean dueño, String coche, String nombreDep, String[] nombreEmple, String nombre, String apellido, int edad, String dni, int sueldo, int cif) {
        super(nombreDep, nombreEmple, nombre, apellido, edad, dni, sueldo, cif);
        this.dueño = dueño;
        this.coche = coche;
    }


    public boolean isDueño() {
        return this.dueño;
    }

    public boolean getDueño() {
        return this.dueño;
    }

    public void setDueño(boolean dueño) {
        this.dueño = dueño;
    }

    public String getCoche() {
        return this.coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "{" +
            " dueño='" + dueño + "'" +
            ", coche='" + coche + "'" +
            "}";
    }


    public void cobrar(){
        System.out.println("Dame dineros");
    }
    public void informe(){
        System.out.println("Informe pls");

    }
}
