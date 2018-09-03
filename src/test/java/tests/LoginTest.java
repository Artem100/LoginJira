package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.LoginSteps;
import steps.ProfileSteps;

public class LoginTest {
    public static WebDriver driver;
    public static LoginSteps loginSteps;
    public static ProfileSteps profileSteps;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        driver = new ChromeDriver();
        loginSteps = new LoginSteps(driver);
        profileSteps = new ProfileSteps(driver);
        driver.get("http://jira.hillel.it:8080/login.jsp");
    }
    @Test
    public void positiveLogin(){
        loginSteps.loginSomeUser();
        profileSteps.checkLogin();
    }

    @AfterTest
    public void quit(){
        driver.quit();
        System.out.println("Успех!");
    }
}
