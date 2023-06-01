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

    public static final String FORGET_PASSWORD_TEXT = "Forget Password";

    public static final String FORGET_PASSWORD_URL = CraftyMealsConstants.BASE_URL + "/forget-password";

    public static final String FIRST_NAME_INPUT_XPATH = "//label[contains(text(),'First Name')]/preceding-sibling::input";

    public static final String LAST_NAME_INPUT_XPATH = "//label[contains(text(),'Last Name')]/preceding-sibling::input";

    public static final String EMAIL_ADDRESS_INPUT_XPATH = "//label[contains(text(),'Email Address')]/preceding-sibling::input";

    public static final String PHONE_NUMBER_INPUT_XPATH = "//label[contains(text(),'Phone Number')]/preceding-sibling::input";

    public static final String ORGANIZATION_NAME_INPUT_XPATH = "//label[contains(text(),'Organization Name')]/preceding-sibling::input";

    public static final String PASSWORD_INPUT_XPATH = "//label[contains(text(),'Password')]/preceding-sibling::input";

    public static final String ALREADY_HAVE_ACCOUNT_BUTTON_XPATH = "//button[contains(text(),'Already have an Account?')]";

    public static final String REGISTER_TEXT = "Register";

    public static final String TRUE = "true";

    public static final String REGISTER_BUTTON_XPATH = "//button[contains(text(),'Register')]";

    public static final String SOCIAL_MEDIA_POST_URL = CraftyMealsConstants.BASE_URL + "/socialmedia-idea";

    public static final String TARGET_CUSTOMER_INPUT = "form-label";

    public static final String LOCATION_INPUT = "form-label";

    public static final String SELECT_MONTH_DROPDOWN = "formMonthPicker";

    public static final String SOCIAL_MEDIA_INPUT = "form-label";



}
