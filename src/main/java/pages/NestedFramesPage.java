package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {


    private WebDriver driver;

    private String topFrame = "frame-top";

    private String leftFrame = "frame-left";

    private String bottomFrame = "frame-bottom";

    private By textOfFrames = By.tagName("body");


    public NestedFramesPage (WebDriver driver) {

        this.driver = driver;

    }

    private String getTextFromFrames () {

        return driver.findElement(textOfFrames).getText();
    }

    public String getTextFromLeftFrames () {

        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getTextFromFrames();

        driver.switchTo().parentFrame(); //exit left to top
        driver.switchTo().parentFrame(); //exit top to main

        return text;


    }

    public String getTextFromBottomFrames () {

        driver.switchTo().frame(bottomFrame);

        String text = getTextFromFrames();

        driver.switchTo().parentFrame(); //exit bottom to main


        return text;


    }





}
