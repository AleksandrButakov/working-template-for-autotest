package pages.base;

import org.openqa.selenium.WebDriver;


public class BasePage {

    WebDriver driver;
    // создадим конструктор
    public BasePage(WebDriver driver) {
        this.driver = driver;

    }
}
