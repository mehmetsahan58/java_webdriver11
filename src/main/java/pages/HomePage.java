package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    //private By formAuthenticationLink = By.linkText("Form Authentication");

    //private By forgotPassword = By.linkText("Forgot Password");

    public HomePage (WebDriver driver) {

        this.driver = driver;
    }

    private void clickLink (String linkText) {

        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication () {

        //driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");

        return new LoginPage (driver);
    }

  public ForgotPasswordPage clickForgotPassword () {
        //driver.findElement(forgotPassword).click();
        clickLink("Forgot Password");
        return new ForgotPasswordPage (driver);
  }

  public DropdownPage clickDropDown () {

        clickLink("Dropdown");

        return new DropdownPage(driver);
  }

    public DropdownPage1 clickDropDown1 () {

        clickLink("Dropdown");

        return new DropdownPage1(driver);
    }






}
