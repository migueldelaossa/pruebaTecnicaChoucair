package pruebaChoucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFourFormPage extends PageObject {
    public static Target CREATE_PASSWORD = Target.the("Where do we write the password")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static Target CONFIRM_PASSWORD = Target.the("Where do we confirm the password").
            located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static Target ACCEPT_TERMS = Target.the("Where do we accept the terms").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static Target ACCEPT_PRIVACY =Target.the("Where do we accept the privacy terms")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static Target ENTER_BUTTON = Target.the("where do we create the user")
            .located(By.id("laddaBtn"));
    public static Target ANSWER = Target.the("").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
