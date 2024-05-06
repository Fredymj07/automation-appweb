package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.steps.LoginDeUsuarioSteps;

public class LoginDeUsuarioStepdefinitions {

    @Steps
    LoginDeUsuarioSteps loginDeUsuarioSteps;

    @Given("el usuario se encuentra en la pantalla de login")
    public void abrirAppWeb() {
        loginDeUsuarioSteps.abrirAppWeb();
    }

    @Then("el usuario debería visualizar la pantalla de inicio de sesión")
    public void verPantallaLogin() throws InterruptedException {
        Thread.sleep(5000);
    }

    @When("el usuario ingresa el usuario de red {string}")
    public void ingresarUsuarioRegistrado(String nombreUsuario) throws InterruptedException {
        loginDeUsuarioSteps.ingresarUsuarioRegistrado(nombreUsuario);
    }

    @Then("el usuario ingresa la contraseña {string}")
    public void ingresarContraseniaRegistrada(String contrasenia) throws InterruptedException {
        loginDeUsuarioSteps.ingresarContraseniaRegistrada(contrasenia);
    }

    @Then("el usuario presiona el botón Iniciar sesión")
    public void hacerClicBotonDeInicioDeSesion() throws InterruptedException {
        loginDeUsuarioSteps.hacerClicBotonDeInicioDeSesion();
    }
}
