package com.tetonltd.craftymeals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.PublicKey;

import static com.tetonltd.craftymeals.CraftyMealsConstants.*;

public class MealPlanningPageTest extends TestBase {
    WebElement mealPlanningLink;
    WebElement mealPlanningPageHeader;
    Select clientDropdownSelect;
    WebElement generateButton;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        this.setUpLogin();
        this.loginSuccessful();

        mealPlanningLink = driver.findElement(By.xpath(MEAL_PLANNING_LINK_XPATH));
        mealPlanningLink.click();
        Thread.sleep(1000);
        mealPlanningPageHeader = driver.findElement(By.xpath(MEAL_PLANNING_PAGE_HEADER_XPATH));
    }

    @Test
    public void selectClient() {
        clientDropdownSelect = new Select(driver.findElement(By.xpath(CLIENT_EXERCISE_DROPDOWN_SELECT_XPATH)));
        clientDropdownSelect.selectByIndex(2);
        generateButton = driver.findElement(By.xpath(MEAL_PLANNING_GENERATE_BUTTON_XPATH));
        generateButton.click();
    }
}
