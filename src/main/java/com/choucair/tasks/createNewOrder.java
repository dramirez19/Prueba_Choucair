package com.choucair.tasks;

import com.choucair.models.newOrder;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.Map;

import static com.choucair.userinterfaces.newMeetingPage.*;
import static com.choucair.userinterfaces.newOrderPage.*;

public class createNewOrder implements Task {

    private DataTable infoOrderDetails;
    private Map<String, String> informacion;
    private newOrder neworder;

    public createNewOrder(DataTable infoOrderDetails) {
        this.infoOrderDetails = infoOrderDetails;
        informacion = this.infoOrderDetails.asMap(String.class, String.class);
        neworder = new newOrder(informacion.get("quantity"), informacion.get("discount")
        );
    }

    @Override
    public <T extends Actor > void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(NORTHWIND_DROPDOWN),
                    Click.on(ORDERS_OPTION),
                    Click.on(NUEVO_ORDER),
                    Click.on(CUSTOMER_DROPDOWN),
                    Switch.toActiveElement().then(Click.on(CUSTOMER_OPTION)),
                    Click.on(ORDER_DATE).then(Click.on(NEXT_MONTH_ORDER)), Click.on(SELECT_ORDER_DATE),
                    Click.on(REQUIRED_DATE).then(Click.on(NEXT_MONTH_REQUIRED)), Click.on(SELECT_REQUIRED_DATE),
                    Click.on(EMPLOYEE_DROPDOWN),
                    Switch.toActiveElement().then(Click.on(EMPLOYEE_OPTION)),
                    Click.on(NUEVO_ORDER_DETAIL),
                    Click.on(PRODUCT_DROPDOWN),
                    Switch.toActiveElement().then(Click.on(PRODUCT_OPTION)),
                    Enter.theValue(neworder.getQuantity()).into(QUANTITY_INPUT),
                    Enter.theValue(neworder.getDiscount()).into(DISCOUNT_INPUT),
                    Click.on(GUARDAR_BUTTON_DETAIL),
                    Click.on(GUARDAR_BUTTON_GENERAL)
                    );
        }

        public static createNewOrder with(DataTable infoOrderDetails) {

            return Tasks.instrumented(createNewOrder.class, infoOrderDetails);
        }
    }

