package search;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import com.digital.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.BaseUiTest;
import static com.codeborne.selenide.Selenide.sleep;


@Listeners ({SoftAsserts.class, ScreenShooter.class})
public class TestTextBox extends BaseUiTest {
    HomePage homePage=new HomePage();

    @Test

    public void firstTest() throws InterruptedException {
        navigate.goToTextBoxPage();
        homePage.inputFullName("Collin Smith")
                .inputEmail("smith@agent.com");
        sleep(1000);
                homePage.inputCurAddress("Hollywood 42 ave 5 apt")
                .inputPermAddress("Chicago IL");
                homePage.pressSubmitBtn();

        homePage.output.shouldBe(Condition.text( "Name:Collin Smith\n" +

                "Email:smith@agent.com\n" +

                "Current Address :Hollywood 42 ave 5 apt\n" +

                "Permananet Address :Chicago IL"));




    }

}
