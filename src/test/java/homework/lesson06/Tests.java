package homework.lesson06;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.core.StringContains.containsString;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends Base {
    private String log = "e2341745@nwytg.com";
    private String pas = "qwerty";
    LoginPage pageLog = PageFactory.initElements(d, LoginPage.class);
    AccountPage pageAcc = PageFactory.initElements(d, AccountPage.class);

    @Ignore
    @Test
    public void t1_mainLogin() {

        pageAcc = pageLog.logIn(log, pas);
        Assert.assertThat(d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }


    @Test
    public void t2_chainLogin() {

        pageLog.enterUsername(log);
        pageLog.enterPassword(pas);
        pageAcc = pageLog.clickSignInBtn();
        Assert.assertThat(d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).getText(),
                containsString("Sign out"));
    }

    @Test
    public void t3_logOut() {

        pageLog = pageAcc.signOut();
        Assert.assertThat(d.findElement(By.xpath("//*[@id=\"create-account_form\"]/h3")).getText(),
                containsString("CREATE AN ACCOUNT"));
    }

}
