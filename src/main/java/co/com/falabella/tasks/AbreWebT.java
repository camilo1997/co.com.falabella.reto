package co.com.falabella.tasks;

import co.com.falabella.userinterface.PaginaFalabellaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbreWebT implements Task {
    private PaginaFalabellaUI falabellaPagina;

    public static AbreWebT falabella(){
        return Tasks.instrumented(AbreWebT.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(falabellaPagina));
    }
}
