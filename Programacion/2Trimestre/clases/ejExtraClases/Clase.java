//Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
public class Clase {
    private String titular;
    private double cantidad;


    public Clase(String titular) {
        this.titular = titular;
    }

    public Clase(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }


    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "{" +
            " titular='" + titular + "'" +
            ", cantidad='" + cantidad + "'" +
            "}";
    }
    //ingresar(double cantidad): se ingresa una cantidad a la cuenta, si 
    //la cantidad introducida es negativa, no se hará nada.
    public void ingresar(double cantidad){
        if (cantidad < 0) {
            System.out.println("negative for u");
        }else if(cantidad >=0){
            this.cantidad += cantidad;
        }

    }

    //retirar(double cantidad): se retira una cantidad a la cuenta, si 
    //restando la cantidad actual a la que nos pasan es negativa, la 
    //cantidad de la cuenta pasa a ser 0.
    public void retirar(double cantidad){
        if (cantidad < 0) {
            System.out.println("negative for u");
        }else if(cantidad >=0){
            this.cantidad -= cantidad;
        }

    }
    
}
