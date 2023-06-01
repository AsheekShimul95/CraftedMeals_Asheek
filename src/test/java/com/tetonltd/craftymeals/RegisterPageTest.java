package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

public class RegisterPageTest extends TestBase {
    WebElement firstNameInput;
    WebElement lastNameInput;
    WebElement emailInput;
    WebElement phoneNumberInput;
    WebElement organizationNameInput;
    WebElement passwordInput;
    WebElement registerButton;
    WebElement alreadyHaveAccountButton;

    @BeforeMethod
    public void setUp() {
        driver.get(REGISTRATION_URL);

        firstNameInput = driver.findElement(By.xpath(FIRST_NAME_INPUT_XPATH));

        lastNameInput = driver.findElement(By.xpath(LAST_NAME_INPUT_XPATH));

        emailInput = driver.findElement(By.xpath(EMAIL_ADDRESS_INPUT_XPATH));

        phoneNumberInput = driver.findElement(By.xpath(PHONE_NUMBER_INPUT_XPATH));

        organizationNameInput = driver.findElement(By.xpath(ORGANIZATION_NAME_INPUT_XPATH));

        passwordInput = driver.findElement(By.xpath(PASSWORD_INPUT_XPATH));

        registerButton = driver.findElement(By.xpath(REGISTER_BUTTON_XPATH));
        Assert.assertEquals(REGISTER_TEXT, registerButton.getText());

        alreadyHaveAccountButton = driver.findElement(By.xpath(ALREADY_HAVE_ACCOUNT_BUTTON_XPATH));
    }

    @Test
    public void registrationPage_Successfully_Loaded_Page_Title() {
        Assert.assertEquals(PAGE_TITLE, driver.getTitle());
    }

    @Test
    public void registrationPage_Validate_All_Required_Fields() {
        String firstNameRequired = firstNameInput.getAttribute("required");
        Assert.assertEquals(TRUE, firstNameRequired);
        String lastNameRequired = lastNameInput.getAttribute("required");
        Assert.assertEquals(TRUE, lastNameRequired);
        String emailAddressRequired = emailInput.getAttribute("required");
        Assert.assertEquals(TRUE, emailAddressRequired);
        String phoneNumberRequired = phoneNumberInput.getAttribute("required");
        Assert.assertEquals(TRUE, phoneNumberRequired);
        String organizationNameRequired = organizationNameInput.getAttribute("required");
        Assert.assertEquals(TRUE, organizationNameRequired);
        String passwordRequired = passwordInput.getAttribute("required");
        Assert.assertEquals(TRUE, passwordRequired);
    }

    @Test
    public void registrationPage_Email_Invalid() {
        firstNameInput.sendKeys("Asheek");
        lastNameInput.sendKeys("Shimul");
        phoneNumberInput.sendKeys("0469891190");
        organizationNameInput.sendKeys("DU");
        passwordInput.sendKeys("3456367");
        emailInput.sendKeys("abc");
        registerButton.click();
        Assert.assertEquals(REGISTRATION_URL, driver.getCurrentUrl());
    }

    @Test
    public void registrationPage_AlreadyHaveAnAccount() {
        alreadyHaveAccountButton.click();
        Assert.assertEquals(LOGIN_URL, driver.getCurrentUrl());
    }

    @Test
    public void registrationPage_Success() {
        firstNameInput.sendKeys("Asheek");
        lastNameInput.sendKeys("Shimul");
        phoneNumberInput.sendKeys("0469891190");
        organizationNameInput.sendKeys("DU");
        passwordInput.sendKeys("3456367");
        emailInput.sendKeys("abc1@gmail.com");
        registerButton.click();
        Assert.assertEquals(REGISTRATION_URL, driver.getCurrentUrl());
    }
}
