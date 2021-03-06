package classwork.lesson06.withoutWaits;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.StringContains.containsString;

public class FirstTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @Test
    public void firstResultContainsText () {
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("dress");

        Assert.assertThat(driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]")).getText(),containsString("Dress"));


    }
}