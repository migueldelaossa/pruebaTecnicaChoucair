package pruebaChoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import pruebaChoucair.userinterface.UtestFormPage;

public class FillTheForm implements Task {

    public static FillTheForm onThePage() {
        return Tasks.instrumented(FillTheForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Miguel").into(UtestFormPage.INPUT_NAME),
                Enter.theValue("Angel").into(UtestFormPage.INPUT_LASTNAME),
                Enter.theValue("madlop_26@hotmails.com").into(UtestFormPage.INPUT_EMAIL),
                SelectFromOptions.byValue("number:3").from(UtestFormPage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byValue("number:26").from(UtestFormPage.INPUT_BIRTH_DAY),
                SelectFromOptions.byValue("number:1998").from(UtestFormPage.INPUT_BIRTH_YEAR),
                Enter.theValue("Spanish").into(UtestFormPage.INPUT_LANGUAGES),
                Click.on(UtestFormPage.LANGUAGE),
                Click.on(UtestFormPage.BUTTON_NEXT));
    }
}
