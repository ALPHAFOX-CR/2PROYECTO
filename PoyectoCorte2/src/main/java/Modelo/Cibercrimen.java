
package Modelo;

public class Cibercrimen extends CasoInvestigacion {
    private String tiposCiber;

    public Cibercrimen() {
    }

    public Cibercrimen(String tiposCiber){
        this.tiposCiber = tiposCiber;
    }

    public String getTiposCiber() {
        return tiposCiber;
    }

    public void setTiposCiber(String tiposCiber) {
        this.tiposCiber = tiposCiber;
    }
    
    @Override
    public String getCaso() {
        return "Cibercrimen{" + "tiposCiber=" + tiposCiber + "}";
    }
}
