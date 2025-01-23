package others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ExpediaTest {

    @BeforeClass
    public void webDriverUploader() {

    }

    @Test(description = "expedia order highest price")
    public void testForExpedia() {
        WebDriver driver = new EdgeDriver();
//        driver.get("https://www.expedia.com");
//        driver.manage().deleteAllCookies();
//        Dimension dimension = new Dimension(400,200);
//        driver.manage().window().maximize();
//        System.out.println(driver.getTitle());
//        driver.findElement(By.linkText("Cruises")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.findElement(By.xpath("//button[@aria-label='Going to,' and contains(@class, 'uitk-field-fake-input')]")).click();
//        WebElement input = driver.findElement(By.id("destination_form_field"));
//        input.sendKeys("Mexico");
//        driver.findElement(By.xpath("//button[@aria-label='Mexico' and contains(@type, 'button')]")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.findElement(By.xpath("//section[@data-testid='popover-sheet']/div/div[3]/div/button")).click();
//        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.expedia.com/swift/cruise?siid=1207601&referrer=4a8123f7-3fb6-4fcc-a7f6-bc518ee759dd&destinations=24&startdate=&enddate=&maxduration=9&minduration=3");
        driver.manage().deleteAllCookies();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        WebElement footer = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//swift-ui/div[@class='footer-site']")));
        new Actions(driver)
                .scrollToElement(footer)
                .perform();
        List<WebElement> pricesTable = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//cruise-sailing-component[@class='loader-wrapper ng-star-inserted']")));

        System.out.println(pricesTable.size());
        List<String> prices = new ArrayList<>();
        for (WebElement price : pricesTable) {
            List<WebElement> priceElement = driver.findElements(By.xpath("//div/div/div/table/tbody/tr[@class = 'ng-star-inserted' or contains(@class,'odd ng-star-inserted')]/td[3]/span/span"));
            for (WebElement element : priceElement) {
                prices.add(element.getText());

            }
        }
        System.out.println(prices);


//        List<WebElement> priceRow = driver.findElements(By.xpath("//tr[@class = 'ng-star-inserted' or contains(@class,'odd ng-star-inserted')]/td[3]/span/span"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        List<WebElement> priceRow1 = driver.findElements(By.xpath("//tr[@class = 'ng-star-inserted' or contains(@class,'odd ng-star-inserted')]/td[3]/span/span"));
//        for (WebElement priceRows : priceRow) {
//            System.out.println(priceRows.getText());
//        }
//        for (WebElement priceRows : priceRow1) {
//            System.out.println(priceRows.getText());
//        }
        //        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        List<WebElement> price = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'card cruise-item-card')]")));
//
//        List<String> pricelist = new ArrayList<String>();
//        int i = 0;
//        for(WebElement priceElement : price){
//            List<WebElement> priceRow = priceElement.findElements(By.xpath("//tr[@class = 'ng-star-inserted' or contains(@class,'odd')]/td[3]/span/span"));
//
//            for(WebElement priceRowElement : priceRow){
//                pricelist.add(priceRowElement.getText());
//            }
//        }
//        System.out.println(pricelist);
    }
}
