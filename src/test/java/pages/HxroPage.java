package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static support.TestContext.getDriver;

public class HxroPage extends Page{

    public HxroPage(){
        setUrl("https://live.hxro.io/");
    }


    @FindBy(xpath = "//button/p[contains(text(), 'TixWix')]")
    private WebElement tixWix;
    @FindBy(xpath = "//button/p/span[contains(text(), 'Moon')]/../span[contains(text(), 'Rekt')]")
    private WebElement moonRekt;
    @FindBy(xpath = "//a[@href='/register']/div[contains(text(),'REGISTER')]")
    private WebElement registerButton;


    public void clickMoonRekt(){
        moonRekt.click();
    }

    public void clickTixWix(){
        tixWix.click();
    }

    public void clickRegisterButton() {registerButton.click();}

}
