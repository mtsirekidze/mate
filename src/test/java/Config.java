import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import io.qameta.allure.Attachment;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Config implements ITestListener {
    String BASE_URL = "https://bookstore.toolsqa.com/BookStore/v1";

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }
    @Attachment(value = "Screenshot", type = "image/png")
    public static File takeScreenshot() {
        return Screenshots.takeScreenShotAsFile();
    }

    @BeforeMethod
    public void setUp() {
//        Configuration.startMaximized = true;
        Configuration.timeout = 10000;
        open("https://demoqa.com/books");
    }
    @AfterMethod
    public void tearDown()  {
        closeWebDriver();
    }
}
