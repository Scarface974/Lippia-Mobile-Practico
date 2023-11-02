package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
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
    @io.cucumber.java.en.Given("La app cargo correctamente")
    @io.cucumber.java.en.Then("Se muestra la página de inicio")
    public void laAppCargoCorrectamente() {

        LoginService.isViewLoaded();
    }





    @io.cucumber.java.en.When("EL usuario se logea en la aplicacion con:(.*), (.*)")
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
}
