package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
