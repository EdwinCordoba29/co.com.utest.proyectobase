package co.com.utest.proyectobase.tasks;

import co.com.utest.proyectobase.model.DatosRegistro;
import co.com.utest.proyectobase.userinterface.FormularioRegistro2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class DiligenciaSegundoFormulario implements Task {

    private List<DatosRegistro> informacion;

    public DiligenciaSegundoFormulario(List<DatosRegistro> informacion) {
        this.informacion = informacion;
    }

    public static DiligenciaSegundoFormulario diligenciarFormulario2(List<DatosRegistro> informacion) {
        return Tasks.instrumented(DiligenciaSegundoFormulario.class, informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(informacion.get(0).getStrCiudad()).into(FormularioRegistro2.INGRESAR_CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro2.INGRESAR_CIUDAD),
                Hit.the(Keys.ENTER).into(FormularioRegistro2.INGRESAR_CIUDAD),
                Enter.theValue(informacion.get(0).getStrPostal()).into(FormularioRegistro2.INGRESAR_CODIGO_POSTAL),
                Click.on(FormularioRegistro2.CLIC_PAISES),
                Enter.theValue(informacion.get(0).getStrPais()).into(FormularioRegistro2.INGRESAR_PAIS),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro2.INGRESAR_PAIS),
                Hit.the(Keys.ENTER).into(FormularioRegistro2.INGRESAR_PAIS),
                Click.on(FormularioRegistro2.CLIC_SIGUIENTE)
        );

    }
}
