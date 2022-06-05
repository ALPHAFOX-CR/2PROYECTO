
package Modelo;

public class Detective extends CasoInvestigacion{
    private String id;
    private String nombre;
    private String apellido;
    private int Experiencia;
    private String tipoCaso;
  
    public Detective() {
    }

    public Detective(String id, String nombre, String apellido, int Experiencia, String tipoCaso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Experiencia = Experiencia;
        this.tipoCaso = tipoCaso;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAñosExperiencia() {
        return Experiencia;
    }

    public String getTipoCaso() {
        return tipoCaso;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.Experiencia = añosExperiencia;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    @Override
    public String getCaso() {
        return "Detective{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Experiencia=" + Experiencia + ", tipoCaso=" + tipoCaso + "}";
    }
}
