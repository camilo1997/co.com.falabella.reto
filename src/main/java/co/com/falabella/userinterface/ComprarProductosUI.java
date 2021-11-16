package co.com.falabella.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ComprarProductosUI {

    public static final Target AVISO= Target.the("El aviso").locatedBy("//*[@id='acc-alert-close']");
    public static final Target PUBLICIDAD= Target.the("La publicidad").locatedBy("/html/body/div[5]/div[2]/div/div[1]");
    public static final Target INPUT_PRODUCTO= Target.the("El campo del producto").locatedBy("//*[@id='testId-SearchBar-Input']");
    public static final Target PANEL_PRODUCTO= Target.the("Seleccionar producto").locatedBy("//*[@id='testId-searchResults-products']/div[19]");
    public static final Target BTN_ADD_TO_BAG= Target.the("Adiccionar producto a la bolsa de compras").locatedBy("//button[@id='testId-Pod-action-15876216']");
    public static final Target BTN_GO_TO_BAG= Target.the("Ir a la bolsa de compras").locatedBy("//*[@id='linkButton']");
    public static final Target BTN_IR_A_COMPRAR= Target.the("Ir a pagar").locatedBy("//*[@class='fb-order-status__cta']");
}
