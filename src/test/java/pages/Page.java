package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static support.TestContext.getDriver;
import static support.TestContext.getExecuter;
// import static support.TestContext.getDriver;

public class Page {

    private String url;

    public void Page() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void open(String webpage){
        getDriver().get(url);
    }

    public void waitUntilElementToBeClickable(WebElement element){
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickWithJS(WebElement element){
        getExecuter().executeScript("arguments[0].click()", element);
    }

    public void click(WebElement element){
        waitUntilElementToBeClickable(element);
        try {
            element.click();
        } catch (ElementClickInterceptedException exception){
            clickWithJS(element);
        }
    }

}
