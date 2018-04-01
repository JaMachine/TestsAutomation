package homework.lesson06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Base {

    static WebDriver d;


    @BeforeClass
    public static void setUp() {
        d = new ChromeDriver();
        d.manage().timeouts().implicitlyWait(10, SECONDS);
        d.get("http://automationpractice.com/index.php");
        d.manage().window().maximize();
        d.findElement(By.xpath("//div/nav/div[1]/a")).click();
    }

//    @AfterClass
//    public static void tearDown() {
//        d.close();
//    }


}

