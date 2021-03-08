import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SpinnerPage extends BasePage {

    SpinnerPage spinnerPage;

    //XPATH for spinner Button
    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[2]/ul/li[12]/a")
    private WebElement findSpinnerButton;

    public SpinnerPage(WebDriver driver) {
        super(driver);
    }

    private static String expectedValue;
    public static final By SELECT_VALUE = By.cssSelector("input#spinner");
    public static final By FRAME_SPINNER = By.cssSelector(".demo-frame");
    public static final By GET_VALUE = By.id("getvalue");


    public void clickOnSpinnerButton() {
        findSpinnerButton.click();
    }

    public SpinnerPage switchToFrame(){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FRAME_SPINNER));
        return this;
    }

    public SpinnerPage fillValueInput(String text){
        expectedValue = text;
        wait.until(ExpectedConditions.visibilityOfElementLocated(SELECT_VALUE));
        driver.findElement(SELECT_VALUE).sendKeys(text);
        return this;
    }

    public SpinnerPage clickOnGetButton(){
        driver.findElement(GET_VALUE).click();
        return this;
    }

    public SpinnerPage verifyValueOnSpinnerPage(){
        String actualValue =  driver.switchTo().alert().getText();
        Assert.assertEquals(actualValue, expectedValue);
        return this;
    }

}
