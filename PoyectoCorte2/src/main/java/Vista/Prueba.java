
package Vista;
import Modelo.*;
import java.util.ArrayList;


public class Prueba {

    public static void main(String[] args) {
        ArrayList<CasoInvestigacion>listaCasos = new ArrayList();
        CasoInvestigacion investiga = new Detective("E3R5","JUAN","PEREZ",5,"MUERTE");
        listaCasos.add(investiga);
        listaCasos.add(new Caso("EG6R","MUERTE ACCIDENTAL","A","12345"));
        listaCasos.add(new Sospechoso("D6E3","DIEGO ARMANDO","MATABAJA","23"));
        listaCasos.add(new Direccion("24","CENTRAL","VALLEDUPAR","CESAR","COLOMBIA","SI","ALTO, DE 1.70"));
        listaCasos.add(new Narcotico("DROGRAS EN PASTA"));
        listaCasos.add(new Homicidio("ANDRES PARRA"));
        listaCasos.add(new Cibercrimen("PORNOGRAFIA"));
        listaCasos.add(new Anotacion("29 DE OCTUBRE","CASO FUERTE DE MUERTE"));
        listaCasos.add(new Bitacora("29 DE OCTUBRE","CASO FUERTE DE MUERTE"));
     
        for (CasoInvestigacion c: listaCasos){
            MostrarCasos(c);
        }
    } 

    public static void MostrarCasos(CasoInvestigacion investiga) {
        System.out.println(investiga.mostrarCasos());
    }
}
