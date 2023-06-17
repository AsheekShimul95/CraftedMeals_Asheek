package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

@Test
public class LoginPageTest extends TestBase {
    WebElement brandLogo;
    WebElement pageHeader;
    WebElement registerHereButton;
    WebElement forgetPasswordLink;

    @BeforeMethod
    public void setUp() {
        this.setUpLogin();

        brandLogo = driver.findElement(By.xpath(BRAND_LOGO_XPATH));
        pageHeader = driver.findElement(By.xpath(LOGIN_PAGE_HEADER_XPATH));
        registerHereButton = driver.findElement(By.xpath(REGISTER_HERE_BUTTON_XPATH));
        forgetPasswordLink = driver.findElement(By.xpath(FORGET_PASSWORD_LINK_XPATH));
    }

    @Test
    public void loadPage_Successfully_Loaded_Page_Title() {
        Assert.assertEquals(PAGE_TITLE, driver.getTitle());
    }

    @Test
    public void loadPage_LoginSuccessful() throws InterruptedException {
        this.loginSuccessful();
    }

    @Test
    public void loadPage_DoNotHaveAccount() {
        registerHereButton.click();
        Assert.assertEquals(PAGE_TITLE,driver.getTitle());
    }

    @Test
    public void loadPage_ForgotPassword() {
        forgetPasswordLink.click();
        Assert.assertEquals(FORGET_PASSWORD_URL,driver.getCurrentUrl());
    }
}
