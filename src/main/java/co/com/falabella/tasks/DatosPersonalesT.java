package co.com.falabella.tasks;

import co.com.falabella.models.DatosPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.falabella.userinterface.DatosPersonalesUI.*;

public class DatosPersonalesT implements Task {
    private List<DatosPersonales> datosPersonales;

    public DatosPersonalesT(List<DatosPersonales> datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public static DatosPersonalesT in(List<DatosPersonales> datosPersonales) {
        return Tasks.instrumented(DatosPersonalesT.class, datosPersonales);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datosPersonales.get(0).getNombre()).into(NOMBRE),
                Enter.theValue(datosPersonales.get(0).getApellido()).into(APELLIDO),
                Enter.theValue(datosPersonales.get(0).getEmail()).into(EMAIL),
                Enter.theValue(datosPersonales.get(0).getId()).into(ID),
                Enter.theValue(datosPersonales.get(0).getCelular()).into(CELULAR),
                Click.on(BTN_TERMINOS_Y_CONDICIONES),
                Click.on(BTN_INGRESAR_ORDEN)

        );
    }

}
