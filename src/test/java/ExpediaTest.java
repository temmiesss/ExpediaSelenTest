import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExpediaTest {

    @BeforeClass
    public void webDriverUploader(){

    }

    @Test(description = "expedia order highest price" )
    public void testForExpedia(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.expedia.com");
        driver.manage().deleteAllCookies();
//        Dimension dimension = new Dimension(400,200);
//        driver.manage().window().setSize(dimension);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//button[@aria-label='Where to?' and contains(@class, 'uitk-field-fake-input')]")).click();
        WebElement input = driver.findElement(By.id("destination_form_field"));
        input.sendKeys("Mexico");
    }
}
