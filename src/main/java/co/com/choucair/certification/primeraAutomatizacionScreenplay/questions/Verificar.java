package co.com.choucair.certification.primeraAutomatizacionScreenplay.questions;

import co.com.choucair.certification.primeraAutomatizacionScreenplay.userInterface.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {
    public static Verificar resultado() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaXTTT.MENU_LBL).viewedBy(actor).asString();
    }
}
