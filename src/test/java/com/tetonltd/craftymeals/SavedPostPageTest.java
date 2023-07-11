package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

@Test
public class SavedPostPageTest extends TestBase {
    WebElement pageHeader;
    WebElement targetCustomersInput;
    WebElement locationInput;
    WebElement socialMediaInput;
    Select monthSelect;
    WebElement generateButton;
    WebElement generateNewPostsButton;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        this.setUpLogin();
        this.loginSuccessful();

        driver.get(SAVED_POST_PAGE_URL);

        generateNewPostsButton = driver.findElement(By.xpath(GENERATE_NEW_POST_BUTTON_XPATH));
        generateNewPostsButton.click();
        Thread.sleep(2000);
    }

//    @Test
//    public void socialMediaPage_Successfully_Loaded_Page_Title() {
//        Assert.assertNotNull(pageHeader);
//    }

    @Test
    public void savedPostPage_Success() {
        targetCustomersInput.sendKeys("Asheek");
        locationInput.sendKeys("Newcastle");
        monthSelect.selectByIndex(5);
        socialMediaInput.sendKeys("Facebook");
        generateButton.click();
        //Assert.assertEquals();
    }
}
