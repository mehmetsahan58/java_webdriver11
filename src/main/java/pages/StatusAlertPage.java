package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusAlertPage {

    private WebDriver driver;

    private By statusText = By.tagName("h1");

    public StatusAlertPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getStatusText () {

        return driver.findElement(statusText).getText();
    }
}
