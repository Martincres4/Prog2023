public class Persona {
    private char sexo = 'H';
    private String nombre, dni;
    private int edad;
    private double peso, altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(char sexo, String nombre, String dni, int edad, double peso, double altura) {
        this.sexo = sexo;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "{" +
            " sexo='" + sexo + "'" +
            ", nombre='" + nombre + "'" +
            ", dni='" + dni + "'" +
            ", edad='" + edad + "'" +
            ", peso='" + peso + "'" +
            ", altura='" + altura + "'" +
            "}";
    }

    //calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), 
    //si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, 
    //si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo 
    //de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 
    //significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses 
    //constantes para devolver estos valores.
    public void calcularIMC(){
        

    }

    //esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad(int edad){
        this.edad = edad;
        boolean mayEdad;
        if(edad >=18){
            mayEdad = true;
        }else{
            mayEdad = false;
        }
        return mayEdad;
    }

    //comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no 
    //es correcto, sera H. No sera visible al exterior.
    public void comprobarSexo(char sexo){
        this.sexo = sexo;
        if(sexo =='H'){
            
        }

    }

    //genera un número aleatorio de 8 cifras, genera a partir de este su número su 
    //letra correspondiente. Este método sera invocado cuando se construya el objeto. 
    //Puedes dividir el método para que te sea más fácil. No será visible al exterior.
    public void generaDNI(){

    }
}
