package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class ChromeRunner {
    @BeforeMethod
    public void setup(){
        System.setProperty("selenide.browserSize","1980x1080");
        open("https://officemart.ge/");
    }
    @AfterMethod
    public void teardown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
