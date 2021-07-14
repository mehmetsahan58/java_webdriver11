package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EntryAdPage {

    private WebDriver driver;

    private By closeButton = By.tagName("p");
    private By clickHereButton = By.id("restart-ad");
    private By modal = By.className("modal");


    public EntryAdPage (WebDriver driver) {

        this.driver = driver;

    }

    public void clickCloseButton () {

        driver.findElement(closeButton).click();
    }

    public void doubleClickHereButton1 () {

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(clickHereButton)).doubleClick().build().perform();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(modal)));


    }


    public String getModalText () {

        return driver.switchTo().alert().getText();
    }
}
