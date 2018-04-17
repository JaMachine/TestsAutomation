package homework.lesson08;

import org.junit.Test;

public class AllTests extends Base {

    LoginPage pLogin = new LoginPage(driver);
    AccountPage pAccount = new AccountPage(driver);
    ResultsPage pResult = new ResultsPage(driver);

    @Test
    public void t0_Login() {
        pAccount = pLogin.logIn(driver);
    }

    @Test
    public void t1_findProduct () {
        pResult = pAccount.sendQuery(driver, "dress");
        pResult.selectProduct();

    }

}
