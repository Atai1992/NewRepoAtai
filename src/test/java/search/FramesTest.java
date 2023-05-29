package search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import java.util.List;

import static com.codeborne.selenide.Selenide.sleep;

public class FramesTest extends BaseUiTest {
    @BeforeClass
    public void frameTesting(){
        navigate.toFramePage();
    }
    @Test
    public void firstFrameTest() {
        Selenide.switchTo().frame(1);
        System.out.println(framesPage.frameOne.getText());
        sleep(2000);
        framesPage.frameOne.shouldHave(Condition.exactText("This is a sample page"));
        Selenide.switchTo().defaultContent();
    }


        @Test
    public void secondFrameTest(){
            Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
            Selenide.switchTo().frame(framesPage.frameTwo);
            System.out.println(framesPage.frameTwo.getText());
            sleep(2000);
            framesPage.frameTwo.shouldHave(Condition.exactText("This is a sample page"));
        }



    }

