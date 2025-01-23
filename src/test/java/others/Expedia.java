package others;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Expedia  {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.expedia.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href = '/Cruises']/span/..")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//button[@aria-label='Going to,' and contains(@class, 'uitk-field-fake-input')]")).click();
        driver.findElement(By.xpath("//button[@aria-label = 'Going to,']")).click();

    }
}