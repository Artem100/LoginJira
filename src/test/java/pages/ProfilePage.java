package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public WebDriver driver;

    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(css = "[alt*='webinar5']")
    private WebElement elNameProfile;

    public void nameProfile(){
        elNameProfile.isDisplayed();
    }
}
