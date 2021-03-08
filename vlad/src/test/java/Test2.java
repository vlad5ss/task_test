


import org.testng.annotations.Test;


public class Test2 extends BaseTest {

    @Test(priority = 1)
    public void checkSpinerTest() {
        getSpinnerPage().clickOnSpinnerButton();
        getBasePage().implicitWait(1000);
        getSpinnerPage().switchToFrame();
        getSpinnerPage().fillValueInput("2");
        getBasePage().implicitWait(1000);
        getSpinnerPage().clickOnGetButton();
        getBasePage().implicitWait(1000);
        getSpinnerPage().verifyValueOnSpinnerPage();
        getBasePage().implicitWait(1000);

    }


}
