package starter.steps;

import net.serenitybdd.annotations.Step;
import starter.navigation.navegacionDeModulosPage;

public class NavegacionDeModulosSteps {

    navegacionDeModulosPage navegacionDeModulosPage = new navegacionDeModulosPage();

    @Step
    public void presionarTabs() throws InterruptedException {
        navegacionDeModulosPage.presionarTabs();
    }

    @Step
    public void crearActividad() throws InterruptedException {
        navegacionDeModulosPage.crearActividad();
    }

    @Step
    public void ingresarNombreActividad(String nombreActividad) throws InterruptedException {
        navegacionDeModulosPage.ingresarNombreActividad(nombreActividad);
    }

    @Step
    public void ingresarFecha(String fecha) throws InterruptedException {
        navegacionDeModulosPage.ingresarFecha(fecha);
    }

    @Step
    public void ingresarHora(String hora) throws InterruptedException {
        navegacionDeModulosPage.ingresarHora(hora);
    }

    @Step
    public void ingresarDescripcion(String descripcion) throws InterruptedException {
        navegacionDeModulosPage.ingresarDescripcion(descripcion);
    }

    @Step
    public void presionarBotonCrearActividad() throws InterruptedException {
        navegacionDeModulosPage.presionarBotonCrearActividad();
    }

    @Step
    public void crearEmpleado() throws InterruptedException {
        navegacionDeModulosPage.crearEmpleado();
    }

    @Step
    public void agregarEmpleado() throws InterruptedException {
        navegacionDeModulosPage.agregarEmpleado();
    }

    @Step
    public void ingresarDatosEmpleado() throws InterruptedException {
        navegacionDeModulosPage.ingresarDatosEmpleado();
    }
}
