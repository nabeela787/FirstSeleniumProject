package OrangeHRMpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.Browser.getPropertyValue;

public class HomePage {

    @FindBy (id = "txtUsername") private WebElement username;
    @FindBy (id = "txtPassword") private WebElement password;
    @FindBy (id = "btnLogin") private WebElement loginButton;

    public void logIn() {
        username.sendKeys(getPropertyValue("username"));
        password.sendKeys(getPropertyValue("password"));
        loginButton.click();

    }
}
