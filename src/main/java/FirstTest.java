import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FirstTest {



    // создали тестовый метод, import org.junit
    @Test
    public void testSearchGoogle() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        System.out.println("Start test...");
        driver.get("http://google.com");

        // явное ожидание. Создаем новый экземпляр объекта куда передаем драйвер и время ожидания
        WebDriverWait wait = new WebDriverWait(driver, 3);
        // Создание переменной типа WebElement
        WebElement someElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();


        driver.navigate().to("http://selenium.dev");
        driver.navigate().back();
        pause();
        driver.navigate().forward();
        pause();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();


        //выполнение JS кода для выполнения функций которые не предусмотрены в selenium
        // например вызвать диалоговое окно
        // JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("arguments[0].click()", searchBox);

        pause();

        driver.quit();

        System.out.println("Successful completion of the program!");
    }

    void pause() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }



}