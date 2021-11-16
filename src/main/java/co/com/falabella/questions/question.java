package co.com.falabella.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.falabella.userinterface.DatosTarjetaUI.LBL_MENSAJE;

public class question implements Question<Boolean> {
    private String mensaje;

    public question(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensajeRegistro = Text.of(LBL_MENSAJE).viewedBy(actor).asString();
        if (mensaje.equals(mensajeRegistro)){
            result = true;
        }else{
            result = false;
        }
        return  result;
    }

    public static question obtenerTexto(String mensaje) {
        return  new question(mensaje);
    }
}
