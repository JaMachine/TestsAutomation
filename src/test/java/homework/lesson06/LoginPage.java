package homework.lesson06;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    LoginPage() {
        PageFactory.initElements(d, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement fLog;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    private WebElement fPas;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    private WebElement bLog;


    public AccountPage logIn(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickSignInBtn();
        return new AccountPage();
    }

    public void enterUsername(String username) {
        fLog.click();
        fLog.sendKeys(username);
    }

    public void enterPassword(String password) {
        fPas.click();
        fPas.sendKeys(password);
    }

    public void clickSignInBtn() {
        bLog.click();
    }


}
