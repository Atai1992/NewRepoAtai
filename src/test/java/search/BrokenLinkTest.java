package search;

import com.codeborne.selenide.*;
import org.testng.annotations.Test;
import ui.BaseUiTest;
import java.net.HttpURLConnection;
import java.net.URL;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;


public class BrokenLinkTest extends BaseUiTest {
@Test(priority = 1)
    public void testBrokenLinks() {
    Selenide.open("https://demoqa.com/broken");

        ElementsCollection links = Selenide.$$x("//a");


        for (SelenideElement link : links) {
            String url = link.getAttribute("href");
            if (url != null) {
                int statusCode = getLinkStatusCode(url);
                if (statusCode >= HttpURLConnection.HTTP_BAD_REQUEST) {
                    link.shouldBe(visible);
                    link.shouldNotHave(Condition.cssClass("active"));
                    System.out.println("Broken link found: " + url);
                }
            }
        }
    }

    private int getLinkStatusCode(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int statusCode = connection.getResponseCode();
            connection.disconnect();
            return statusCode;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

@Test(priority = 2)

    public void testBrokenImages() {
        Selenide.open("https://demoqa.com/broken"); // Replace with your web page URL


        ElementsCollection images = Selenide.$$x("//img");


        for (SelenideElement image : images) {
            if (image.getAttribute("naturalWidth").equals("0")) {

                String imageUrl = image.getAttribute("src");
                image.shouldNotHave(attribute("href", imageUrl));
                image.shouldBe(visible);
                    System.out.println("Broken image found: " + imageUrl);
                }
            }
        }


    private int getImageStatusCode(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int statusCode = connection.getResponseCode();
            connection.disconnect();
            return statusCode;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        BrokenLinkTest test = new BrokenLinkTest();
        test.testBrokenLinks();
        test.testBrokenImages();
        WebDriverRunner.closeWebDriver();
    }
}




















