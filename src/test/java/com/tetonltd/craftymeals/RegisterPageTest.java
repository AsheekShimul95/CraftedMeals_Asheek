package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

@Test
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

        firstNameInput = driver.findElement(By.id(FIRST_NAME_INPUT_ID));

        lastNameInput = driver.findElement(By.id(LAST_NAME_INPUT_ID));

        emailInput = driver.findElement(By.id(EMAIL_ADDRESS_INPUT_ID));

        phoneNumberInput = driver.findElement(By.id(PHONE_NUMBER_INPUT_ID));

        organizationNameInput = driver.findElement(By.id(ORGANIZATION_NAME_INPUT_ID));

        passwordInput = driver.findElement(By.id(PASSWORD_INPUT_ID));

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
        registerButton.click();
        Assert.assertEquals(REGISTRATION_URL, driver.getCurrentUrl());

        WebElement firstNameRequired = driver.findElement(By.xpath(FIRST_NAME_REQUIRED_XPATH));
        Assert.assertEquals(firstNameRequired.getAttribute("class"), "text-danger");

        WebElement lastNameRequired = driver.findElement(By.xpath(LAST_NAME_REQUIRED_XPATH));
        Assert.assertEquals(lastNameRequired.getAttribute("class"), "text-danger");

        WebElement emailRequired = driver.findElement(By.xpath(EMAIL_REQUIRED_XPATH));
        Assert.assertEquals(emailRequired.getAttribute("class"), "text-danger");

        WebElement phoneNumber = driver.findElement(By.id(PHONE_NUMBER_INPUT_ID));
        Assert.assertEquals(phoneNumber.getAttribute("class"), "form-control ");

        WebElement organizationNameRequired = driver.findElement(By.xpath(ORGANIZATION_NAME_REQUIRED_XPATH));
        Assert.assertEquals(organizationNameRequired.getAttribute("class"), "text-danger");

        WebElement passwordRequired = driver.findElement(By.xpath(PASSWORD_REQUIRED_XPATH));
        Assert.assertEquals(passwordRequired.getAttribute("class"), "text-danger");
    }

    @Test
    public void registrationPage_Password_Invalid() {
        firstNameInput.sendKeys("Asheek");
        lastNameInput.sendKeys("Shimul");
        phoneNumberInput.sendKeys("0469891190");
        organizationNameInput.sendKeys("DU");
        passwordInput.sendKeys("345");
        emailInput.sendKeys("abc@gmail.com");
        registerButton.click();
        Assert.assertEquals(REGISTRATION_URL, driver.getCurrentUrl());
        WebElement invalidPasswordError = driver.findElement(By.xpath(REGISTRATION_PAGE_INVALID_PASSWORD_ERROR_XPATH));
        Assert.assertEquals(invalidPasswordError.getAttribute("class"), "text-danger");
    }

    @Test
    public void registrationPage_Email_Invalid() {
        firstNameInput.sendKeys("Asheek");
        lastNameInput.sendKeys("Shimul");
        phoneNumberInput.sendKeys("0469891190");
        organizationNameInput.sendKeys("DU");
        passwordInput.sendKeys("34563345");
        emailInput.sendKeys("abc");
        registerButton.click();
        Assert.assertEquals(REGISTRATION_URL, driver.getCurrentUrl());
        WebElement invalidEmailError = driver.findElement(By.xpath(REGISTRATION_PAGE_INVALID_EMAIL_ERROR_XPATH));
        Assert.assertEquals(invalidEmailError.getAttribute("class"), "text-danger");
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
        passwordInput.sendKeys("34563679");
        emailInput.sendKeys("abc1@gmail.com");
        registerButton.click();
        WebElement brandLogo = driver.findElement(By.xpath(BRAND_LOGO_XPATH));
        Assert.assertEquals(true, brandLogo.isDisplayed());
    }
}
