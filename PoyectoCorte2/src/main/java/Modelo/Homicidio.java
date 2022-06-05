
package Modelo;

public class Homicidio extends CasoInvestigacion {
    private String detectiveSecundario;

    public Homicidio(){
    }
    public Homicidio( String detectiveSecundario){
    this.detectiveSecundario = detectiveSecundario;
    }

    public String getDetectiveSecundario() {
        return detectiveSecundario;
    }

    public void setDetectiveSecundario(String detectiveSecundario) {
        this.detectiveSecundario = detectiveSecundario;
    }
    
    @Override
    public String getCaso() {
        return "Homicidio{" + "detectiveSecundario=" + detectiveSecundario + "}";
    }
}
