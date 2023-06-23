package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexTest extends BaseTestPage {

    @Test
    public void verifyIndexPageLoaded(){
        getIndexPage().open();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
    }
}
