package co.com.utest.proyectobase.tasks;

import co.com.utest.proyectobase.userinterface.PaginaPrincipalUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrePaginaUtest implements Task {
    private PaginaPrincipalUtest paginaUtest;
    public static AbrePaginaUtest paginaUtest() {
        return Tasks.instrumented(AbrePaginaUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest));
    }
}
