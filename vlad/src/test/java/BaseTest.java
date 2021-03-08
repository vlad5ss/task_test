import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String JQUERY_URL = "https://jqueryui.com/demos/";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }
//
//    @BeforeTest
//    public void profileSetUp() {
//        System.setProperty("webdriver.chrome.driver", "C://bin//chromedriver.exe");
//    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(JQUERY_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() { return new HomePage(getDriver()); }

    public SpinnerPage getSpinnerPage() {
        return new SpinnerPage(getDriver());
    }

    public AutoCompletePage getAutoCompletePage() { return new AutoCompletePage(getDriver()); }

}
