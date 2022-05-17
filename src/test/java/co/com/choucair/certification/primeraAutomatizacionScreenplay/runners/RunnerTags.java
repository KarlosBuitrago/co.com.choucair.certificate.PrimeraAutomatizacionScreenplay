package co.com.choucair.certification.primeraAutomatizacionScreenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        tags = {"@HistoriaDeUsuario"},
        glue = "co.com.choucair.certification.primeraAutomatizacionScreenplay.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
