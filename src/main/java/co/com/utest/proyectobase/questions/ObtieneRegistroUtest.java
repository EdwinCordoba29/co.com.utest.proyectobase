package co.com.utest.proyectobase.questions;

import co.com.utest.proyectobase.model.DatosRegistro;
import co.com.utest.proyectobase.userinterface.FormularioRegistro4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ObtieneRegistroUtest implements Question<Boolean> {
    private List<DatosRegistro> informacion;

    public ObtieneRegistroUtest(List<DatosRegistro> informacion) {
        this.informacion = informacion;
    }

    public static ObtieneRegistroUtest Pregunta1(List<DatosRegistro> informacion) {
        return new ObtieneRegistroUtest(informacion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String completarRegistro = Text.of(FormularioRegistro4.CLIC_BOTON_COMPLETAR).viewedBy(actor).asString();
        if(informacion.get(0).getStrCompletarRegistro().equals(completarRegistro)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
