package tests.Jysk;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.BaseTest;



public class Login extends BaseTest {
    @BeforeClass
    public void openLinkAndAcceptCookies(){
        pages.Common.openLink("http://www.jysk.lt");
        pages.Common.acceptAllCookies();
    }
    @Test
    public void testLoginFunctionality(){
        String expectedName = "Sveiki, erika v!";
        String actualOutcome;

        pages.Jysk.Login.clickOnLoginTab();
        pages.Jysk.Login.enterEmail("erikavaitiekunaite722@gmail.com");
        pages.Jysk.Login.enterPassword("testavimas1");
        pages.Jysk.Login.clickOnLoginButton();
        pages.Jysk.Login.waitForRefresh();
        String actualMessage = pages.Jysk.Login.readMessage();

        Assert.assertEquals(actualMessage,expectedName);
    }

    }

