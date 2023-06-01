package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

public class SocialMediaPostPageTest extends TestBase {
    WebElement targetCustomersInput;
    WebElement locationInput;
    WebElement selectMonthDropDown;
    WebElement socialMediaInput;
    WebElement generateButton;

    @BeforeMethod
    public void setUp() {
        driver.get(SOCIAL_MEDIA_POST_URL);

        targetCustomersInput = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/section/div/div/div/form/div[1]/label"));

        locationInput = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/section/div/div/div/form/div[2]/label"));

        selectMonthDropDown = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/section/div/div/div/form/div[3]/label"));

        socialMediaInput = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/section/div/div/div/form/div[4]/label"));

        generateButton = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/section/div/div/div/form/div[5]/button"));
    }
    @Test
    public void socialMediaPage_Successfully_Loaded_Page_Title() {
        Assert.assertEquals(PAGE_TITLE, driver.getTitle());
    }
}
