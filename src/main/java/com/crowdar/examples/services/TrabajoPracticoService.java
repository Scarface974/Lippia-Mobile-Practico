package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import io.appium.java_client.MobileElement;
import jdk.internal.net.http.common.Log;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.graalvm.compiler.nodes.PauseNode.pause;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class TrabajoPracticoService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON_LOCATOR);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.LOG_IN_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void clickDropDown() throws InterruptedException {
        MobileActionManager.click(LoginConstants.DESPLEGABLE_MENU_BUTTON);
        Thread.sleep(5000);
    }

    public static void clickProjectSSection() throws InterruptedException {
        MobileActionManager.click(LoginConstants.PROJECTS_SECTION);
        Thread.sleep(5000);
    }

    public static void clickAddProject() throws InterruptedException {
        MobileActionManager.click(LoginConstants.ADD_PROJECT);
        Thread.sleep(5000);
    }

    public static void doProjectName(String nombre_project)throws InterruptedException{
        MobileActionManager.click(LoginConstants.NAME_TEXBOX_PROJECT);
        MobileActionManager.setInput(LoginConstants.NAME_TEXBOX_PROJECT, nombre_project);
        Thread.sleep(5000);
    }

    public static void clickClientSection()throws InterruptedException{
        MobileActionManager.click(LoginConstants.CLIENT_SELECT);
        Thread.sleep(5000);
    }

    public static void clickAddClient()throws InterruptedException{
        MobileActionManager.click(LoginConstants.ADD_CLIENT);
        Thread.sleep(5000);
    }

    public static void doClientName(String nombre_client)throws InterruptedException{
        MobileActionManager.setInput(LoginConstants.NAME_TEXBOX_CLIENT, nombre_client);
        Thread.sleep(5000);
    }

    public static void clickAddButtonClient()throws InterruptedException{
        MobileActionManager.click(LoginConstants.ADD_BUTTON_CLIENT);
        Thread.sleep(5000);
    }

    public static void clickSaveButtonClient()throws InterruptedException{
        MobileActionManager.click(LoginConstants.SAVE_BUTTON_PROJECT);
        Thread.sleep(5000);
    }

    public static void clickSaveButtonHours()throws InterruptedException{
        MobileActionManager.click(LoginConstants.SAVE_BUTTON_HOURS);
        Thread.sleep(5000);
    }

    public static void clickTimeTrackerSSection() throws InterruptedException {
        MobileActionManager.click(LoginConstants.TIME_TRACKER_SECTION);
        Thread.sleep(5000);
    }

    public static void clickAddTimeTracker() throws InterruptedException {
        MobileActionManager.click(LoginConstants.ADD_TIME_TRACKER);
        Thread.sleep(5000);
    }

    public static void clickAddTimeHours(String primer_valor) throws InterruptedException {
        // Lógica para hacer clic hasta que el valor coincida con el parámetro 'hour'
        while (!getHoursValue().equals(primer_valor)) {
            MobileActionManager.click(LoginConstants.HOURS_wheel);
        }

        Thread.sleep(5000);
    }

    private static String getHoursValue() {
        WebElement hoursElement = MobileActionManager.getElement(LoginConstants.HOURS);
        return hoursElement.getText();  // Esto depende de cómo obtienes el texto del elemento en tu aplicación
    }

    public static void clickAddTimeMinutes(String segundo_valor) throws InterruptedException {
        // Lógica para hacer clic hasta que el valor coincida con el parámetro 'hour'
        while (!getMinutesValue().equals(segundo_valor)) {
            MobileActionManager.click(LoginConstants.MINUTE_wheel);
        }

        Thread.sleep(5000);
    }

    private static String getMinutesValue() {
        WebElement minutesElement = MobileActionManager.getElement(LoginConstants.MINUTE);
        return minutesElement.getText();  // Esto depende de cómo obtienes el texto del elemento en tu aplicación
    }

    public static void visualizarHoraRegistrada()throws InterruptedException{
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.TIME_RESULT), "La hora no es visible");
        Thread.sleep(5000);
    }

    public static void clickDateSection() throws InterruptedException {
        MobileActionManager.click(LoginConstants.DATE);

        Thread.sleep(5000);
    }

    public static void clickMonth() throws InterruptedException {
        MobileActionManager.click(LoginConstants.NEXT_MONTH);

        Thread.sleep(5000);
    }

    public static void clickDay() throws InterruptedException {
        MobileActionManager.click(LoginConstants.ADD_DAY);

        Thread.sleep(5000);
    }

    public static void saveDate() throws InterruptedException {
        MobileActionManager.click(LoginConstants.SAVE_BUTTON);

        Thread.sleep(5000);
    }

    public static void visualizarDate()throws InterruptedException{
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.DATE_RESULT), "La fecha no es visible");
        Thread.sleep(5000);
    }

    public static void doHourWheel(){
        MobileActionManager.click(LoginConstants.HOURS_wheel);
        MobileActionManager.click(LoginConstants.HOURS_wheel);

    }

    public static void doMinuteWheel(){
        MobileActionManager.click(LoginConstants.MINUTE_wheel);
        MobileActionManager.click(LoginConstants.MINUTE_wheel);

    }

    public static void clickDiscard() throws InterruptedException {
        MobileActionManager.click(LoginConstants.DISCARD_BUTTON);

        Thread.sleep(5000);
    }

    public static void clickDiscardConfirm() throws InterruptedException {
        MobileActionManager.click(LoginConstants.DISCARD_CONFIRM);

        Thread.sleep(5000);
    }

    public static void backHour() throws InterruptedException {
        MobileActionManager.click(LoginConstants.BACK_TIME);

        Thread.sleep(5000);
    }

    public static void visualizarTimeEntries()throws InterruptedException{
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.TIME_ENTRIES_SCREEN), "La seccion Time Entries no es visible");
        Thread.sleep(5000);
    }

    public static void clickDarkMode()throws InterruptedException{
        MobileActionManager.click(LoginConstants.DARK_MODE_OPTION);
        Thread.sleep(5000);
    }

    public static void clickNotification()throws InterruptedException{
        MobileActionManager.click(LoginConstants.SHOW_NOTIFICATION);
        Thread.sleep(5000);
    }

    public static void visualizarCambios()throws InterruptedException{
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.CHANGED), "Los cambios no son visible");
        Thread.sleep(5000);
    }

    public static void clickSettingSection()throws InterruptedException{
        MobileActionManager.click(LoginConstants.SETTING_SECTION);
        Thread.sleep(5000);
    }

    public static void clickLogOut()throws InterruptedException{
        MobileActionManager.click(LoginConstants.LOG_OUT_LOCATOR);
        Thread.sleep(5000);
    }

    public static void clickConfirmLogOut()throws InterruptedException{
        MobileActionManager.click(LoginConstants.CONFIRM_LOG_OUT);
        Thread.sleep(5000);
    }

    public static void visualizarScreenLogIn()throws InterruptedException{
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.LOG_IN_SCREEN), "La pantalla de Login no visible");
        Thread.sleep(5000);
    }






}
