package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLData;
import java.util.List;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

public class DashboardTest extends TestBase {

    WebElement dashBoardLink;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        this.setUpLogin();
        this.loginSuccessful();

        driver.get(DASHBOARD_URL);
    }

    @Test
    public void listComponents(){
        dashBoardLink = driver.findElement(By.xpath("//a[@class='nav-link active']"));
        dashBoardLink.click();

//        pageHeader = driver.findElement(By.xpath(SOCIAL_MEDIA_PAGE_HEADER_XPATH));
//
//        targetCustomersInput = driver.findElement(By.xpath(TARGET_CUSTOMERS_INPUT_XPATH));
//
//        locationInput = driver.findElement(By.xpath(LOCATION_INPUT_XPATH));
//
//        socialMediaInput = driver.findElement(By.xpath(SOCIAL_MEDIA_INPUT_XPATH));
//
//        monthSelect = new Select(driver.findElement(By.id(MONTH_PICKER_SELECT_ID)));
//
//        Assert.assertEquals(monthSelect.getOptions().size(),13);
//
//        generateButton = driver.findElement(By.xpath(GENERATE_BUTTON_XPATH));

    }
}
