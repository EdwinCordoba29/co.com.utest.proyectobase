package co.com.utest.proyectobase.tasks;

import co.com.utest.proyectobase.model.DatosRegistro;
import co.com.utest.proyectobase.userinterface.FormularioRegistro4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class DiligenciaCuartoFormulario implements Task {
    private List<DatosRegistro> informacion;

    public DiligenciaCuartoFormulario(List<DatosRegistro> informacion) {
        this.informacion = informacion;
    }

    public static DiligenciaCuartoFormulario diligenciarFormulario4(List<DatosRegistro> informacion) {
        return Tasks.instrumented(DiligenciaCuartoFormulario.class, informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(informacion.get(0).getStrClave()).into(FormularioRegistro4.CLAVE),
                Enter.theValue(informacion.get(0).getStrClave()).into(FormularioRegistro4.CONFIRMAR_CLAVE),
                Click.on(FormularioRegistro4.CHECK1),
                Click.on(FormularioRegistro4.CHECK2),
                Click.on(FormularioRegistro4.CHECK3),
                Click.on(FormularioRegistro4.CLIC_BOTON_COMPLETAR)
        );

    }
}
