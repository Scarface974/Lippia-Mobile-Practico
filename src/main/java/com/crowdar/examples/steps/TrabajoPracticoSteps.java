package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.TrabajoPracticoService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class TrabajoPracticoSteps extends PageSteps {




/*---------------------------------------------------------Trabajo Practico N°9 / Login -----------------------------------------------------------------*/
    @io.cucumber.java.en.Given("la app cargo correctamente")
    @io.cucumber.java.en.Then("Se muestra la página de inicio")
    public void laAppCargoCorrectamente() {

        LoginService.isViewLoaded();
    }





    @io.cucumber.java.en.When("eL usuario se logea en la aplicacion con:(.*), (.*)")
    public void elUsuarioSeLogeaEnLaAplicacionConEmailPassword(String email, String password) {
        LoginService.doLogin(email, password);
    }
/*---------------------------------------------------------Trabajo Practico N°9 / Ingreso de datos---------------------------------------------------------------------*/
    @Given("La app inicio correctamente")
    public void laAppInicioCorrectamente() {
        LoginService.isViewLoaded();
    }


    @When("El usuario se logea en la aplicacion con :(.*), (.*)")
    public void elUsuarioSeLogeaEnLaAplicacionConCorreoContraseña(String correo, String contraseña) {
        LoginService.doLogin(correo, contraseña);
    }


    @And("hace click en los tres botones verticales")
    public void haceClickEnLosTresBotonesVerticales() {
        MobileActionManager.click(LoginConstants.THREE_BUTTON);
    }


    @And("hace click en Edit")
    public void haceClickEnEdit() {
        MobileActionManager.click(LoginConstants.EDIT_OPTION);
    }

  


    @And("hace click en save")
    public void haceClickEnSave() {
        MobileActionManager.click(LoginConstants.SAVE_BUTTON);
    }

    @Then("se muestra el valor ingresado")
    public void seMuestraElValorIngresado() {
    }


    @And("hace click en la primera casilla e ingresa (.*), (.*)")
    public void haceClickEnLaPrimeraCasillaEIngresaPrimerSegunda() {

    }


    @Then("se muestra el valor")
    public void seMuestraElValor() {
       LoginService.ResultNumber();
    }


    @And("hace click en el numero ubicado debajo de la primera casilla")
    public void haceClickEnElNumeroUbicadoDebajoDeLaPrimeraCasilla() {
        LoginService.doNumberdown();
    }

    @And("hace click en el numero ubicado debajo de la segunda casilla")
    public void haceClickEnElNumeroUbicadoDebajoDeLaSegundaCasilla() {
        LoginService.doNumberup();
    }

    /*-------------------------Scenario: The user adds a data entry to the app---------------------------------*/

    @And("el usuario selecciona en el menu desplegable ubicado en el margen superior izquierdo")
    public void elUsuarioHaceClickEnElMenuDesplegableUbicadoEnElMargenSuperiorIzquierdo()throws InterruptedException {
        TrabajoPracticoService.clickDropDown();
    }


    @And("el usuario selecciona la seccion Projects")
    public void elUsuarioHaceClickEnLaSeccionProjects() throws InterruptedException {
        TrabajoPracticoService.clickProjectSSection();
    }


    @And("el usuario selecciona el boton + para agregar un nuevo projecto")
    public void elUsuarioHaceClickEnElBoton() throws InterruptedException {
        TrabajoPracticoService.clickAddProject();
    }

    @And("el usuario ingresa (.*) en el cuadro de texto Project name")
    public void elUsuarioIngresaNombre_projectEnElCuadroDeTextProjectName(String nombre_project)throws InterruptedException {
        TrabajoPracticoService.doProjectName(nombre_project);
    }


    @And("el usuario ingresa a la seccion Client")
    public void elUsuarioIngresaALaSeccionClient() throws InterruptedException {
        TrabajoPracticoService.clickClientSection();
    }

    @And("el usuario selecciona el boton + para agregar un nuevo cliente")
    public void elUsuarioHaceClickEnElBotonParaAgregarUnNuevoCliente() throws InterruptedException {
        TrabajoPracticoService.clickAddClient();
    }


    @And("el usuario ingresa (.*) en el cuadro de texto Add Client")
    public void elUsuarioIngresaNombre_clientEnElCuadroDeTextoAddClient(String nombre_client)throws InterruptedException {
        TrabajoPracticoService.doClientName(nombre_client);
    }

    @And("el usuario selecciona el boton Add")
    public void elUsuarioSeleccionaElBotonAdd() throws InterruptedException {
        TrabajoPracticoService.clickAddButtonClient();
    }


    @And("el usuario selecciona el boton SAVE")
    public void elUsuarioSeleccionaElBotonSAVE() throws InterruptedException {
        TrabajoPracticoService.clickSaveButtonClient();
    }


    @And("el usuario selecciona la seccion Time tracker")
    public void elUsuarioSeleccionaLaSeccionTimeTracker() throws InterruptedException {
        TrabajoPracticoService.clickTimeTrackerSSection();
    }


    @And("el usuario selecciona el boton + para agregar una nueva hora")
    public void elUsuarioSeleccionaElBotonParaAgregarUnaNuevaHora() throws InterruptedException {
        TrabajoPracticoService.clickAddTimeTracker();
    }


    @And("el usuario ingresa (.*)  en el primer campo de hora")
    public void elUsuarioIngresaPrimer_valorEnElPrimerCampo(String primer_valor) throws InterruptedException {
        TrabajoPracticoService.clickAddTimeHours(primer_valor);
    }

    @And("el usuario ingresa (.*) en el segundo campo de minutos")
    public void elUsuarioIngresaSegundo_valorEnElSegundoCampoDeMinutos(String segundo_valor) throws InterruptedException {
        TrabajoPracticoService.clickAddTimeMinutes(segundo_valor);
    }


    @And("el usuario selecciona la fecha ubicada en el margen superior derecho")
    public void elUsuarioSeleccionaLaFechaUbicadaEnElMargenSuperiorDerecho() throws InterruptedException {
        TrabajoPracticoService.clickDateSection();
    }

    @And("el usuario selecciona el mes")
    public void elUsuarioSeleccionaElMes() throws InterruptedException {
        TrabajoPracticoService.clickMonth();
    }


    @And("el usuario selecciona el dia")
    public void elUsuarioSeleccionaElDia() throws InterruptedException {
        TrabajoPracticoService.clickDay();
    }


    @And("el usuario selecciona el boton SAVE para guardar la fecha")
    public void elUsuarioSeleccionaElBotonSAVEParaGuardarLaFecha() throws InterruptedException {
        TrabajoPracticoService.saveDate();
    }


    @Then("el usuario visualiza la fecha seleccionada")
    public void elUsuarioVisualizaLaFechaSeleccionada() throws InterruptedException {
        TrabajoPracticoService.visualizarDate();
    }


    @And("el usuario selecciona la hora")
    public void elUsuarioSeleccionaLaHora() {
        TrabajoPracticoService.doHourWheel();

    }

    @And("el usuario selecciona el minuto")
    public void elUsuarioSeleccionaElMinuto() {
        TrabajoPracticoService.doMinuteWheel();
    }

    @And("el usuario selecciona el texto DISCARD")
    public void elUsuarioSeleccionaElTextoDISCARD() throws InterruptedException {
        TrabajoPracticoService.clickDiscard();
    }

    @And("el usuario selecciona la opcion DISCARD")
    public void elUsuarioSeleccionaLaOpcionDISCARD() throws InterruptedException {
        TrabajoPracticoService.clickDiscardConfirm();
    }

    @And("el usuario selecciona la flecha ubicada en el margen superior izquierdo")
    public void elUsuarioSeleccionaLaFlechaUbicadaEnElMargenSuperiorIzquierdo() throws InterruptedException {
        TrabajoPracticoService.backHour();
    }


    @Then("el usuario visualiza la seccion Time entries")
    public void elUsuarioVisualizaLaSeccionTimeEntries() throws InterruptedException {
        TrabajoPracticoService.visualizarTimeEntries();
    }

    @And("el usuario hace click en la seccion Setting")
    public void elUsuarioHaceClickEnLaSeccionSetting() throws InterruptedException {
        TrabajoPracticoService.clickSettingSection();
    }

    @And("el usuario selecciona la opcion Enable dark mode")
    public void elUsuarioSeleccionaLaOpcionEnableDarkMode() throws InterruptedException {
        TrabajoPracticoService.clickDarkMode();
    }


    @And("el usuario selecciona la opcion Show notifications")
    public void elUsuarioSeleccionaLaOpcionShowNotifications() throws InterruptedException {
        TrabajoPracticoService.clickNotification();
    }

    @Then("el usuario visualiza los cambios realizados")
    public void elUsuarioVisualizaLosCambiosRealizados() throws InterruptedException {
        TrabajoPracticoService.visualizarCambios();
    }


    @And("el usuario hace selecciona la opcion Log out")
    public void elUsuarioHaceSeleccionaLaOpcionLogOut() throws InterruptedException {
        TrabajoPracticoService.clickLogOut();
    }

    @And("el usuario confirma la accion")
    public void elUsuarioConfirmaLaAccion() throws InterruptedException {
        TrabajoPracticoService.clickConfirmLogOut();
    }


    @Then("el usuario visualiza la pantalla de Log in")
    public void elUsuarioVisualizaLaPantallaDeLogIn() throws InterruptedException {
        TrabajoPracticoService.visualizarScreenLogIn();
    }


    @Then("el usuario visualiza la hora agregada")
    public void elUsuarioVisualizaLaHoraAgregada() throws InterruptedException {
        TrabajoPracticoService.visualizarHoraRegistrada();
    }


    @And("el usuario selecciona el boton SAVE para guardar la hora")
    public void elUsuarioSeleccionaElBotonSAVEParaGuardarLaHora() throws InterruptedException {
        TrabajoPracticoService.clickSaveButtonHours();
    }
}

