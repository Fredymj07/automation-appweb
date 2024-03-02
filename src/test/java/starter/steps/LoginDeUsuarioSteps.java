package starter.steps;

import net.serenitybdd.annotations.Step;
import starter.navigation.LoginDeUsuarioPage;

public class LoginDeUsuarioSteps {

    LoginDeUsuarioPage loginDeUsuarioPage = new LoginDeUsuarioPage();

    @Step
    public void abrirAppWeb() {
        loginDeUsuarioPage.abrirAppWeb();
    }

    @Step
    public void ingresarUsuarioRegistrado(String nombreUsuario) throws InterruptedException {
        loginDeUsuarioPage.ingresarUsuarioRegistrado(nombreUsuario);
    }

    @Step
    public void ingresarContraseniaRegistrada(String contrasenia) throws InterruptedException {
        loginDeUsuarioPage.ingresarContraseniaRegistrada(contrasenia);
    }

    @Step
    public void hacerClicBotonDeInicioDeSesion() throws InterruptedException {
        loginDeUsuarioPage.hacerClicBotonDeInicioDeSesion();
    }
}
