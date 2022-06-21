package pruebaChoucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFourFormPage extends PageObject {
    public static Target CREATE_PASSWORD = Target.the("Where do we write the name of the city")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static Target CONFIRM_PASSWORD = Target.the("sdf").
            located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static Target ACCEPT_TERMS = Target.the("DF").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static Target ACCEPT_PRIVACY =Target.the("sfkj")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static Target ENTER_BUTTON = Target.the("")
            .located(By.id("laddaBtn"));
    public static Target ANSWER = Target.the("").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
