package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.IOException;

import static java.lang.Thread.sleep;

public class AddClientPageTest extends TestBase {
    WebElement clientLink;
    WebElement clientListingPageHeader;

    WebElement clientFirstNameInput;
    WebElement clientLastNameInput;
    WebElement clientEmailInput;
    WebElement clientAgeInput;
    WebElement clientWeightInput;
    WebElement clientFoodNotPreferredInput;
    WebElement clientFoodPreferredInput;
    WebElement clientAllergiesInput;
    Select clientExerciseDropDownSelect;
    WebElement clientGenderSelect;
    WebElement clientGoalSelect;
    WebElement createClientButton;
    WebElement addClientButton;
    WebElement addClientPageHeader;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        this.setUpLogin();
        this.loginSuccessful();

        clientLink = driver.findElement(By.xpath("//li[2]//a[1]"));
        clientLink.click();
        Thread.sleep(1000);
        clientListingPageHeader = driver.findElement(By.xpath("//h2[contains(text(),'Client Listing')]"));
        addClientButton = driver.findElement(By.xpath("//a[normalize-space()='Add Client']"));
        addClientButton.click();
        addClientPageHeader = driver.findElement(By.xpath("//h2[contains(text(),'Add Client')]"));

        clientFirstNameInput = driver.findElement(By.id("firstName"));
        clientLastNameInput = driver.findElement(By.id("lastName"));
        clientEmailInput = driver.findElement(By.id("email"));
        clientAgeInput= driver.findElement(By.id("age"));
        clientWeightInput= driver.findElement(By.id("weight"));
        clientFoodNotPreferredInput= driver.findElement(By.id("foodDontLike"));
        clientFoodPreferredInput= driver.findElement(By.id("preferenceFood"));
        clientAllergiesInput= driver.findElement(By.id("allergies"));
        clientExerciseDropDownSelect= new Select(driver.findElement(By.xpath("//select[@name='activity']")));
        Assert.assertEquals(clientExerciseDropDownSelect.getOptions().size(),5);
        clientGenderSelect= driver.findElement(By.id("gender-male"));
        clientGoalSelect= driver.findElement(By.id("lose-weight"));
        createClientButton = driver.findElement(By.xpath("//button[contains(text(),'CREATE CLIENT')]"));
    }
    @Test
    public void clientPage_Successfully_Loaded_Page_Title() {
        String clientPageHeading = "Crafted Meals";
        Assert.assertEquals(driver.getTitle(),clientPageHeading);
        //Assert.assertEquals(CLIENT_PAGE_HEADER_XPATH, driver.());
    }
    @Test
    public void clientAdded_Success() throws InterruptedException {
        clientFirstNameInput.sendKeys("Azmaeen");
        clientLastNameInput.sendKeys("Shimul");
        clientEmailInput.sendKeys("asheekshimul+2@gmail.com");
        clientAgeInput.sendKeys("23");
        clientWeightInput.sendKeys("90");
        clientFoodNotPreferredInput.sendKeys("Meat");
        clientFoodPreferredInput.sendKeys("Rice");
        clientAllergiesInput.sendKeys("NA");
        clientExerciseDropDownSelect.selectByIndex(3);
        clientGenderSelect.click();
        clientGoalSelect.click();
        createClientButton.click();
        Thread.sleep(1000);
        clientListingPageHeader = driver.findElement(By.xpath("//h2[contains(text(),'Client Listing')]"));
    }
}
