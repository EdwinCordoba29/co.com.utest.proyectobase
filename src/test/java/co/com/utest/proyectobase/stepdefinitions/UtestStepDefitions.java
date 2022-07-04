package co.com.utest.proyectobase.stepdefinitions;

import co.com.utest.proyectobase.model.DatosRegistro;
import co.com.utest.proyectobase.questions.ObtieneRegistroUtest;
import co.com.utest.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Dado("^Que Edwin quiere realizar el registro en la pagina de uTest$")
    public void queEdwinQuiereRealizarElRegistroEnLaPaginaDeUTest() {
        OnStage.theActorCalled("Edwin").wasAbleTo(AbrePaginaUtest.paginaUtest()
        );

    }

    @Cuando("^El busca la pagina de uTest y da clic en el boton unete hoy$")
    public void elBuscaLaPaginaDeUTestYDaClicEnElBotonUneteHoy(List<DatosRegistro> informacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciaPrimerFormulario.diligenciarFormulario1(informacion), DiligenciaSegundoFormulario.diligenciarFormulario2(informacion),
                DiligenciaTercerFormulario.diligenciarFormulario3(informacion), DiligenciaCuartoFormulario.diligenciarFormulario4(informacion)
        );

    }

    @Entonces("^El queda registrado en la pagina de Utest$")
    public void elQuedaRegistradoEnLaPaginaDeUtest(List<DatosRegistro> informacion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ObtieneRegistroUtest.Pregunta1(informacion))
        );

    }
}
