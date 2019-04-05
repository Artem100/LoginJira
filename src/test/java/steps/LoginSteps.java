package steps;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    public LoginPage loginPage;

    public WebDriver driver;

    public LoginSteps(WebDriver driver){
        this.loginPage=new LoginPage(driver);
        this.driver=driver;
    }

    public void loginSomeUser (){
        loginPage.loginField("");
        loginPage.passwordField("");
        loginPage.loginButton();
    }
}
