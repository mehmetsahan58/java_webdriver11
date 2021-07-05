package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {

    private WebDriver driver;

    private By slideField = By.className("sliderContainer");

    private By value = By.id("range");

    public HorizontalSliderPage (WebDriver driver) {

        this.driver = driver;

    }

    public void clickAndHoldAndMoveSlide (String value) {

            while(!getSlideValue().equals(value)) {
                driver.findElement(slideField).sendKeys(Keys.ARROW_RIGHT);


            }

    }

    public String getSlideValue () {

        return driver.findElement(value).getText();
    }
}
