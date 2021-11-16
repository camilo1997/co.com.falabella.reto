package co.com.falabella.stepdefinitions;

import co.com.falabella.models.DatosDireccion;
import co.com.falabella.models.DatosPersonales;
import co.com.falabella.models.DatosProducto;
import co.com.falabella.models.DatosTarjeta;
import co.com.falabella.questions.question;
import co.com.falabella.tasks.*;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ComprarProductoStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) Desea ir a la pagina de falabella$")
    public void juanDeseaIrALaPaginaDeFalabella(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(AbreWebT.falabella());
    }

    @When("^Selecciona el producto ingresa a la bolsa de compras$")
    public void seleccionaElProductoIngresaALaBolsaDeCompras(List<DatosProducto> producto) {
        theActorInTheSpotlight().attemptsTo(ComprarProductosT.in(producto));
    }

    @When("^Ingresa los datos de la direccion$")
    public void ingresaLosDatosDeLaDireccion(List<DatosDireccion> direccion) {
        theActorInTheSpotlight().attemptsTo(DatosDireccionT.in(direccion));
    }

    @When("^Ingresa los datos tarjeta$")
    public void ingresaLosDatosTarjeta(List<DatosTarjeta> tarjeta) {
        theActorInTheSpotlight().attemptsTo(DatosTarjetaT.in(tarjeta));
    }

    @When("^Ingresa los datos personales$")
    public void ingresaLosDatosPersonales(List<DatosPersonales> datosPersonales) {
        theActorInTheSpotlight().attemptsTo(DatosPersonalesT.in(datosPersonales));
    }

    @Then("^Valida que el sistema muestre el siguiente texto$")
    public void validaQueElSistemaMuestreElSiguienteTexto(String mensaje) {
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(question.obtenerTexto(mensaje)));
    }
}
