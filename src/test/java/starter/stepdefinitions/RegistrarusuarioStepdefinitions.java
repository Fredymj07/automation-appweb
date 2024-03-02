package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.steps.RegistrarUsuarioSteps;

public class RegistrarusuarioStepdefinitions {

    @Steps
    RegistrarUsuarioSteps registrarUsuarioSteps;

    @Given("el usuario presiona el boton para registrarse")
    public void presionarBotonRegistrarse() throws InterruptedException {
        registrarUsuarioSteps.presionarBotonRegistrarse();
    }

    @Then("la persona ingresa el nombre de usuario {string}")
    public void ingresarNombreDeUsuario(String nombreUsuario) throws InterruptedException {
        registrarUsuarioSteps.ingresarNombreDeUsuario(nombreUsuario);
    }

    @Then("la persona ingresa la contraseña {string}")
    public void ingresarContrasenia(String contrasenia) throws InterruptedException {
        registrarUsuarioSteps.ingresarContrasenia(contrasenia);
    }

    @Then("la persona confirma la contraseña {string}")
    public void confirmarContrasenia(String contrasenia) throws InterruptedException {
        registrarUsuarioSteps.confirmarContrasenia(contrasenia);
    }

    @Then("la persona ingresa sus nombres {string}")
    public void ingresarNombre(String nombre) throws InterruptedException {
        registrarUsuarioSteps.ingresarNombre(nombre);
    }

    @Then("la persona ingresa sus apellidos {string}")
    public void ingresarApellido(String apellido) throws InterruptedException {
        registrarUsuarioSteps.ingresarApellido(apellido);
    }

    @Then("la persona ingresa el email {string}")
    public void ingresarEmail(String email) throws InterruptedException {
        registrarUsuarioSteps.ingresarEmail(email);
    }

    @And("presiona el botón registrarme")
    public void presionarBotonDeRegistro() throws InterruptedException {
        registrarUsuarioSteps.presionarBotonDeRegistro();
    }

    @And("la persona puede ver el home de la aplicación")
    public void verHomeAplicacion() throws InterruptedException {
        Thread.sleep(5000);
    }
}
