package classwork.lesson07.f_explicit_waits_more_than_you_think;

import org.openqa.selenium.By;

public interface MainPageLocators {
    By ADVICE_LOCATOR = By.xpath("//*[@id='index']/div[2]/ul/li[1]");
    By FIELD_QUERY_LOCATOR = By.id("search_query_top");
}