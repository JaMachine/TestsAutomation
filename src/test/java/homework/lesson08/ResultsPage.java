package homework.lesson08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultsPage {
    ResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "product-container")
    private List<WebElement> results;

    public void selectProduct() {
        for (WebElement e : results)
            if (e.getText().contains("$26.00")){
                e. click();
                //*[@id="center_column"]/ul/li[5]/div/div[2]/div[2]/a[1]/span

        }


    }


}
