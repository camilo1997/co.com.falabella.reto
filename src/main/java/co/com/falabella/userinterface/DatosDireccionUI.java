package co.com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DatosDireccionUI {
    public static final Target DEPARTAMENTO= Target.the("El departamento").locatedBy("//*[@id='region']");
    public static final Target CIUDAD= Target.the("La ciudad").locatedBy("//*[@id='ciudad']");
    public static final Target BARRIO= Target.the("El barrio").locatedBy("//*[@id='comuna']");
    public static final Target BTN_CONTINUAR= Target.the("El boton continuar").locatedBy("//*[@name='field04']");
    public static final Target DIRECCION= Target.the("La direccion").locatedBy("//*[@id='address']");
    public static final Target TIPO_VIVIENDA= Target.the("El tipo de vivienda").locatedBy("//*[@id='departmentNumber']");
    public static final Target BTN_INGRESAR_DIRECCION= Target.the("El boton ingresar dreccion").locatedBy("//*[@name='useAddress']");
    public static final Target BTN_CONTINUAR2= Target.the("El boton continuar").locatedBy("//button[contains(text(),'Continuar')]");
}
