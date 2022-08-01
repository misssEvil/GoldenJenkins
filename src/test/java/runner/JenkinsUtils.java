package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static runner.PropertyUtils.getProperties;


public class JenkinsUtils {

    public static void get(WebDriver driver) {
        driver.get(String.format("http://localhost:%s", getProperties().getProperty("default.port")));
    }

    static void login(WebDriver driver){
        get(driver);

        driver.findElement(By.name("j_username")).sendKeys(getProperties().getProperty("default.admin.username"));
        driver.findElement(By.name("j_password")).sendKeys(getProperties().getProperty("default.admin.password"));
        driver.findElement(By.name("Submit")).click();
    }

    static void logout(WebDriver driver) {
        get(driver);

        driver.findElement(By.xpath("//a[@href='/logout']")).click();
    }

}
