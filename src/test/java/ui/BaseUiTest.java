package ui;

import com.codeborne.selenide.Configuration;
import com.digital.pages.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



import static com.codeborne.selenide.Selenide.open;

public class BaseUiTest {
    public HomePage homePage= new HomePage();
    public ResultPage resultPage=new ResultPage();
    public CheckBoxPage checkBoxPage;
    public Navigate navigate;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinkandImage brokenLinkandImage;
    public UploadDownloadPage uploadDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public BrowserWindowsPage browserWindowsPage;
    public AlertsPage alertsPage;
    public FramesPage framesPage;
    public NestedFramesPage nestedFramesPage;
    public ModalPage modalPage;

    @BeforeClass
    public void setUpBrowser(){
//        EdgeOptions edgeOptions=new EdgeOptions();
//       // ChromeOptions chromeOptions=new ChromeOptions();
//        edgeOptions.addArguments("--start", "maximized");
//        //chromeOptions.addArguments("--start", "maximized");
//        DesiredCapabilities  desiredCapabilities=new DesiredCapabilities();
//        desiredCapabilities.setCapability(EdgeOptions.CAPABILITY,edgeOptions);
       // Configuration.browserCapabilities= desiredCapabilities;
        Configuration.holdBrowserOpen=false;
        Configuration.browserSize="1920x1080";
        checkBoxPage= new CheckBoxPage();
        navigate=new Navigate();
        radioButtonPage=new RadioButtonPage();
        webTablesPage=new WebTablesPage();
        buttonsPage=new ButtonsPage();
        linksPage=new LinksPage();
        brokenLinkandImage=new BrokenLinkandImage();
        uploadDownloadPage=new UploadDownloadPage();
        dynamicPropertiesPage=new DynamicPropertiesPage();
        browserWindowsPage=new BrowserWindowsPage();
        alertsPage=new AlertsPage();
        framesPage=new FramesPage();
        nestedFramesPage=new NestedFramesPage();
        modalPage=new ModalPage();




    }


    @BeforeClass
    public void setUp() {
        open("https://demoqa.com/");
    }


    @AfterClass
    public void tearDown() {

    }
}
