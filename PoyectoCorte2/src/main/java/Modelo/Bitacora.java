
package Modelo;

public class Bitacora extends Anotacion {
    public Bitacora() {
    }
    public Bitacora(String fechaRegistro,String observacion){
    super(fechaRegistro, observacion);
    }
    @Override
    public String getCaso() {
        return "Bitacora : " + super.getCaso();
    }
}
