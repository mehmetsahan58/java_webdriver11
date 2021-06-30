package fogotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.StatusAlertPage;
import static org.testng.Assert.*;
public class ForgotPasswordTest extends BaseTests {

    @Test

     public void testRetrievePassword () {

        ForgotPasswordPage forgotPassword = homePage.clickForgotPassword();

        forgotPassword.enterEmail("msahan@gmail.com");

        StatusAlertPage status = forgotPassword.clickRetrievePassword();
        assertTrue(status.getStatusText().contains("Internal Server Error"), "Alert text is incorrect");

    }







}
