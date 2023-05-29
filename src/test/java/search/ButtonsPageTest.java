package search;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseUiTest;

public class ButtonsPageTest extends BaseUiTest {
    @Test
    public void testButtonPage(){
        navigate.toButtonsPage();
        buttonsPage.doubleClick()
                .rightClick()
                .clickMe();
        Assert.assertTrue(buttonsPage.areButtonMessagesDisplayed());
    }
}

