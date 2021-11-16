package co.com.falabella.tasks;

import co.com.falabella.models.DatosTarjeta;
import co.com.falabella.userinterface.DatosTarjetaUI;
import co.com.falabella.utils.splistGeneral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.falabella.userinterface.DatosTarjetaUI.*;

public class DatosTarjetaT implements Task {

    private List<DatosTarjeta>  datosTarjeta;

    public DatosTarjetaT(List<DatosTarjeta>  datosTarjeta) {
        this.datosTarjeta = datosTarjeta;
    }

    public static DatosTarjetaT in(List<DatosTarjeta>  datosTarjeta) {
        return  Tasks.instrumented(DatosTarjetaT.class, datosTarjeta);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TIPO_TARJETA),
                Click.on(TIPO_TARJETA),
                Enter.theValue(datosTarjeta.get(0).getNombreTitular()).into(NOMBRE_TITULAR_TARJETA),
                Enter.theValue(datosTarjeta.get(0).getNumeroTarjeta()).into(NUMERO_TARJETA),
                Enter.theValue(datosTarjeta.get(0).getCvv()).into(CVV),
                SelectFromOptions.byVisibleText(splistGeneral.generalSplit(datosTarjeta.get(0).getFechaVencer())[0]).from(MES_VENCIMIENTO),
                SelectFromOptions.byVisibleText(splistGeneral.generalSplit(datosTarjeta.get(0).getFechaVencer())[1]).from(ANNO_VENCIMIENTO),
                Click.on(BTN_USAR_TARJETA)
        );
    }
}
