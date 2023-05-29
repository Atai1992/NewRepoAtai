package search;


import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseUiTest;
import static com.codeborne.selenide.Selenide.sleep;

public class RadioButtonTest extends BaseUiTest {
    @Test(priority = 1)
    public void testYesRadioButton(){
        navigate.toRadioButtonPage();
        radioButtonPage.yesButton.click();
        sleep(3000);
        radioButtonPage.textYes.shouldBe(Condition.text("Yes"));

    }
    @Test(priority = 2)
    public void testImpressiveRadioButton(){
        radioButtonPage.impressiveButton.click();
        radioButtonPage.textImpressive.shouldBe(Condition.text("Impressive"));
    }
    @Test(priority = 3)
    public void testNoRadioButton(){
        radioButtonPage.noButton.click();
        radioButtonPage.noButton.shouldNotBe(Condition.selected);
    }
}
