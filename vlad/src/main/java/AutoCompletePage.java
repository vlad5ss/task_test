import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AutoCompletePage extends BasePage {



    @FindBy(xpath = "//*[@id=\"sidebar\"]/aside[2]/ul/li[2]/a")
    private WebElement findAutoCompleteButton;

    @FindBy(xpath = "//*[@id=\"ui-id-53\"]")
    private List<WebElement> searchResultsProductsListText;

    @FindBy(xpath = "//input[@id='spinner']")
    private WebElement  searchInput;

    @FindBy(css = "\"input#tags\"")
    private WebElement  searchInput1;

    public AutoCompletePage(WebDriver driver) {
        super(driver);
    }

    public void clickAutocompleteButton(){findAutoCompleteButton.click();}

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword, Keys.ENTER);
    }

    public int getSearchResultsCount() {
        return getSearchResultsList().size();
    }

    public List<WebElement> getSearchResultsList() {
        return searchResultsProductsListText;
    }

}
