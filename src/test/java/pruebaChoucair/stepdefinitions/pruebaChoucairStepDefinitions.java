package pruebaChoucair.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebaChoucair.questions.Answer;
import pruebaChoucair.tasks.*;

public class pruebaChoucairStepDefinitions {

    @Before
    public void setstage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Miguel wants to automatize creation of user in utest$")
    public void thanMiguelWantsToAutomatizeCreationOfUserInUtest() {
        OnStage.theActorCalled("Miguel").wasAbleTo(OpenUp.thePage(), EnterToTheForm.onThePage());
    }

    @When("^he fill the information$")
    public void heFillTheInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillTheForm.onThePage(), FillTheSecondForm.onThePage(),
                FillTheThirdForm.onThePage(), FillTheFourForm.onThepage());
    }

    @Then("^he create a new user (.*)$")
    public void heCreateANewUser(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat((Answer.toThe(question))));
    }
}
