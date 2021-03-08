
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Test3 extends BaseTest {


    private String SEARCH_KEYWORD = "a";
    private String EXPECTED_SEARCH_QUERY = "query=ASP";

    @Test(priority = 1)
    public void openAutocompletePage() {
        getAutoCompletePage().clickAutocompleteButton();
        getBasePage().implicitWait(1000);
        getAutoCompletePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
        getBasePage().implicitWait(1000);
        assertEquals(getAutoCompletePage().getSearchResultsCount(), 12);
        getBasePage().implicitWait(1000);
        getAutoCompletePage().searchByKeyword(SEARCH_KEYWORD);
        for (WebElement webElement : getAutoCompletePage().getSearchResultsList()) {
            assertTrue(webElement.getText().contains(SEARCH_KEYWORD));
        }

    }



}
