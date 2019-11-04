package gradle.cucumber.step;

import gradle.cucumber.domain.GoogleCheese;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleCheeseStepDep {

    private GoogleCheese googleCheese;

    @Given("I am on the Google search page")
    public void I_visit_google() {
        googleCheese = new GoogleCheese(new FirefoxDriver());
    }

    @When("I search for {string}")
    public void search_for(String query) {
        googleCheese.submitQuery(query);
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String titleStartsWith) {
        googleCheese.checkTitle(titleStartsWith);
    }

    @After()
    public void closeBrowser() {
        googleCheese.closeBrowser();
    }
}
