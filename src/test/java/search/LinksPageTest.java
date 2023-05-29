package search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;

public class LinksPageTest extends BaseUiTest {
    @Test(priority = 1)
    public void testLinks(){
        navigate.toLinksPage();


        linksPage.simpleLink.click();
        linksPage.simpleLink.shouldHave(href("https://demoqa.com/"));
        Selenide.switchTo().window(1);
        linksPage.homeBanner.shouldBe(Condition.appear);
        Selenide.switchTo().window(0);

    }
    @Test(priority = 2)
    public void testDynamic(){

        String currentUrl = linksPage.dynamicLink.text();
        Selenide.refresh();
        String newUrl = linksPage.dynamicLink.text();
        Assert.assertNotEquals(currentUrl,newUrl);

    }
}
