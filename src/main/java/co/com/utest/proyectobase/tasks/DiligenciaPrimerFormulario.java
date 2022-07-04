package co.com.utest.proyectobase.tasks;

import co.com.utest.proyectobase.model.DatosRegistro;
import co.com.utest.proyectobase.userinterface.FormularioRegistro1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.util.List;

public class DiligenciaPrimerFormulario implements Task {
    private List<DatosRegistro> informacion;

    public DiligenciaPrimerFormulario(List<DatosRegistro> informacion) {
        this.informacion = informacion;
    }

    public static DiligenciaPrimerFormulario diligenciarFormulario1(List<DatosRegistro> informacion) {
        return Tasks.instrumented(DiligenciaPrimerFormulario.class, informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FormularioRegistro1.BOTON_UNETE_HOY),
                Enter.theValue(informacion.get(0).getStrNombre()).into(FormularioRegistro1.INGRESAR_NOMBRE),
                Enter.theValue(informacion.get(0).getStrApellido()).into(FormularioRegistro1.INGRESAR_APELLIDO),
                Enter.theValue(informacion.get(0).getStrEmail()).into(FormularioRegistro1.INGRESAR_EMAIL),
                SelectFromOptions.byVisibleText(informacion.get(0).getStrMes()).from(FormularioRegistro1.SELECCIONAR_MES),
                SelectFromOptions.byVisibleText(informacion.get(0).getStrDia()).from(FormularioRegistro1.SELECCIONAR_DIA),
                SelectFromOptions.byVisibleText(informacion.get(0).getStrAnio()).from(FormularioRegistro1.SELECCIONAR_ANIO),
                Enter.theValue(informacion.get(0).getStrLenguaje()).into(FormularioRegistro1.INGRESAR_LENGUAJES),
                Click.on(FormularioRegistro1.CLIC_SIGUIENTE)
                );
    }
}
