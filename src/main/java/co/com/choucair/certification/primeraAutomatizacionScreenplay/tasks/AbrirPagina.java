package co.com.choucair.certification.primeraAutomatizacionScreenplay.tasks;

import co.com.choucair.certification.primeraAutomatizacionScreenplay.userInterface.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private PaginaXTTT paginaXTTT;

    public static AbrirPagina abrirUrl() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaXTTT));
    }
}
