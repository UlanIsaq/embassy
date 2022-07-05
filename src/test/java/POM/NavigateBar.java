package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NavigateBar {
    WebDriver driver;
    public NavigateBar(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"menu-item-13290\"]/a/span[1]")
    public WebElement visa;

    public void clickToVisaTab() {
        visa.click();
    }
}
