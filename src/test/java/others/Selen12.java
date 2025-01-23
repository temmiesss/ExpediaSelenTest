package others;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selen12 {
    public static void main(String[] args) {
        // Укажите путь к OperaDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\temmieSS\\Downloads\\operadriver_win64\\operadriver.exe");

        // Укажите путь к исполняемому файлу Opera
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\temmieSS\\Desktop\\opera.exe");

        // Создаем WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Открываем сайт
            driver.get("https://example.com");

            // Печатаем заголовок страницы
            System.out.println("Title: " + driver.getTitle());
        } finally {
            // Закрываем браузер
            driver.quit();
        }
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.get("https://www.selenium.dev/documentation/webdriver/actions_api/wheel/");
//        WebElement footer = driver.findElement(By.xpath("//footer"));
//        new Actions(driver)
//                .scrollToElement(footer)
//                .perform();
    }
}
