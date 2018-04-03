package homework.lesson06;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.core.StringContains.containsString;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends Base {
    private String log = "e2341745@nwytg.com";
    private String pas = "qwerty";
    LoginPage pageLogin = new LoginPage();
    AccountPage pageAccount = new AccountPage();

    @Test
    public void t1_mainLogin() {

        pageAccount = pageLogin.logIn(log, pas);

        Assert.assertThat(d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }

    @Ignore
    @Test
    public void t2_chainLogin() {

        pageLogin.enterUsername(log);
        pageLogin.enterPassword(pas);
        pageLogin.clickSignInBtn();

        Assert.assertThat(d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }

    @Test
    public void t3_logOut() {

        pageLogin = pageAccount.signOut();

        Assert.assertThat(d.findElement(By.xpath("//*[@id=\"create-account_form\"]/h3")).getText(),
                containsString("CREATE AN ACCOUNT"));
    }

}
