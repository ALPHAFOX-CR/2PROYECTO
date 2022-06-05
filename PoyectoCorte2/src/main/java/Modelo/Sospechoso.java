
package Modelo;

public class Sospechoso extends CasoInvestigacion{
    private String idSospechoso;
    private String NombreSospechoso;
    private String alias;
    private String edadSospechoso;

    public Sospechoso() {
    }

    public Sospechoso(String idSospechoso, String NombreSospechoso, String alias, String edadSospechoso) {
        this.idSospechoso = idSospechoso;
        this.NombreSospechoso = NombreSospechoso;
        this.alias = alias;
        this.edadSospechoso = edadSospechoso;
    }

    public String getIdSospechoso() {
        return idSospechoso;
    }

    public String getNombreSospechoso() {
        return NombreSospechoso;
    }

    public String getAlias() {
        return alias;
    }

    public String getEdadSospechoso() {
        return edadSospechoso;
    }

    public void setIdSospechoso(String idSospechoso) {
        this.idSospechoso = idSospechoso;
    }

    public void setNombreSospechoso(String NombreSospechoso) {
        this.NombreSospechoso = NombreSospechoso;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdadSospechoso(String edadSospechoso) {
        this.edadSospechoso = edadSospechoso;
    }

    @Override
    public String getCaso() {
        return "Sospechoso{" + "idSospechoso=" + idSospechoso + ", NombreSospechoso=" + NombreSospechoso + ", alias=" + alias + ", edadSospechoso=" + edadSospechoso + "}";
    }
}
