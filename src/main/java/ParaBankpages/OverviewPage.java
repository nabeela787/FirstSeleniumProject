package ParaBankpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage {
    @FindBy(linkText = "Open New Account") private WebElement openAccountLink;

    public void clickOpenNewAccount() {
        openAccountLink.click();
    }

}
