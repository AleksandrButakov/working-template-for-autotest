package pages.telecommunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    // прокинем сюда драйвер, который находится в BasePage
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    // создали локатор
    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");

    // необходимо создать метод для нажатия на эту кнопку. Метод назовем как наш класс чтобы можно было вызывать их в
    // дальнейшем поцепочечно

    /*
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }
    */


}
