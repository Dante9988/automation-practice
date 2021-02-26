package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.QuotePage;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class QuoteStepDefs {

    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    QuotePage quotePage = new QuotePage();

    @Given("I open {string} page")
    public void iOpenPage(String quotePage) {
        switch (quotePage) {
            case "quote":
                new QuotePage().open();
                break;
            default:
                throw new RuntimeException("This is not supported site " + quotePage);
        }
    }

    @Then("I verify the location")
    public void iVerifyTheLocation() {
        String applicationSection = quotePage.getLocation();

        assertThat(applicationSection).contains("Los Altos");
        assertThat(applicationSection).containsIgnoringCase("application");
    }

    @And("I fill out the form")
    public void iFillOutTheForm() {
        quotePage.FillOutFields(
                "anvarxadja",
                "xadja35@gmail.com",
                "Anvar99",
                "Anvar99",
                "08/09/1999",
                "155 Elm Street, Dallas, TX 75201");

        quotePage.fillOutName("Anvar", "Baltakhojayev");
        assertThat(quotePage.getNameValue().toString()).containsIgnoringCase("Anvar Baltakhojayev");
    }

    @Then("I download the document")
    public void iDownloadTheDocument() {
        quotePage.DownloadDocument();
    }

    @Then("I fill out contact name and phone")
    public void iFillOutContactNameAndPhone() {
        quotePage.iFrameFillOutNameAndPhone(
                "Anvar Baltakhojayev",
                "(415) 367 5407");
    }

    @And("I accept thirdPartyAgreement and submit a quote")
    public void iAcceptThirdPartyAgreement() {
        quotePage.AcceptThirdPartyAgreement();
        quotePage.SubmitQuote();
    }

    @Then("I verify the response")
    public void iVerifyTheResponse() {

        String actualResult = quotePage.getPageResult();
        assertThat(actualResult).containsIgnoringCase("Los Altos");
        assertThat(quotePage.getNameResult().toString()).contains("Anvarkhuzha");

    }

}
