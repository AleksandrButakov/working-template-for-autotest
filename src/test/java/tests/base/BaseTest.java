package tests.base;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.car_loans.CarLoansPage;

// здесь будет происходить инициализация драйвера
public class BaseTest {

    // в BaseTest мы создадим драйвер через CommonActions.createDriver(), проинициализируем его и прокинем в
    // конструктор страницы BasePage. Аналогичным образом будем прокидывать его в конструкторы всех остальных страниц
    protected WebDriver driver = CommonActions.createDriver();
    // внутрь данного объекта страницы мы будем прокидывать драйвер
    protected BasePage basePage = new BasePage(driver);
    protected CarLoansPage carLoansPage = new CarLoansPage(driver);


}