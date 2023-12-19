/*Crea la clase Ordenador el cual tiene como caracteristicas:
modelo de la cpu, modelo de la gpu, memoria ram, sistema operativo, 
fuente de alimentacion y todos ellos tienen el mismo modelo de torre.
	 	 */
package masEjClases;

public class Ordenador {
    final String modeloTorre = "C3";
    public String modeloCPU, SistemaOperativo, FuenteDeAlimentacion;
    public int memoriaRAM;

    public Ordenador() {
    }

    public Ordenador(String modeloCPU, String SistemaOperativo, String FuenteDeAlimentacion, int memoriaRAM) {
        this.modeloCPU = modeloCPU;
        this.SistemaOperativo = SistemaOperativo;
        this.FuenteDeAlimentacion = FuenteDeAlimentacion;
        this.memoriaRAM = memoriaRAM;
    }

    public String getModeloTorre() {
        return this.modeloTorre;
    }

    public String getModeloCPU() {
        return this.modeloCPU;
    }

    public void setModeloCPU(String modeloCPU) {
        this.modeloCPU = modeloCPU;
    }

    public String getSistemaOperativo() {
        return this.SistemaOperativo;
    }

    public void setSistemaOperativo(String SistemaOperativo) {
        this.SistemaOperativo = SistemaOperativo;
    }

    public String getFuenteDeAlimentacion() {
        return this.FuenteDeAlimentacion;
    }

    public void setFuenteDeAlimentacion(String FuenteDeAlimentacion) {
        this.FuenteDeAlimentacion = FuenteDeAlimentacion;
    }

    public int getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "{" +
                " modeloTorre='" + modeloTorre + "'" +
                ", modeloCPU='" + modeloCPU + "'" +
                ", SistemaOperativo='" + SistemaOperativo + "'" +
                ", FuenteDeAlimentacion='" + FuenteDeAlimentacion + "'" +
                ", memoriaRAM='" + memoriaRAM + "'" +
                "}";
    }

}
