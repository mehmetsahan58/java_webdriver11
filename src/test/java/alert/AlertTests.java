package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {


    @Test

    public void testAlerts () {

        var alertsPage = homePage.clickJavaScriptAlerts();

        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        assertEquals (alertsPage.getResults(), "You successfully clicked an alert", "Alert test is incorrect");

    }
    @Test
    public void testGetTextFromAlert () {

        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alerts text is incorrect");
    }

    @Test

    public void testSetInputAlert () {

        var alertsPage = homePage.clickJavaScriptAlerts();

        alertsPage.triggerPrompt();
        String input = "TAU rocks!";
        alertsPage.alert_setInput(input);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults() ,"You entered: " + input, "Alert text is incorrect");



    }
}
