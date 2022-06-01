package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Jysk {

            public static class Login {
                public static By buttonCloseAd = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
                public static By loginButton = By.xpath("//*[@class='icon']");
                public static By enterLoginEmail = By.xpath("//*[@id='email']");
                public static By enterLoginPassword = By.xpath("//*[@id='pass']");
                public static By buttonToLogin = By.xpath("//*[@id='send2']");
                public static By accountName = By.xpath("//input[@name='form_key']");

            }
            public static class Search {
                public static By clickOnSearchField = By.xpath("//*[@id='search']");
                public static By clickSearchButton = By.xpath("//*[@class='fa fa-search']");

            }

    }};
