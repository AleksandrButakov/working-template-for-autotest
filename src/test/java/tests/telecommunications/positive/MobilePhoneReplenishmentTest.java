package tests.telecommunications.positive;

import org.junit.jupiter.api.Test;

import pages.telecommunications.MobilePhoneReplenishmentPage;
import tests.base.BaseTest;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePage.isAuthWidgetPresented();

    }



}