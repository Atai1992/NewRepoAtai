package search;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.BaseUiTest;

import java.io.File;

import static com.codeborne.selenide.Selenide.download;
import static com.codeborne.selenide.Selenide.sleep;

public class UploadDownloadTest extends BaseUiTest {

    @Test(priority = 1)
    public void DownloadTest(){
        navigate.toUpload_DownloadPage();
        uploadDownloadPage.clickDownloadButton();
        sleep(5000);
        String downloadPath="C:\\Users\\sir-1\\Downloads";
        String expectedFileName = "sampleFile.jpeg";
        File downloadedFile = new File(downloadPath + File.separator + expectedFileName);
        Assert.assertTrue(downloadedFile.exists());

    }
    @Test(priority = 2)

    public void ChooseFileTest(){
        uploadDownloadPage.uploadFileButton("C:\\Users\\sir-1\\Downloads\\team.png");
        uploadDownloadPage.uploadedFilePath.should(Condition.exist);


    }
}
