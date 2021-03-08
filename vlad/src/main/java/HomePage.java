import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class HomePage extends BasePage {

    HomePage homePage;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[1]/h3")
    private WebElement widjetIteraction;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[2]/h3")
    private WebElement widjetsWidjets;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[3]/h3")
    private WebElement widjetsEffect;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[4]/h3")
    private WebElement widjetsUtilities;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String checkSectionInLeftMenu(WebElement webElement) {
        return webElement.getText();
    }

    public void checkInteractionsInLeftMenu(String string) {
        assertEquals(checkSectionInLeftMenu(widjetIteraction), string);
    }

    public void checkWidgetsInLeftMenu(String string) {
        assertEquals(checkSectionInLeftMenu(widjetsWidjets), string);
    }

    public void checkEffectsInLeftMenu(String string) {
        assertEquals(checkSectionInLeftMenu(widjetsEffect), string);
    }

    public void checkUtilitiesInLeftMenu(String string) {
        assertEquals(checkSectionInLeftMenu(widjetsUtilities), string);
    }



}
