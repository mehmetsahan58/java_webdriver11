package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {


    private WebDriver driver;


    public FramesPage(WebDriver driver) {

        this.driver = driver;

    }

    public NestedFramesPage clickNestedFrames() {

        driver.findElement(By.linkText("Nested Frames")).click();

        return new NestedFramesPage(driver);


    }
}
