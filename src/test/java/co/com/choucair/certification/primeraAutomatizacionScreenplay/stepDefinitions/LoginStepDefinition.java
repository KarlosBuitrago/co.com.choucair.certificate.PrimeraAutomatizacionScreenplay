package co.com.choucair.certification.primeraAutomatizacionScreenplay.stepDefinitions;

import co.com.choucair.certification.primeraAutomatizacionScreenplay.questions.Verificar;
import co.com.choucair.certification.primeraAutomatizacionScreenplay.tasks.AbrirPagina;
import co.com.choucair.certification.primeraAutomatizacionScreenplay.tasks.Ingresar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class LoginStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Carlos ingresa a la app XTTT$")
    public void queCarlosIngresaALaAppXTTT() throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(AbrirPagina.abrirUrl());
    }

    @Cuando("^digita sus credenciales e ingresa a la app$")
    public void digitaSusCredencialesEIngresaALaApp() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.addCredenciales());
    }

    @Entonces("^verifica que pudo ingresar correctamente$")
    public void verificaQuePudoIngresarCorrectamente() throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("MENU")));
    }

}
