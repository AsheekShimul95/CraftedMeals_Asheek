package com.tetonltd.craftymeals;

public class CraftyMealsConstants {
    public static final String BASE_URL = "https://craftymeals.tetonltd.com";

    // static means this field can be accessed without creating an object, i.e. LoginPageTest.LOGIN_URL
    // final means its a constant, can never be edited
    public static final String LOGIN_URL = CraftyMealsConstants.BASE_URL + "/login";

    public static final String REGISTRATION_URL = CraftyMealsConstants.BASE_URL + "/register";

    public static final String PAGE_TITLE = "Crafted Meals";

    public static final String INPUT_EMAIL_ID = "floatingInputCustom";

    public static final String INPUT_PASSWORD_ID = "floatingPasswordCustom";

    public static final String BUTTON_REGISTER_TEXT = "Don't have account ? Register Here";



}
