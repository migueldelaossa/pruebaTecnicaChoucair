package pruebaChoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestFormPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("where do we write the name").
            located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email").
            located(By.name("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("where do we click to the birth month").
            located(By.name("birthMonth"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("where do we click to the birth year").
            located(By.name("birthYear"));
    public static final Target INPUT_BIRTH_DAY = Target.the("where do we click to the birth day").
            located(By.name("birthDay"));
    public static final Target INPUT_LANGUAGES = Target.the("where do we click to the Languages").
            located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target LANGUAGE = Target.the("spanish language").
            located(By.xpath("//*[@id=\"ui-select-choices-row-0-0\"]/span/div/span"));
    public static final Target BUTTON_NEXT = Target.the("where do we pass to the next form").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
