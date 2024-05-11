public class Vertebrados extends Animal{
    private String huesos;

    public Vertebrados(String huesos, String nombre) {
        super(nombre);
        this.huesos = huesos;
    }

    public String getHuesos() {
        return this.huesos;
    }

    public void setHuesos(String huesos) {
        this.huesos = huesos;
    }

    public Vertebrados huesos(String huesos) {
        setHuesos(huesos);
        return this;
    }
    
    @Override
    public String toString() {
        return "{" +
            " huesos='" + getHuesos() + "'" +
            "}";
    }

    
}
