package pruebaChoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebaChoucair.userinterface.UtestFourFormPage;
import pruebaChoucair.userinterface.UtestSecondFormPage;

public class FillTheFourForm implements Task {
    public static FillTheFourForm onThepage() {
        return Tasks.instrumented(FillTheFourForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFourFormPage.CREATE_PASSWORD),
                Enter.theValue("Miguel1234*").into(UtestFourFormPage.CREATE_PASSWORD),
                Click.on(UtestFourFormPage.CONFIRM_PASSWORD),
                Enter.theValue("Miguel1234*").into(UtestFourFormPage.CONFIRM_PASSWORD),
                Click.on(UtestFourFormPage.ACCEPT_TERMS),
                Click.on(UtestFourFormPage.ACCEPT_PRIVACY),
                Click.on(UtestFourFormPage.ENTER_BUTTON));
    }
}
