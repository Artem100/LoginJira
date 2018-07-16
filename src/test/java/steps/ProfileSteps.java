package steps;

import org.openqa.selenium.WebDriver;
import pages.ProfilePage;

public class ProfileSteps {

    public WebDriver driver;

    public ProfilePage profilePage;

    public ProfileSteps(WebDriver driver){
        this.profilePage = new ProfilePage(driver);
        this.driver=driver;
    }

    public void checkLogin(){
        profilePage.nameProfile();
    }
}
