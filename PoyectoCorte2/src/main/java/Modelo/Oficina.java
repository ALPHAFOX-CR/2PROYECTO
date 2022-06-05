
package Modelo;

public class Oficina extends CasoInvestigacion{
    private String CodOficina;

    public Oficina() {
    }
    public Oficina(String CodOficina){
    this.CodOficina = CodOficina;
    }
    public String getCodOficina() {
        return CodOficina;
    }

    public void setCodOficina(String CodOficina) {
        this.CodOficina = CodOficina;
    }
  
    @Override
    public String getCaso() {
       return "Codigo Oficina : " + CodOficina; 
    }
}
