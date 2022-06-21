package pruebaChoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import pruebaChoucair.userinterface.UtestThirdFormPage;

public class FillTheThirdForm implements Task {

    public static FillTheThirdForm onThePage() {
        return Tasks.instrumented(FillTheThirdForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestThirdFormPage.INPUT_MOBILE),
                Click.on(UtestThirdFormPage.SELECT_MOBILE),
                Click.on(UtestThirdFormPage.INPUT_MODEL),
                Click.on(UtestThirdFormPage.SELECT_MODEL),
                Click.on(UtestThirdFormPage.INPUT_OS),
                Click.on(UtestThirdFormPage.SELECT_OS),
                Click.on(UtestThirdFormPage.BUTOON_LAST_STEP));
    }
}
