package search;



import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseUiTest;



public class TestCheckBox extends BaseUiTest {
@Test(priority = 1)
    public void checkBoxPageTest(){
    navigate.toCheckBoxPage();
        checkBoxPage.goToCheckBox()
                .checkDesktop();
        Assert.assertTrue(checkBoxPage.isDesktopSelected(), "All Selected");

    }
    @Test(priority = 2)
    public void checkBoxWorkSpacePageTest(){

    checkBoxPage.selectWorkSpace();
        Assert.assertTrue(checkBoxPage.isWorkSpaceBoxesSelected(), "All Selected");

    }
    @Test(priority = 3)
    public void checkBoxOfficePageTest(){
        checkBoxPage.selectOffice();
        Assert.assertTrue(checkBoxPage.isOfficeSelected(), "All Selected");

    }
    @Test(priority = 4)
    public void checkBoxDownloadsPageTest(){
        checkBoxPage.selectDownloads();
        Assert.assertTrue(checkBoxPage.isDownloadSelected(), "All Selected");

    }
    @Test(priority = 5)
    public void successMessageTest(){
        Assert.assertTrue(checkBoxPage.successMessage.isDisplayed());
    }


}

