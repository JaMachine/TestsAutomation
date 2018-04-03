package homework.lesson06;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Base {

    AccountPage() {
        PageFactory.initElements(d, this);
    }

    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
    private WebElement bLogOut;

    public LoginPage signOut() {

        bLogOut.click();
        return new LoginPage();
    }


}
