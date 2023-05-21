package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

public class LoginPageTest extends TestBase {
    @BeforeMethod
    public void setUp() {
        driver.get(LOGIN_URL);
    }

    @Test
    public void loadPage_Successfully_Loaded_Page_Title() {
        Assert.assertEquals(PAGE_TITLE, driver.getTitle());
    }

    @Test
    public void loadPage_Has_Username_Password_Inputs() {
        WebElement emailInput = driver.findElement(By.id(INPUT_EMAIL_ID));
        Assert.assertNotNull(emailInput);
        String emailType = emailInput.getAttribute("type");
        Assert.assertEquals("email", emailType);

        WebElement passwordInput = driver.findElement(By.id(INPUT_PASSWORD_ID));
        Assert.assertNotNull(passwordInput);
        String passwordType = passwordInput.getAttribute("type");
        Assert.assertEquals("password", passwordType);
    }

    @Test
    public void loadPage_Has_Login_Button() {
        // find a button with label "Button" and assertNotNull
    }

    @Test
    public void loadPage_Has_Register_Button_With_Label() {
        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/button[2]"));
        Assert.assertEquals(BUTTON_REGISTER_TEXT, registerButton.getText());
        registerButton.click();
        Assert.assertEquals(REGISTRATION_URL, driver.getCurrentUrl());
    }

    @Test
    public void loadPage_Has_Forget_Password_Link() {
        // find an anchor (a) link with label "Forget Password"
    }

}
