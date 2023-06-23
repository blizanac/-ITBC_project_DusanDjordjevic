package tests;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTestPage {
    private String resultMessage = "You have selected";

    @Test
    public void verifyFuncionaltyOfCheckBox() {
        getCheckBox().open()
                .selectCheckBoxMethod();
        Assert.assertTrue(getCheckBox().getResultField().isDisplayed());
    }

}
