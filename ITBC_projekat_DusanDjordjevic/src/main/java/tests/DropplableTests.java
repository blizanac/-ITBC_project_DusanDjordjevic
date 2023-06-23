package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DropplableTests extends BaseTestPage {

    private String droppedMessage= "Dropped!";
    private String dropHereMessage= "Drop here";

    @Test
    public void dragDropSimpleTest() {
        getDropplablePage().open()
                .dragAndDropMethod(getDropplablePage().getDragMeBox(), getDropplablePage().getDropMeBox());
        Assert.assertEquals(getDropplablePage().getDropMeBox().getText(), droppedMessage);
    }

    @Test
    public void dragDropAcceptabileTest() {
        getDropplablePage().open()
                .clickWebElement(getDropplablePage().getAcceptTabButton())
                .dragAndDropMethod(getDropplablePage().getAcceptabileDragBox(), getDropplablePage().getAcceptabileDropBox());
        Assert.assertEquals(getDropplablePage().getAcceptabileDropBox().getText(),droppedMessage);
    }

    @Test
    public void dragDropNotAcceptabileTest() {
        getDropplablePage().open()
                .clickWebElement(getDropplablePage().getAcceptTabButton())
                .dragAndDropMethod(getDropplablePage().getNotAcceptabileDragBox(), getDropplablePage().getAcceptabileDropBox());
        Assert.assertEquals(getDropplablePage().getAcceptabileDropBox().getText(), dropHereMessage);
    }

}
