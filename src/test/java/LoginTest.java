import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import runner.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        Assert.assertTrue(getDriver().findElement(By.id("jenkins-name-icon")).isEnabled());

    }

    @Test
    public void loginTest2(){



    }
}
