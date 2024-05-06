package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginDeUsuarioPage extends PageObject {

    By txtUsuario = By.xpath("//*[@id='formBasicEmail']");
    By txtContrasenia = By.xpath("//*[@id='formBasicPassword']");
    By btnIniciarSesion = By.xpath("//*[@id='root']/div/div/form/a");

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
