package pruebaChoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pruebaChoucair.userinterface.EnterToFormPage;

public class EnterToTheForm implements Task {

    public static EnterToTheForm onThePage() {
        return Tasks.instrumented(EnterToTheForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EnterToFormPage.ENTER_FORM_BUTTON));
    }
}
