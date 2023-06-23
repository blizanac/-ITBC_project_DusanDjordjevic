package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTestPage {

    @Test
    public void verifyOfClicabilityConfirmButton() {
        getAlertsPage().open()
                .clickElementMethod(getAlertsPage().getConfirmButton())
                .switchAlertWindow()
                .acceptAlertMessage();
        Assert.assertTrue(getAlertsPage().getConfirmMessageButton().isDisplayed());
    }

    @Test
    public void verifyOfClicabilityPromptButton() {
        getAlertsPage().open()
                .clickElementMethod(getAlertsPage().getPromtButton())
                .switchAlertWindow()
                .sendText("Dusan")
                .acceptAlertMessage();
        Assert.assertTrue(getAlertsPage().getPromptMessageButton().isDisplayed());
    }
}
