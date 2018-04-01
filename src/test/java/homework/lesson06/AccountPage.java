package homework.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Base{

    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2) > a")
    private WebElement bLogOut;

    public LoginPage signOut() {
        d.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();
        d.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
//        bLogOut.click();
        return PageFactory.initElements(d, LoginPage.class);
    }




}
