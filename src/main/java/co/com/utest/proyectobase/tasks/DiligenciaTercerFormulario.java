package co.com.utest.proyectobase.tasks;


import co.com.utest.proyectobase.model.DatosRegistro;
import co.com.utest.proyectobase.userinterface.FormularioRegistro3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import java.util.List;


public class DiligenciaTercerFormulario implements Task {
    private List<DatosRegistro> informacion;

    public DiligenciaTercerFormulario(List<DatosRegistro> informacion) {
        this.informacion = informacion;
    }

    public static DiligenciaTercerFormulario diligenciarFormulario3(List<DatosRegistro> informacion) {
        return Tasks.instrumented(DiligenciaTercerFormulario.class, informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormularioRegistro3.CLIC_SELECCIONAR_PC),
                Enter.theValue(informacion.get(0).getStrPc()).into(FormularioRegistro3.SELECCIONAR_PC),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro3.SELECCIONAR_PC),
                Hit.the(Keys.ENTER).into(FormularioRegistro3.SELECCIONAR_PC),
                Click.on(FormularioRegistro3.CLIC_SELECCIONAR_VERSION_PC),
                Enter.theValue(informacion.get(0).getStrVersionPc()).into(FormularioRegistro3.SELECCIONAR_VERSION_PC),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro3.SELECCIONAR_VERSION_PC),
                Hit.the(Keys.ENTER).into(FormularioRegistro3.SELECCIONAR_VERSION_PC),
                Click.on(FormularioRegistro3.CLIC_SELECCIONAR_LENGUAJE_PC),
                Enter.theValue(informacion.get(0).getStrLenguajePC()).into(FormularioRegistro3.SELECCIONAR_LENGUAJE_PC),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro3.SELECCIONAR_LENGUAJE_PC),
                Hit.the(Keys.ENTER).into(FormularioRegistro3.SELECCIONAR_LENGUAJE_PC),
                Click.on(FormularioRegistro3.CLIC_MOVIL),
                Enter.theValue(informacion.get(0).getStrMovil()).into(FormularioRegistro3.SELECCIONAR_MOVIL),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro3.SELECCIONAR_MOVIL),
                Hit.the(Keys.ENTER).into(FormularioRegistro3.SELECCIONAR_MOVIL),
                Click.on(FormularioRegistro3.CLIC_MODELO_MOVIL),
                Enter.theValue(informacion.get(0).getStrModeloMovil()).into(FormularioRegistro3.SELECCIONAR_MODELO_MOVIL),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro3.SELECCIONAR_MODELO_MOVIL),
                Hit.the(Keys.ENTER).into(FormularioRegistro3.SELECCIONAR_MODELO_MOVIL),
                Click.on(FormularioRegistro3.CLIC_SISTEMA_MOVIL),
                Enter.theValue(informacion.get(0).getStrSitemaMovil()).into(FormularioRegistro3.SELECCIONAR_SISTEMA_MOVIL),
                Hit.the(Keys.ARROW_DOWN).into(FormularioRegistro3.SELECCIONAR_SISTEMA_MOVIL),
                Hit.the(Keys.ENTER).into(FormularioRegistro3.SELECCIONAR_SISTEMA_MOVIL),
                Click.on(FormularioRegistro3.CLIC_SIGUIENTE)
        );
    }
}
