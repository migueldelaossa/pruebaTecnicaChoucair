package pruebaChoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EnterToFormPage extends PageObject {
    public static final Target ENTER_FORM_BUTTON = Target.the("button that click on to go to form page").
            located(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a"));
}
