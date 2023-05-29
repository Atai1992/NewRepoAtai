package search;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.BaseUiTest;

public class ModalTest extends BaseUiTest {
    @BeforeClass
    public void navigateModal(){
        navigate.toModalDialogPage();
    }
    @Test
    public  void smallModalTest(){
        modalPage.smallModal.click();
        String smallText = modalPage.smallModalText.getText();
        modalPage.smallModalText.shouldHave(Condition.exactText(smallText));
        modalPage.closeSmallModal.click();
    }
    @Test
    public void largeModalTest(){
        modalPage.largeModal.click();
        String largeText = modalPage.largeModalText.getText();
        modalPage.largeModalText.shouldHave(Condition.exactText(largeText));
        modalPage.closeLargeModal.click();
    }git
}
