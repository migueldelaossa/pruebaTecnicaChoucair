package pruebaChoucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class UtestSecondFormPage extends PageObject {
    public static Target CITIES = Target.the("Where do we write the name of the city")
            .located(By.xpath("//div[@class='pac-container pac-logo']/div[1]"));

    public static Target SELECT_CITY=Target.the("Where do we select the name of the city")
            .located(By.id("city"));

    public static Target INPUT_ZIP_CODE= Target.the("where do we write the zip code")
            .located(By.id("zip"));

    public static Target BUTTON_NEXT_FORM= Target.the("press the button to continue to next form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}