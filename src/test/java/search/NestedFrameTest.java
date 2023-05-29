package search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import static com.codeborne.selenide.Selenide.sleep;

public class NestedFrameTest extends BaseUiTest {
    @BeforeClass
    public void NestedNavigate(){
        navigate.toNestedFramesPage();


    }
    @Test
    public void NestedFrameTesting(){
        Selenide.switchTo().frame(nestedFramesPage.parentFrame);
        String str = nestedFramesPage.parentFrameText.getText();
        nestedFramesPage.parentFrameText.shouldHave(Condition.exactText("Parent frame"));
        System.out.println(str);
        Selenide.switchTo().defaultContent();


    }
    @Test
    public void TestNestedFrame(){
        Selenide.switchTo().frame(nestedFramesPage.parentFrame);
        Selenide.switchTo().frame(nestedFramesPage.childFrame);
        nestedFramesPage.childFrameText.shouldHave(Condition.exactText("Child Iframe"));
        Selenide.switchTo().defaultContent();
    }
}
