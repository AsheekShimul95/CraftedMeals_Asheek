package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

public class TestBase {
    protected WebDriver driver;

    WebElement emailInput;
    WebElement passwordInput;
    WebElement loginButton;


    @BeforeClass
    public void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    protected void setUpLogin() {
        driver.get(LOGIN_URL);
        emailInput = driver.findElement(By.id(INPUT_EMAIL_ID));
        passwordInput = driver.findElement(By.id(INPUT_PASSWORD_ID));
        loginButton = driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
    }

    @AfterClass
    public void tearDownClass() {
//        if (driver != null) {
//            driver.quit();
//        }
    }

    protected void loginSuccessful() throws InterruptedException {
        emailInput.sendKeys("asheekshimul@gmail.com");
        passwordInput.sendKeys("12345678");
        loginButton.click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(), DASHBOARD_URL);
    }

}
