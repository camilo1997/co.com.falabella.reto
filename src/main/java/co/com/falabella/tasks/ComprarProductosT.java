package co.com.falabella.tasks;

import co.com.falabella.models.DatosProducto;
import co.com.falabella.userinterface.ComprarProductosUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Keys;

import java.util.List;

public class ComprarProductosT implements Task {
    private List<DatosProducto> nombreProducto;

    public ComprarProductosT(List<DatosProducto> nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    public static  ComprarProductosT in(List<DatosProducto> nombreProducto){
        return Tasks.instrumented(ComprarProductosT.class, nombreProducto);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(ComprarProductosUI.AVISO),
                Enter.theValue(nombreProducto.get(0).getProducto()).into(ComprarProductosUI.INPUT_PRODUCTO).thenHit(Keys.ENTER),
                Click.on(ComprarProductosUI.PUBLICIDAD),
                MoveMouse.to(ComprarProductosUI.PANEL_PRODUCTO),
                Click.on(ComprarProductosUI.BTN_ADD_TO_BAG),
                Click.on(ComprarProductosUI.BTN_GO_TO_BAG),
                Click.on(ComprarProductosUI.BTN_IR_A_COMPRAR)
        );
    }
}
