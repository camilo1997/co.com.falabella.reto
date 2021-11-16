package co.com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DatosPersonalesUI {
    public static final Target NOMBRE= Target.the("El nombre").locatedBy("//*[@id='firstName']");
    public static final Target APELLIDO= Target.the("El apellido").locatedBy("//*[@id='lastName']");
    public static final Target EMAIL= Target.the("El email").locatedBy("//*[@id='emailAddress']");
    public static final Target ID= Target.the("Numero de identidad").locatedBy("//*[@id='userIdNumber']");
    public static final Target CELULAR= Target.the("El numero celular").locatedBy("//*[@id='phoneNumber']");
    public static final Target  BTN_TERMINOS_Y_CONDICIONES= Target.the("Aceptar términos y condiciones").locatedBy("//*[@id='fbra_checkoutConfirmYourOrder']/div/div/div/div/section/div[1]/div/div/div/div/label/span/span/span[1]");
    public static final Target BTN_INGRESAR_ORDEN= Target.the("El boton ingresar orden").locatedBy("//*[@class='fbra_button fbra_test_button fbra_continueButton__button fbra_test_continueButton__button']");
}
