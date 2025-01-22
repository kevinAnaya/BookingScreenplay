package com.co.booking.stepsdefinitions;

import com.co.booking.models.Credentials;
import com.co.booking.tasks.FormStep1Task;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepsDefinitions {

    @Managed
    WebDriver hisBrowser;

    //config de actores
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user open a web page$")
    public void theUserOpenAWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));

    }

    @When("^the user enter the credential$")
    public void theUserEnterTheCredential(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(FormStep1Task.enterForm1(credentials));

    }

    @Then("^the user can see initial page$")
    public void theUserCanSeeInitialPage() {

    }
}
