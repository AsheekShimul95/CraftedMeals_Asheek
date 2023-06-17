package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

public class ClientPageTest extends TestBase {
    WebElement clientPageHeader;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        this.setUpLogin();
        this.loginSuccessful();

        driver.get(CLIENT_PAGE_URL);
    }
    @Test
    public void clientPage_Successfully_Loaded_Page_Title() {
        WebElement clientPageHeader = driver.findElement(By.xpath(CLIENT_PAGE_HEADER_XPATH));
        Assert.assertEquals(clientPageHeader.getAttribute("h2"), "Client Listing");
        //Assert.assertEquals(CLIENT_PAGE_HEADER_XPATH, driver.());
    }
}
