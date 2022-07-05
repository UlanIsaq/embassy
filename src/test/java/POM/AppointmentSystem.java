package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AppointmentSystem {
    WebDriver driver;
    public AppointmentSystem() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//*[@id=\"CaptchaCode\"]")
    public WebElement captchaSendBox;

    public void setCaptchaSendBox(String captcha){
        captchaSendBox.sendKeys(captcha);
    }
}
