
package Modelo;

public class Caso extends CasoInvestigacion{
    private String idCaso;
    private String descripcion;
    private String prioridad;
    private String clave;

    public Caso() {
    }

    public Caso(String idCaso, String descripcion, String prioridad, String clave) {
        this.idCaso = idCaso;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.clave = clave;
    }

    
    public String getIdCaso() {
        return idCaso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getClave() {
        return clave;
    }
    
    public void setIdCaso(String idCaso) {
        this.idCaso = idCaso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   
    @Override
    public String getCaso() {
        return "Caso{" + "idCaso=" + idCaso + ", descripcion=" + descripcion + ", prioridad=" + prioridad + ", clave=" + clave + "}";
    }
}
