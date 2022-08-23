package ParaBankTests;

import ParaBankpages.HomePage;
import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        Browser.setDriver();
        driver = Browser.getDriver();
        driver.navigate().to(Browser.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public HomePage startHomePage() {
        return PageFactory.initElements(driver, HomePage.class);
    }

}
