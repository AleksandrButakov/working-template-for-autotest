package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

// в BasePage будут находиться методы по назначению одинаковые для всех страниц
public class BasePage {

    // Драйвер в BasePage прокидывается из BaseTest
    public WebDriver driver;

    // создадим конструктор
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    // метод перехода к определенному url
     public void goToUrl(String url) {
         driver.get(url);
     }

     // метод по работе с явными ожиданиями
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void isAuthWidgetPresented() {
         WebElement authFrame = driver.findElement(authWidget);
         waitElementIsVisible(authFrame);
    }

}
