package airplane_carpet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class AirplaneCarpet {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://dostavka312.kg/");

        // Нажимаем на раздел "Рестораны"
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement restaurantList = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/li[contains(text(), 'Рестораны')]/..")));
        restaurantList.click();

        // Ждем загрузки всех элементов списка
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> allRestaurants = driver.findElements(By.xpath("//a/div[2]/div[1]/h3[@class = 'popular__item-name']"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//div[contains(@class , 'popular__list')]/a/div[2]/div[1]/h3[text() = 'KFC']/../..")).click();
        System.out.println("Количество ресторанов: " + allRestaurants.size());
        for (WebElement element : allRestaurants) {
            System.out.println(element.getText());

        }
        for (WebElement element : allRestaurants) {
//            driver.findElement(By.xpath("//a/div[2]/div[1]/h3[text() = '" +element.getText()+"' or contains(text(), '" +element.getText()+"')]/../..")).click();
            driver.findElement(By.xpath("//a/div[2]/div[1]/h3[normalize-space(text()) = normalize-space('" + element.getText() + "')]/../..")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            System.out.println(driver.findElement(By.className("shop-banner__title")).getText() + " Done++");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.navigate().back();
        }



        // Закрываем браузер
        driver.quit();
    }
}
