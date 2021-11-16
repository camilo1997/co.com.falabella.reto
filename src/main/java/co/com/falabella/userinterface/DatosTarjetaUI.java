package co.com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DatosTarjetaUI {
    public static final Target TIPO_TARJETA= Target.the("El tipo de tarjeta").locatedBy("//*[@id='fbra_checkoutPaymentOptions']/div/div/div[1]/div[3]");
    public static final Target NOMBRE_TITULAR_TARJETA= Target.the("Nombre titular de la tarjeta").locatedBy("//*[@id='nameOnCard']");
    public static final Target NUMERO_TARJETA= Target.the("Numero de tarjeta").locatedBy("//*[@id='cardNumber']");
    public static final Target CVV= Target.the("CVV").locatedBy("//*[@id='cardCvv']");
    public static final Target MES_VENCIMIENTO= Target.the("Mes vencimiento").locatedBy("//*[@id='expirationMonth']");
    public static final Target ANNO_VENCIMIENTO= Target.the("Anno vencimiento").locatedBy("//*[@id='expirationYear']");
    public static final Target BTN_USAR_TARJETA= Target.the("Boton usar tarjeta").locatedBy("//*[@class='fbra_button fbra_test_button fbra_formItem__useCardButton']");
    public static final Target LBL_MENSAJE = Target.the("mensaje").locatedBy("");
}
