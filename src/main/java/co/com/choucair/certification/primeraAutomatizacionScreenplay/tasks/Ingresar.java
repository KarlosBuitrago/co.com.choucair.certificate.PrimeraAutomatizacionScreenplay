package co.com.choucair.certification.primeraAutomatizacionScreenplay.tasks;

import co.com.choucair.certification.primeraAutomatizacionScreenplay.userInterface.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.primeraAutomatizacionScreenplay.userInterface.PaginaXTTT.*;

public class Ingresar implements Task {

    public static Ingresar addCredenciales() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("demo").into(USUARIO_TXT),
                Enter.theValue("demo").into(PASSWORD_TXT),
                Click.on(BUTTON_LOGIN)
        );
    }
}
