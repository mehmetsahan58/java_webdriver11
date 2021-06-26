package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp () {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(new Dimension(300, 300));

        System.out.println ("The name of the website:  " + driver.getTitle());

        //driver.quit();
    }

    public static void main (String args []) {

        BaseTests test = new BaseTests();

        test.setUp();
    }
}