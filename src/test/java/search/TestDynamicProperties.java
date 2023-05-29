package search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import ui.BaseUiTest;

public class TestDynamicProperties extends BaseUiTest {
    @Test(priority = 1)
    public void colorChangeTest(){
        navigate.toDynamicPropertiesPage();
        String before=dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        Selenide.sleep(6000);
        dynamicPropertiesPage.colorChangeButton.shouldBe(Condition.interactable);
        String after=dynamicPropertiesPage.colorChangeButton.getCssValue("color");
        dynamicPropertiesPage.colorChangeButton.shouldNotBe(Condition.cssValue(before,after));
        System.out.println(before);
        System.out.println(after);


    }
    @Test(priority = 2)
    public void enableAfterButtonTest(){

        dynamicPropertiesPage.enableAfter()
                .enableAfterButton.shouldBe(Condition.enabled);

    }

    @Test(priority = 3)
    public void visibleAfterButton(){
        dynamicPropertiesPage.visibleAfter()
                .visibleAfterButton.shouldBe(Condition.visible);

    }
}
