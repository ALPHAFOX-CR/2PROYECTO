
package Modelo;

public class Narcotico extends CasoInvestigacion{
    private String tipoNarcotico;

    public Narcotico() {
    }

    public Narcotico(String tipoNarcotico) {
        this.tipoNarcotico = tipoNarcotico;
    }

    public String getTipoNarcotico() {
        return tipoNarcotico;
    }

    public void setTipoNarcotico(String tipoNarcotico) {
        this.tipoNarcotico = tipoNarcotico;
    }
    
    @Override
    public String getCaso() {
        return "Narcotico{" + "tipoNarcotico=" + tipoNarcotico + "}";
    }
}
