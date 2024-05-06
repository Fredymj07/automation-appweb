package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class navegacionDeModulosPage extends PageObject {

    By btnCrearActividad = By.xpath("//*[@id='basic-navbar-nav']/div/a[1]");
    By btnDetalleActividad = By.xpath("//*[@id='basic-navbar-nav']/div/a[2]");
    By btnEmpleados = By.xpath("//*[@id='basic-navbar-nav']/div/a[3]");
    By btnCerrarSesion = By.xpath("//*[@id='root']/div/div/nav/div/form/div/div/a");
    By txtNombreActividad = By.xpath("//*[@id='formGridActividad']");
    By txtFecha = By.xpath("//*[@id='formGridFecha']");
    By txtHora = By.xpath("//*[@id='formGridHora']");
    By txtDescripcion = By.xpath("//*[@id='exampleFormControlTextarea1']");
    By btnGuardar = By.xpath("//*[@id='root']/div/div/div/form/button");
    By btnAgregarEmpleado = By.xpath("//*[@id='root']/div/div/div/div/a");
    By txtNombreEmpleado = By.xpath("//*[@id='formGridNombre']");
    By txtDireccion = By.xpath("//*[@id='formGridDireccion']");
    By txtCelular = By.xpath("//*[@id='formGridCelular']");
    By txtEmail = By.xpath("//*[@id='formGridEmail']");
    By txtCargo = By.xpath("//*[@id='formGridCargo']");
    By txtFechaContrato = By.xpath("//*[@id='formGridFecha']");
    By txtDepartamento = By.xpath("//*[@id='formGridDepartamento']");
    By txtSalario = By.xpath("//*[@id='formGridSalario']");

    public void presionarTabs() throws InterruptedException {
        find(btnCrearActividad).click();
        Thread.sleep(2000);
        find(btnDetalleActividad).click();
        Thread.sleep(2000);
        find(btnEmpleados).click();
        Thread.sleep(2000);
        find(btnCerrarSesion).click();
        Thread.sleep(2000);
    }

    public void crearActividad() throws InterruptedException {
        find(btnCrearActividad).click();
        Thread.sleep(2000);
    }

    public void ingresarNombreActividad(String nombreActividad) throws InterruptedException {
        find(txtNombreActividad).sendKeys(nombreActividad);
        Thread.sleep(2000);
    }

    public void ingresarFecha(String fecha) throws InterruptedException {
        find(txtFecha).sendKeys(fecha);
        Thread.sleep(2000);
    }

    public void ingresarHora(String hora) throws InterruptedException {
        find(txtHora).sendKeys(hora);
        Thread.sleep(2000);
    }

    public void ingresarDescripcion(String descripcion) throws InterruptedException {
        find(txtDescripcion).sendKeys(descripcion);
        Thread.sleep(2000);
    }

    public void presionarBotonCrearActividad() throws InterruptedException {
        find(btnGuardar).click();
        Thread.sleep(2000);
    }

    public void crearEmpleado() throws InterruptedException {
        find(btnEmpleados).click();
        Thread.sleep(2500);
    }

    public void agregarEmpleado() throws InterruptedException {
        find(btnAgregarEmpleado).click();
        Thread.sleep(2000);
    }

    public void ingresarDatosEmpleado() throws InterruptedException {
        find(txtNombreEmpleado).sendKeys("Armando Paredes");
        Thread.sleep(1000);
        find(txtDireccion).sendKeys("Avenida Boyacá # 63 - 32");
        Thread.sleep(1000);
        find(txtCelular).sendKeys("3245636787");
        Thread.sleep(1000);
        find(txtEmail).sendKeys("armando@mail.com");
        Thread.sleep(1000);
        find(txtCargo).sendKeys("Analista III");
        Thread.sleep(1000);
        find(txtFechaContrato).sendKeys("27/09/2000");
        Thread.sleep(1000);
        find(txtDepartamento).sendKeys("Tecnología");
        Thread.sleep(1000);
        find(txtSalario).sendKeys("5700000");
        Thread.sleep(1000);
    }
}
