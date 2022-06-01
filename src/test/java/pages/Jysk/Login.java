package pages.Jysk;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import pages.Locators;
import utilities.Driver;

import java.time.Duration;

public class Login {
    public static void waitForAdPopupToBeVisible(){
        WebElement popup = Common.getElement(Locators.Jysk.Login.buttonCloseAd);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(popup));
    }
    public static void clickOnLoginTab() {
        Common.clickElement(Locators.Jysk.Login.loginButton);

    }

    public static void enterEmail(String email) {
        Common.sendKeys(Locators.Jysk.Login.enterLoginEmail,email);

    }

    public static void enterPassword(String password) {
        Common.sendKeys(Locators.Jysk.Login.enterLoginPassword,password);
    }

    public static void clickOnLoginButton() {
        Common.clickElement(Locators.Jysk.Login.buttonToLogin);
    }

    public static void waitForRefresh() {
        WebElement login = Common.getElement(Locators.Jysk.Login.buttonToLogin);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));
        wait.until(ExpectedConditions.stalenessOf(login));
    }


    public static String readMessage() {
        return Common.getText(Locators.Jysk.Login.accountName);
    }
}
