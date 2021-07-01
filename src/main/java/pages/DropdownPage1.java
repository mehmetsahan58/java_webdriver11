package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage1 {

    private WebDriver driver;

    private By dropdown1 = By.id("dropdown");

    public DropdownPage1 (WebDriver driver) {

        this.driver = driver;
    }


    private Select findDropDownElement () {

        return new Select(driver.findElement(dropdown1));
    }

    public void selectFromDropDown (String option) {

        //Select dropdownElement = new Select(driver.findElement(dropdown));

        //dropdownElement.selectByVisibleText(option);

        findDropDownElement().selectByVisibleText(option);

    }

    public List<String> getSelectedOptions () {

        System.out.println("Clicking on the drop down");

        List<WebElement> opt = findDropDownElement().getAllSelectedOptions();

        List <String> list = opt.stream().map(e->e.getText()).collect(Collectors.toList());

        System.out.println("The total number of options in the dropdown is : " + opt.size());

        return list;




    }
}
