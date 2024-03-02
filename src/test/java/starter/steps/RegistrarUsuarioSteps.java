package starter.steps;

import net.serenitybdd.annotations.Step;
import starter.navigation.RegistrarUsuarioPage;

public class RegistrarUsuarioSteps {

    RegistrarUsuarioPage registrarUsuarioPage = new RegistrarUsuarioPage();

    @Step
    public void presionarBotonRegistrarse() throws InterruptedException {
        registrarUsuarioPage.presionarBotonRegistrarse();
    }

    @Step
    public void ingresarNombreDeUsuario(String nombreUsuario) throws InterruptedException {
        registrarUsuarioPage.ingresarNombreDeUsuario(nombreUsuario);
    }

    @Step
    public void ingresarContrasenia(String contrasenia) throws InterruptedException {
        registrarUsuarioPage.ingresarContrasenia(contrasenia);
    }

    @Step
    public void confirmarContrasenia(String contrasenia) throws InterruptedException {
        registrarUsuarioPage.confirmarContrasenia(contrasenia);
    }

    @Step
    public void ingresarNombre(String nombre) throws InterruptedException {
        registrarUsuarioPage.ingresarNombre(nombre);
    }

    @Step
    public void ingresarApellido(String apellido) throws InterruptedException {
        registrarUsuarioPage.ingresarApellido(apellido);
    }

    @Step
    public void ingresarEmail(String email) throws InterruptedException {
        registrarUsuarioPage.ingresarEmail(email);
    }

    @Step
    public void presionarBotonDeRegistro() throws InterruptedException {
        registrarUsuarioPage.presionarBotonDeRegistro();
    }
}
