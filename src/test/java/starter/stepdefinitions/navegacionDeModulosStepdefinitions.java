package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import starter.steps.NavegacionDeModulosSteps;

public class navegacionDeModulosStepdefinitions {

    @Steps
    NavegacionDeModulosSteps navegacionDeModulosSteps;

    @And("el usuario presiona cada uno de los tabs de la aplicacion")
    public void presionarTabs() throws InterruptedException {
        navegacionDeModulosSteps.presionarTabs();
    }

    @Given("el usuario presiona el tab crear actividad")
    public void crearActividad() throws InterruptedException {
        navegacionDeModulosSteps.crearActividad();
    }

    @Then("el usuario ingresa el nombre de la actividad {string}")
    public void ingresarNombreActividad(String nombreActividad) throws InterruptedException {
        navegacionDeModulosSteps.ingresarNombreActividad(nombreActividad);
    }

    @Then("el usuario ingresa la fecha {string}")
    public void ingresarFecha(String fecha) throws InterruptedException {
        navegacionDeModulosSteps.ingresarFecha(fecha);
    }

    @Then("el usuario ingresa la hora {string}")
    public void ingresarHora(String hora) throws InterruptedException {
        navegacionDeModulosSteps.ingresarHora(hora);
    }

    @Then("el usuario ingresa la descripcion de la actividad {string}")
    public void ingresarDescripcion(String descripcion) throws InterruptedException {
        navegacionDeModulosSteps.ingresarDescripcion(descripcion);
    }

    @And("el usuario presiona el botón para guardar")
    public void presionarBotonCrearActividad() throws InterruptedException {
        navegacionDeModulosSteps.presionarBotonCrearActividad();
    }

    @Given("el usuario presiona el tab empleados")
    public void crearEmpleado() throws InterruptedException {
        navegacionDeModulosSteps.crearEmpleado();
    }

    @Then("el usuario presiona el botón agregar empleado")
    public void agregarEmpleado() throws InterruptedException {
        navegacionDeModulosSteps.agregarEmpleado();
    }

    @Then("el usuario ingresa los datos del empleado")
    public void ingresarDatosEmpleado() throws InterruptedException {
        navegacionDeModulosSteps.ingresarDatosEmpleado();
    }
}
