package co.com.choucair.certification.primeraAutomatizacionScreenplay.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaXTTT extends PageObject {
    public static Target USUARIO_TXT = Target.the("Escribe el usuario en el capo Username")
            .located(By.xpath("//input[@placeholder='Username']"));
    public static Target PASSWORD_TXT = Target.the("Escribe la contraseña en el capo Password")
            .located(By.xpath("//input[@placeholder='Password']"));
    public static Target BUTTON_LOGIN = Target.the("Escribe el usuario en el capo Username")
            .located(By.xpath("//*[@id=\"login\"]/form/button"));

    //MENU
    public static Target MENU_LBL = Target.the("Verifica que esta en la pagina principal")
            .located(By.xpath("//li[contains(text(),'Menu')]"));

}
