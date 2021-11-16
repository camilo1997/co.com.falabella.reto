package co.com.falabella.tasks;

import co.com.falabella.models.DatosDireccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.falabella.userinterface.DatosDireccionUI.*;

public class DatosDireccionT implements Task {
    private List<DatosDireccion> datosDireccion;

    public DatosDireccionT(List<DatosDireccion> datosDireccion) {
        this.datosDireccion = datosDireccion;
    }

    public static DatosDireccionT in(List<DatosDireccion> datosDireccion) {
        return Tasks.instrumented(DatosDireccionT.class, datosDireccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(datosDireccion.get(0).getDepartamento()).from(DEPARTAMENTO),
                SelectFromOptions.byVisibleText(datosDireccion.get(0).getCiudad()).from(CIUDAD),
                SelectFromOptions.byVisibleText(datosDireccion.get(0).getBarrio()).from(BARRIO),
                Click.on(BTN_CONTINUAR),
                Enter.theValue(datosDireccion.get(0).getDireccion()).into(DIRECCION),
                Enter.theValue(datosDireccion.get(0).getTipoVivienda()).into(TIPO_VIVIENDA),
                Click.on(BTN_INGRESAR_DIRECCION),
                Click.on(BTN_CONTINUAR2)
        );
    }
}
