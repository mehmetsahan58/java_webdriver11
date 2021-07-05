package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElementsPage {

    private WebDriver driver;

    private By addElement = By.xpath(".//button[text()='Add Element']");
    private By deleteElement = By.id("elements");

    private WebElement delete;




    public AddRemoveElementsPage (WebDriver driver) {

        this.driver = driver;

    }

    public void clickAddElement () {

        driver.findElement(addElement).click();

    }

    public String getDeleteButton () {

        return driver.findElement(deleteElement).getText();
    }

    public void clickDeleteButton () {

       driver.findElement(deleteElement).click();
    }



    
}
