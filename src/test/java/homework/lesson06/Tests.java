package homework.lesson06;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Tests extends Base {
    private String log = "e2341745@nwytg.com";
    private String pas = "qwerty";
    LoginPage pageLog = PageFactory.initElements(d, LoginPage.class);
    AccountPage pageAcc = PageFactory.initElements(d, AccountPage.class);

    @Test
    public void t1_mainLogin() {

        pageAcc = pageLog.logIn(log, pas);
//        Assert.assertThat();
//        (new WebDriverWait(d, 10))
//                .until(textToBePresentInElement(d.findElement(By.xpath("//*[@id=\"center_column\"]/h1")), pAccount));

    }

    @Ignore
    @Test
    public void t2_chainLogin() {

        pageLog.enterUsername(log);
        pageLog.enterPassword(pas);
        pageAcc = pageLog.clickSignInBtn();
    }

    @Test
    public void t3_logOut() {

        pageLog = pageAcc.signOut();
    }

}
