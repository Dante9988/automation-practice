package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;

import static support.TestContext.getDriver;

public class QuotePage extends Page {

    public QuotePage() {
        setUrl("https://skryabin.com/market/quote.html");
    }

    @FindBy(xpath = "//b[@id='personalInfo']/../..")
    private WebElement applicationSection;

    @FindBy(xpath = "//*[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//*[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='confirmPassword']")
    private WebElement confirmPassword;

    public WebElement getNameValue() {
        return nameValue;
    }

    @FindBy(xpath = "//input[@id='name']/../*[@value='Anvar Baltakhojayev']")
    private WebElement nameValue;

    @FindBy(xpath = "//*[@id='name']")
    private WebElement name;

    @FindBy(xpath = "//*[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id='middleName']")
    private WebElement middleName;

    @FindBy(xpath = "//*[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@name='phone']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='dateOfBirth']")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//select[@name='countryOfOrigin']/option[@value='USA']")
    private WebElement countryOfOrigin;

    @FindBy(xpath = "//*[@name='gender']/../*[@value='male']")
    private WebElement gender;

    @FindBy(xpath = "//*[@id='address']")
    private WebElement address;

    @FindBy(xpath = "//select[@name='carMake']/option[@value='BMW']")
    private WebElement carMake;

    @FindBy(xpath = "//*[@id='thirdPartyButton']")
    private WebElement thirdPartyAgreement;                          // Need to accept popup via manage() function

    @FindBy(xpath = "//iframe[@name='additionalInfo']")
    private WebElement additionalInfo;                                  // Need to access over iframe, xpath is iframe

    @FindBy(xpath = "//*[@id='contactPersonName']")
    private WebElement contactPersonName;

    @FindBy(xpath = "//*[@id='contactPersonPhone']")
    private WebElement contactPersonPhone;

    @FindBy(xpath = "//*[@download='Documents.pdf']/img")
    private WebElement download;

    @FindBy(xpath = "//*[@id='attachment']")
    private WebElement upload;

    @FindBy(xpath = "//*[@name='agreedToPrivacyPolicy']")
    private WebElement privacyPolicy;

    @FindBy(xpath = "//*[@id='formSubmit']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id='quotePageResult']")
    private WebElement quotePageResult;

    public WebElement getNameResult() {
        return nameResult;
    }

    @FindBy(xpath = "//b[@name='name']/../*[contains(text(),'Anvarkhuzha')]")
    private WebElement nameResult;

    public String getLocation() {
        return applicationSection.getText();
    }

    public void fillOutName(String firstNameValue, String lastNameValue) {
        this.name.click();
        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        this.saveButton.click();
    }

    public void FillOutFields(String usernameValue, String emailValue, String passwordValue, String confirmPasswordValue, String dateOfBirthValue, String addressValue) {
        username.sendKeys(usernameValue);
        email.sendKeys(emailValue);
        password.sendKeys(passwordValue);
        confirmPassword.sendKeys(confirmPasswordValue);
        dateOfBirth.sendKeys(dateOfBirthValue);
        address.sendKeys(addressValue);
    }

    public void DownloadDocument() {
        download.click();
    }

//    public void iUploadDocuments() {
//        String path = System.getProperty("/Users/anvarxadja/Downloads/Documents.pdf");
//        upload.sendKeys(path);
//    }

    public void iFrameFillOutNameAndPhone(String contactPersonNameValue, String contactPersonPhoneValue) {

        getDriver().switchTo().frame(additionalInfo);
        contactPersonName.sendKeys(contactPersonNameValue);
        contactPersonPhone.sendKeys(contactPersonPhoneValue);
        getDriver().switchTo().defaultContent();
    }

    public void SubmitQuote() {
        privacyPolicy.click();
        submitButton.click();
    }

    public void AcceptThirdPartyAgreement() {
        thirdPartyAgreement.click();
        getDriver().switchTo().alert().accept();
    }

    public String getPageResult() {
        return quotePageResult.getText();
    }
}
