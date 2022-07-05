package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TourismVisa {
    WebDriver driver;
    public TourismVisa() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/main/div/p[3]/strong/a")
    public WebElement appointmentSystem;

    public void getAccessToAppointmentSystem(){
        appointmentSystem.click();
    }
}
