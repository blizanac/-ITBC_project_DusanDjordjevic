package tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTestPage {
    private String doubleClickMessage = "You have done a double click";
    private String rightClickMessage = "You have done a right click";
    private String oneClickMessage = "You have done a dynamic click";
    @Test
    public void verifyFunctionalityOfDubleClick() {
        getButtonsPage().open()
                .doubleClick(getButtonsPage().getDoubleClickMeButton())
                .waitMessage(getButtonsPage().getDoubleClickMessage());
        Assert.assertTrue(getButtonsPage().getDoubleClickMessage().isDisplayed());
        Assert.assertEquals(getButtonsPage().getDoubleClickMessage().getText(),doubleClickMessage);
    }

    @Test
    public void verifyFunctionalityOfRightClick() {
        getButtonsPage().open()
                .rightClick(getButtonsPage().getRightClickButton())
                .waitMessage(getButtonsPage().getRightClickMessage());
        Assert.assertTrue(getButtonsPage().getRightClickMessage().isDisplayed());
        Assert.assertEquals(getButtonsPage().getRightClickMessage().getText(),rightClickMessage);
    }

    @Test
    public void verifyFunctionalityOfOneClick() {
        getButtonsPage().open()
                .oneClick(getButtonsPage().getClickMeButton())
                .waitMessage(getButtonsPage().getOneClickMessage());
        Assert.assertTrue(getButtonsPage().getOneClickMessage().isDisplayed());
        Assert.assertEquals(getButtonsPage().getOneClickMessage().getText(),oneClickMessage);
    }
}