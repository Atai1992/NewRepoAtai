package search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.BaseUiTest;
import static com.codeborne.selenide.Selenide.*;



public class BrowserWindowsTest extends BaseUiTest {
    @BeforeClass
    public void navigation(){
        navigate.toBrowserWindowsPage();
    }

    @Test
    public void newTabTest(){

        browserWindowsPage.newTabButton.click();
        Selenide.switchTo().window(1);
        browserWindowsPage.newTabHeading.shouldBe(Condition.visible);

    }
    @Test
    public void newWindowTest(){
        browserWindowsPage.newWindowButton.click();
        Selenide.switchTo().window(1);
        browserWindowsPage.newTabHeading.shouldHave(Condition.textCaseSensitive("This is a sample page"));

    }
    @Test
    public void newMessageTest()  {
        browserWindowsPage.newWindowMessageButton.click();
        switchTo().window(1);
        System.out.println($x("//body").getText());
        browserWindowsPage.newWindowMessageButton.shouldHave(Condition.exactText("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization."));
    }
    }

