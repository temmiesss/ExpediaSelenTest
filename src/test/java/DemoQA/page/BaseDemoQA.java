package DemoQA.page;

import DemoQA.driver.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseDemoQA {
    public WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = Driver.getDriver();
    }
}
