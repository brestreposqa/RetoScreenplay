package com.demoqa.test.stepdefinitions;

import com.demoqa.test.interactions.OpenTheBrowser;
import com.demoqa.test.tasks.FillAllFieldsForms;
import com.demoqa.test.tasks.SelectForms;
import com.demoqa.test.tasks.ValidationForms;
import com.demoqa.test.ui.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PracticeFormsStepDefinitions {

    @Managed
    private WebDriver driver;

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Brahian").can(BrowseTheWeb.with(driver));
    }

    @Given("^that a web user wants to register in demoqa$")
    public void thatAWebUserWantsToRegisterInDemoqa() {
        theActorInTheSpotlight().wasAbleTo(OpenTheBrowser.on(HomePage.URL));
        theActorInTheSpotlight().wasAbleTo(SelectForms.option());
    }

    @When("^he fills all the requested fields$")
    public void heFillsAllTheRequestedFields() {
        theActorInTheSpotlight().attemptsTo(FillAllFieldsForms.successful());
    }

    @Then("^he should see your registration data$")
    public void heShouldSeeYourRegistrationData() {
        theActorInTheSpotlight().attemptsTo(ValidationForms.validation());
    }
}
