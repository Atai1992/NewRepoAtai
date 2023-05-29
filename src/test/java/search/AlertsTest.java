package search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class AlertsTest extends BaseUiTest {
    @BeforeClass
    public void navigation(){
        navigate.toAlertsPage();
    }
    @Test
    public void testFirstAlert(){
        alertsPage.alertButton.click();
        sleep(2000);
        String  getText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(getText,"You clicked a button");
        Selenide.switchTo().alert().accept();


    }
    @Test
    public void testSecondAlert(){
        alertsPage.timerAlertButton.click();
        sleep(6000);
        String  getText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(getText,"This alert appeared after 5 seconds");
        Selenide.switchTo().alert().accept();

    }
    @Test
    public void alertSleep(){
        alertsPage.timerAlertButton.click();
        Selenide.sleep(7000);
        String  getText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(getText,"This alert appeared after 5 seconds");
        Selenide.switchTo().alert().accept();

    }
    @Test
    public void confirmButtonAccept(){
        alertsPage.confirmButton.click();
        Selenide.sleep(2000);
        String  getText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(getText,"Do you confirm action?");
        Selenide.switchTo().alert().accept();
        Selenide.sleep(3000);
        alertsPage.textOkCancel.shouldHave(Condition.exactText("You selected Ok"));

    }
    @Test
    public void confirmButtonDismiss(){
        alertsPage.confirmButton.click();
        Selenide.sleep(2000);
        String  getText = Selenide.switchTo().alert().getText();
        Assert.assertEquals(getText,"Do you confirm action?");
        Selenide.switchTo().alert().dismiss();
        Selenide.sleep(3000);
        alertsPage.textOkCancel.shouldHave(Condition.exactText("You selected Cancel"));

    }
    @Test
    public void promptBtnAccept(){
        alertsPage.promtButton.click();
        Selenide.sleep(2000);
        Selenide.switchTo().alert().sendKeys("Atai Bakai");
        Selenide.sleep(2000);
        Selenide.switchTo().alert().accept();
        Selenide.sleep(3000);
        alertsPage.promptText.shouldHave(Condition.exactText("You entered Atai Bakai"));
    }
    @Test
    public void promptBtnCancel(){
        alertsPage.promtButton.click();
        Selenide.sleep(2000);
        Selenide.switchTo().alert().dismiss();
        Selenide.sleep(2000);

    }

}
