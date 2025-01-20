import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selen {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/wheel/");
        WebElement footer = driver.findElement(By.xpath("//footer"));
        new Actions(driver)
                .scrollToElement(footer)
                .perform();
    }
}
