package com.tetonltd.craftymeals;

public class CraftyMealsConstants {
    public static final String BASE_URL = "https://craftymeals.tetonltd.com";

    // static means this field can be accessed without creating an object, i.e. LoginPageTest.LOGIN_URL
    // final means its a constant, can never be edited
    public static final String LOGIN_URL = CraftyMealsConstants.BASE_URL + "/login";
    public static final String DASHBOARD_URL = CraftyMealsConstants.BASE_URL + "/";
    public static final String REGISTRATION_URL = CraftyMealsConstants.BASE_URL + "/register";
    public static final String SOCIAL_MEDIA_PAGE_URL = CraftyMealsConstants.BASE_URL + "/socialmedia-idea";

    public static final String PAGE_TITLE = "Crafted Meals";

    public static final String REGISTRATION_PAGE_SUCCESS_TO0LTIP_XPATH = "//div[contains(text(),'Registration successful, please check your mail fo')]";
    public static final String REGISTRATION_PAGE_INVALID_PASSWORD_ERROR_XPATH = "//div[contains(text(),'Password must be at least 8 characters')]";
    public static final String REGISTRATION_PAGE_INVALID_EMAIL_ERROR_XPATH = "//div[contains(text(),'Invalid email')]";

    public static final String BRAND_LOGO_XPATH = "//img[@src='/static/media/logo.0ffa1adb255fb60c8cac.png']";
    public static final String LOGIN_PAGE_HEADER_XPATH = "//h1[contains(text(), 'LOGIN')]";
    public static final String LOGIN_BUTTON_XPATH = "//button[contains(text(), 'Login')]";
    public static final String REGISTER_HERE_BUTTON_XPATH = "//button[contains(text(), 'have account')]";
    public static final String FORGET_PASSWORD_LINK_XPATH = "//a[contains(text(), 'Forget Password')]";
    public static final String SUBMIT_BUTTON_XPATH = "//button[contains(text(), 'Submit')]";
    public static final String INPUT_EMAIL_ID = "email";

    public static final String INPUT_PASSWORD_ID = "password";

    public static final String BUTTON_REGISTER_TEXT = "Don't have account ? Register Here";

    public static final String FORGET_PASSWORD_TEXT = "Forget Password";

    public static final String FORGET_PASSWORD_URL = CraftyMealsConstants.BASE_URL + "/forget-password";

    public static final String FIRST_NAME_INPUT_ID = "firstName";
    public static final String FIRST_NAME_REQUIRED_XPATH = "//div[contains(text(),'First name is required')]";
    public static final String LAST_NAME_INPUT_ID = "lastName";
    public static final String LAST_NAME_REQUIRED_XPATH = "//div[contains(text(),'Last name is required')]";

    public static final String EMAIL_ADDRESS_INPUT_ID = "email";
    public static final String EMAIL_REQUIRED_XPATH = "//div[contains(text(),'Email is required')]";
    public static final String PHONE_NUMBER_INPUT_ID = "phoneNumber";

    public static final String ORGANIZATION_NAME_INPUT_ID = "organizationName";
    public static final String ORGANIZATION_NAME_REQUIRED_XPATH = "//div[contains(text(),'Organization Name is required')]";

    public static final String PASSWORD_INPUT_ID = "password";
    public static final String PASSWORD_REQUIRED_XPATH = "//div[contains(text(),'Password is required')]";

    public static final String ALREADY_HAVE_ACCOUNT_BUTTON_XPATH = "//button[contains(text(),'Already have an Account?')]";
    public static final String SOCIAL_MEDIA_PAGE_HEADER_XPATH = "//h3[contains(text(),'Social Media Post Generator')]";
    public static final String TARGET_CUSTOMERS_INPUT_XPATH = "//label[contains(text(),'Target Customers')]/following-sibling::input";
    public static final String LOCATION_INPUT_XPATH = "//label[contains(text(),'Location')]/following-sibling::input";
    public static final String SOCIAL_MEDIA_INPUT_XPATH = "//label[contains(text(),'Social Media')]/following-sibling::input";
    public static final String GENERATE_BUTTON_XPATH = "//button[contains(text(),'Generate')]";
    public static final String MONTH_PICKER_SELECT_ID = "formMonthPicker";

    public static final String REGISTER_TEXT = "Register";

    public static final String TRUE = "true";

    public static final String REGISTER_BUTTON_XPATH = "//button[contains(text(),'Register')]";

    public static final String SOCIAL_MEDIA_POST_URL = CraftyMealsConstants.BASE_URL + "/socialmedia-idea";

    public static final String CLIENT_PAGE_URL = CraftyMealsConstants.BASE_URL + "/client?page=1";

    public static final String CLIENT_PAGE_HEADER_XPATH = "//h2[contains(text(),'Client Listing')]";





}
