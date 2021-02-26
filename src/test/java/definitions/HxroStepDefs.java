package definitions;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en_lol.WEN;
import cucumber.api.java.en_old.Ac;
import cucumber.api.java8.Th;
import io.restassured.RestAssured;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HxroPage;
//import support.HxroRestWrapper;
import support.Loggable;
import support.TestContext;
import support.Hooks;
import pages.*;

import javax.sql.rowset.serial.SerialStruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;
import static support.TestContext.*;

public class HxroStepDefs implements Loggable {

    WebDriverWait wait = new WebDriverWait(getDriver(), 5);



    @Given("I open {string} page")
    public void iOpenPage(String webpage) {

        if ("hxro".equals(webpage)) {
            new HxroPage().open(webpage);
        } else {
            throw new RuntimeException("Unsupported page " + webpage);
        }
    }

    @Then("I verify elements on the page")
    public void iVerifyElementsOnThePage() {
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("I select {string}")
    public void iSelect(String arg0) {
    }

    @And("I select contracts available dates")
    public void iSelectContractsAvailableDates() {
    }

    @When("I verify expiration date")
    public void iVerifyExpirationDate() {
    }


    @And("I click on register button")
    public void iClickOnButton() {

        HxroPage hxroPage = new HxroPage();
        hxroPage.clickRegisterButton();
        wait.until(ExpectedConditions.elementToBeClickable(getDriver()
                .findElement(By.xpath("//button[@id='reg-button']"))));
    }


    @Given("I login to REST API as {string}")
    public void iLoginToRESTAPIAs(String user) {
    }

    @When("I create via REST API Tix {string}")
    public void iCreateViaRESTAPITix(String contract) {
    }

    @Then("I verify via REST API order is created")
    public void iVerifyViaRESTAPIOrderIsCreated() {
    }

    @When("I update, buy more via REST API placed {string}")
    public void iUpdateBuyMoreViaRESTAPIPlaced(String contracts) {
    }

    @Then("I verify via REST API order is updated")
    public void iVerifyViaRESTAPIOrderIsUpdated() {
    }

    @And("I cashout via REST API placed order")
    public void iCashoutViaRESTAPIPlacedOrder() {
    }
}
