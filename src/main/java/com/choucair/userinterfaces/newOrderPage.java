package com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class newOrderPage extends PageObject {

    public static final Target NORTHWIND_DROPDOWN = Target.the("Menú desplegable Northwind")
            .locatedBy("(//span[contains(text(),'Northwind')])[1]");

    public static final Target ORDERS_OPTION = Target.the("Opción Orders")
            .locatedBy("//span[contains(text(),'Orders')]");

    public static final Target NUEVO_ORDER = Target.the("Botón de Nuevo Order")
            .locatedBy("(//*[@class='button-inner'])[1]");

    public static final Target CUSTOMER_DROPDOWN = Target.the("Menú desplegable para escoger el Customer")
            .locatedBy("//*[@id='select2-chosen-8']");

    public static final Target CUSTOMER_OPTION = Target.the("Opciones para escoger Customer")
            .locatedBy("(//*[@class='select2-result-label'])[2]");

    public static final Target ORDER_DATE = Target.the("Campo para ingresar fecha de orden")
            .locatedBy("(//*[@class='fa fa-calendar'])[3]");

    public static final Target NEXT_MONTH_ORDER = Target.the("Campo para cambiar de mes")
            .locatedBy("//*[@class='ui-datepicker-next ui-corner-all']");

    public static final Target SELECT_ORDER_DATE = Target.the("Campo para ingresar fecha de orden")
            .locatedBy("//*[@id='ui-datepicker-div']//a[contains(text(),'16')]");

    public static final Target REQUIRED_DATE = Target.the("Campo para ingresar fecha requerida")
            .locatedBy("(//*[@class='fa fa-calendar'])[4]");

    public static final Target NEXT_MONTH_REQUIRED = Target.the("Campo para cambiar de mes")
            .locatedBy("//*[@class='ui-datepicker-next ui-corner-all']");

    public static final Target SELECT_REQUIRED_DATE = Target.the("Campo para ingresar fecha requerida")
            .locatedBy("//*[@id='ui-datepicker-div']//a[contains(text(),'20')]");

    public static final Target EMPLOYEE_DROPDOWN = Target.the("Menú desplegable para escoger el Employee")
            .locatedBy("//*[@id='select2-chosen-9']");

    public static final Target EMPLOYEE_OPTION = Target.the("Opciones para escoger Employee")
            .locatedBy("(//*[@class='select2-result-label'])[8]");

    public static final Target NUEVO_ORDER_DETAIL = Target.the("Botón de Nuevo Order Detail")
            .locatedBy("(//*[@class='button-inner'])[13]");

    public static final Target PRODUCT_DROPDOWN = Target.the("Menú desplegable para escoger el Producto")
            .locatedBy("(//*[@class='select2-chosen'])[10]");

    public static final Target PRODUCT_OPTION = Target.the("Opciones para escoger Employee")
            .locatedBy("(//*[@class='select2-result-label'])[3]");

    public static final Target QUANTITY_INPUT = Target.the("Campo para ingresar Quantity")
            .locatedBy("//*[@class='editor s-Serenity-IntegerEditor s-IntegerEditor integerQ required']");

    public static final Target DISCOUNT_INPUT = Target.the("Campo para ingresar Discount")
            .locatedBy("//*[@class='editor s-Serenity-DecimalEditor s-DecimalEditor decimalQ required customValidate']");

    public static final Target GUARDAR_BUTTON_DETAIL = Target.the("Botón de Guardar Detail")
            .locatedBy("(//*[@class='button-inner'])[15]");

    public static final Target GUARDAR_BUTTON_GENERAL = Target.the("Botón de Guardar general")
            .locatedBy("(//*[@class='button-inner'])[6]");

    public static final Target ORDERDATE_VALIDATE = Target.the("Opciones de Attendee")
            .locatedBy("//*[contains(text(), '{0}')]");
}
