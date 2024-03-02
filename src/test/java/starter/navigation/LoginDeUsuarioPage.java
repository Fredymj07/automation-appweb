package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginDeUsuarioPage extends PageObject {

    By txtUsuario = By.xpath("//*[@id='id_username']");
    By txtContrasenia = By.xpath("//*[@id='id_password']");
    By btnIniciarSesion = By.xpath("/html/body/div/div/div/div/div/div/div/div/form/div[4]/button");

    public void abrirAppWeb() {
        open();
    }

    public void ingresarUsuarioRegistrado(String nombreUsuario) throws InterruptedException {
        find(txtUsuario).sendKeys(nombreUsuario);
        Thread.sleep(2000);
    }

    public void ingresarContraseniaRegistrada(String contrasenia) throws InterruptedException {
        find(txtContrasenia).sendKeys(contrasenia);
        Thread.sleep(2000);
    }

    public void hacerClicBotonDeInicioDeSesion() throws InterruptedException {
        find(btnIniciarSesion).click();
        Thread.sleep(2000);
    }
}
