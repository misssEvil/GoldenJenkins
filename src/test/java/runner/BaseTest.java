package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    protected void beforeMethod() {
        driver = BaseUtils.createDriver();
        JenkinsUtils.login(driver);
    }

    @AfterMethod
    protected void afterMethod() {
        JenkinsUtils.logout(driver);
        driver.quit();

    }

    protected WebDriver getDriver() {
        return driver;
    }




}
