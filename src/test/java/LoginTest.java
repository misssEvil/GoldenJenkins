import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import runner.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws InterruptedException {

           /* Assert.assertTrue(getDriver().findElement(By.xpath("//a[@href='/logout']")).isEnabled());
            getDriver().findElement(By.xpath("//a[@href='/logout']")).click();
*/
        SoftAssert softAsserts = new SoftAssert();


        getDriver().get("http://localhost:8080");
        Thread.sleep(100000);
        softAsserts.assertEquals(getDriver().findElement(By.xpath("//div/h1")).getText(),  "Welcome to Jenkins!");

       /* getDriver().findElement(By.name("j_username")).sendKeys("test");
        getDriver().findElement(By.name("j_password")).sendKeys("test");
        getDriver().findElement(By.name("Submit")).click();*/

   /*     softAsserts.assertTrue(getDriver().findElement(By.xpath("//a[@href='/user/test']")).isEnabled());*/
        softAsserts.assertAll();

    }

        /*@Test
        public void logoWelcomeLPTest(){
            getWait20();
            Assert.assertTrue(getDriver().findElement(By.xpath("//a[@href='/logout']")).isEnabled());
            getDriver().findElement(By.xpath("//a[@href='/logout']")).click();

            getDriver().get(String.format("http://localhost:%s", PropertyUtils.getProperties().getProperty("default.port")));
            Assert.assertEquals(getDriver().findElement(By.xpath("//div/h1")).getText(),  "Welcome to Jenkins!");
            Assert.assertTrue(getDriver().findElement(By.xpath("//div[@class='logo']")).isDisplayed());

            getDriver().findElement(By.name("j_username")).sendKeys("test");
            getDriver().findElement(By.name("j_password")).sendKeys("test");
            getDriver().findElement(By.name("Submit")).click();

            Assert.assertTrue(getDriver().findElement(By.xpath("//a[@href='/user/test']")).isEnabled());
        }
*/

}
