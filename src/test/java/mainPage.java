import POM.NavigateBar;
import POM.TourismVisa;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class mainPage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = Driver.getDriver();
        driver.get("https://uz.usembassy.gov/visas/non-immigrant-visas/nonimmigrant-visas-tourism-visit/online-appointment-system/");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        TourismVisa visa = new TourismVisa();

        visa.getAccessToAppointmentSystem();
    }
}
