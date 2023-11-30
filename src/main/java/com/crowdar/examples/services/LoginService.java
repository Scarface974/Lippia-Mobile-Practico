package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginConstants.LOG_IN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.LOG_IN_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }


    public static void doNumberdown(){
        MobileActionManager.click(LoginConstants.HOURS_wheel);
        MobileActionManager.click(LoginConstants.HOURS_wheel);

    }

    public static void doNumberup(){
        MobileActionManager.click(LoginConstants.MINUTE_wheel);
        MobileActionManager.click(LoginConstants.MINUTE_wheel);

    }

    public static void doNumber2(){
      /*  WebElement productoEle = DriverManager.getDriverInstance().getWrappedDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector()" +
                        ".textMatches(\"" + primer + "\").instance(0))"));
        MobileActionManager.click(LoginConstants.HORA_DOWN_BUTTON_LOCATOR,primer);
        MobileActionManager.click(LoginConstants.FIRST_NUMBER,primer);
        MobileActionManager.setInput(LoginConstants.FIRST_NUMBER,primer);
        MobileActionManager.click(LoginConstants.SECOND_NUMBER,segundo);
        MobileActionManager.click(LoginConstants.SECOND_NUMBER,segundo);
        MobileActionManager.setInput(LoginConstants.SECOND_NUMBER,segundo); */

        for (int i = 0 ; i < 4; i++){
            MobileActionManager.click(LoginConstants.MINUTE_wheel);
        }
    }

    public static void ResultNumber(){
        String expectedNumberResult = "22:14:00";
        Assert.assertEquals(LoginConstants.NUMBER_RESULT, expectedNumberResult, "El valor del elemento NUMBER_RESULT no es igual al valor esperado");
    }





}
