package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    protected void beforeMethod(Method method) {
        driver = BaseUtils.createDriver();
        BaseUtils.logf("Run %s.%s", this.getClass().getName(), method.getName());
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
