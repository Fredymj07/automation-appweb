package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrarUsuarioPage extends PageObject {

    By btnRegistrarse = By.xpath("//*[@id='registrarse']");
    By txtNombreUsuario = By.xpath("//*[@id='id_username']");
    By txtContrasenia = By.xpath("//*[@id='id_password1']");
    By txtConfirmarContrasenia = By.xpath("//*[@id='id_password2']");
    By txtNombre = By.xpath("//*[@id='id_first_name']");
    By txtApellido = By.xpath("//*[@id='id_last_name']");
    By txtEmail = By.xpath("//*[@id='id_email']");
    By btnRegistrarUsuario = By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[2]/button");

    public void presionarBotonRegistrarse() throws InterruptedException {
        find(btnRegistrarse).click();
        Thread.sleep(2500);
    }

    public void ingresarNombreDeUsuario(String nombreUsuario) throws InterruptedException {
        find(txtNombreUsuario).sendKeys(nombreUsuario);
        Thread.sleep(2000);
    }

    public void ingresarContrasenia(String contrasenia) throws InterruptedException {
        find(txtContrasenia).sendKeys(contrasenia);
        Thread.sleep(2000);
    }

    public void confirmarContrasenia(String contrasenia) throws InterruptedException {
        find(txtConfirmarContrasenia).sendKeys(contrasenia);
        Thread.sleep(2000);
    }

    public void ingresarNombre(String nombre) throws InterruptedException {
        find(txtNombre).sendKeys(nombre);
        Thread.sleep(2000);
    }

    public void ingresarApellido(String apellido) throws InterruptedException {
        find(txtApellido).sendKeys(apellido);
        Thread.sleep(2000);
    }

    public void ingresarEmail(String email) throws InterruptedException {
        find(txtEmail).sendKeys(email);
        Thread.sleep(2000);
    }

    public void presionarBotonDeRegistro() throws InterruptedException {
        find(btnRegistrarUsuario).click();
        Thread.sleep(2000);
    }
}
