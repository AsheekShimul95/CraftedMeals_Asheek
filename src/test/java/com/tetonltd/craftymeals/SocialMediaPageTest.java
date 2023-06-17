package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

@Test
public class SocialMediaPageTest extends TestBase {
    WebElement pageHeader;
    WebElement targetCustomersInput;
    WebElement locationInput;
    WebElement socialMediaInput;
    Select monthSelect;
    WebElement generateButton;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        this.setUpLogin();
        this.loginSuccessful();

        driver.get(SOCIAL_MEDIA_PAGE_URL);

        pageHeader = driver.findElement(By.xpath(SOCIAL_MEDIA_PAGE_HEADER_XPATH));

        targetCustomersInput = driver.findElement(By.xpath(TARGET_CUSTOMERS_INPUT_XPATH));

        locationInput = driver.findElement(By.xpath(LOCATION_INPUT_XPATH));

        socialMediaInput = driver.findElement(By.xpath(SOCIAL_MEDIA_INPUT_XPATH));

        monthSelect = new Select(driver.findElement(By.id(MONTH_PICKER_SELECT_ID)));

        Assert.assertEquals(monthSelect.getOptions().size(),13);

        generateButton = driver.findElement(By.xpath(GENERATE_BUTTON_XPATH));

    }

    @Test
    public void socialMediaPage_Successfully_Loaded_Page_Title() {
        Assert.assertNotNull(pageHeader);
    }

//    @Test
//    public void socialMediaPage_Validate_All_Required_Fields() {
//        String firstNameRequired = targetCustomersInput.getAttribute("required");
//        Assert.assertEquals(TRUE, firstNameRequired);
//        String lastNameRequired = locationInput.getAttribute("required");
//        Assert.assertEquals(TRUE, lastNameRequired);
//        String emailAddressRequired = socialMediaInput.getAttribute("required");
//        Assert.assertEquals(TRUE, emailAddressRequired);
//    }

    @Test
    public void socialMediaPage_Success() {
        targetCustomersInput.sendKeys("Asheek");
        locationInput.sendKeys("Newcastle");
        monthSelect.selectByIndex(5);
        socialMediaInput.sendKeys("Facebook");
        generateButton.click();
        //Assert.assertEquals();
    }


//    @Test
//    public void socialMediaPage_Success() {
//        targetCustomersInput.sendKeys("Asheek");
//        locationInput.sendKeys("Shimul");
//        monthSelect.sendKeys("0469891190");
//        organizationNameInput.sendKeys("DU");
//        passwordInput.sendKeys("3456367");
//        socialMediaInput.sendKeys("abc1@gmail.com");
//        registerButton.click();
//        Assert.assertEquals(REGISTRATION_URL, driver.getCurrentUrl());
//    }
}
