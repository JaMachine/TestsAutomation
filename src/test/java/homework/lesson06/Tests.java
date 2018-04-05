package homework.lesson06;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import static org.hamcrest.core.StringContains.containsString;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends Base {


    private String log = "e2341745@nwytg.com";
    private String pas = "qwerty";
    LoginPage pageLogin = new LoginPage(driver);
    AccountPage pageAccount = new AccountPage(driver);

    @Ignore
    @Test
    public void t1_baseLogin() {

        pageAccount = pageLogin.logIn(log, pas, driver);

        Assert.assertThat(driver.findElement(By.xpath("//div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }

    @Test
    public void t2_chainLogin() {

        pageAccount = pageLogin.enterUsername(log).enterPassword(pas).clickSignInBtn(driver);

        Assert.assertThat(driver.findElement(By.xpath("//div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }

    @Test
    public void t3_logOut() {

        pageLogin = pageAccount.signOut(driver);

        Assert.assertThat(driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/h3")).getText(),
                containsString("CREATE AN ACCOUNT"));
    }

}
