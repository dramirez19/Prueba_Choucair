package com.choucair.tasks;

import com.choucair.models.newMeeting;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import java.util.Map;

import static com.choucair.userinterfaces.newMeetingPage.*;
import static com.choucair.userinterfaces.newOrderPage.ORDER_DATE;
import static com.choucair.userinterfaces.newOrderPage.SELECT_ORDER_DATE;

public class createNewMeeting implements Task {

    private DataTable datos;
    private Map<String, String> informacion;
    private newMeeting newmeeting;

    public createNewMeeting(DataTable datos) {
        this.datos = datos;
        informacion = this.datos.asMap(String.class, String.class);
        newmeeting = new newMeeting(informacion.get("meeting_name"), informacion.get("meeting_number")
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
               actor.attemptsTo(
                        Click.on(MEETING_DROPDOWN),
                        Click.on(MEETINGS_BUTTON),
                        Click.on(NUEVO_MEETING),
                        Enter.theValue(newmeeting.getMeetingName()).into(MEETING_NAME),
                        Click.on(MEETING_TYPE_DROPDOWN),
                        Switch.toActiveElement().then(Click.on(MEETING_TYPE_OPTION)),
                        Enter.theValue(newmeeting.getMeetingNumber()).into(MEETING_NUMBER),
                        Click.on(END_DATE).then(Click.on(NEXT_MONTH_END)), Click.on(SELECT_END_DATE),
                        Click.on(END_BTN_TIME), Click.on(SELECT_END_TIME),
                        Click.on(START_DATE).then(Click.on(NEXT_MONTH_START)), Click.on(SELECT_START_DATE),
                        Click.on(START_BTN_TIME), Click.on(SELECT_START_TIME),
                        Click.on(LOCATION_DROPDOWN),
                        Switch.toActiveElement().then(Click.on(LOCATION_OPTIONS)),
                        Click.on(UNIT_DROPDOWN),
                        Switch.toActiveElement().then(Click.on(UNIT_OPTIONS)),
                        Click.on(ORGANIZED_DROPDOWN),
                        Switch.toActiveElement().then(Click.on(ORGANIZED_OPTIONS)),
                        Click.on(REPORTER_DROPDOWN),
                        Switch.toActiveElement().then(Click.on(REPORTER_OPTIONS)),
                        Click.on(ATTENDEE_DROPDOWN),
                        Switch.toActiveElement().then(Click.on(ATTENDEE_OPTIONS)),
                        Click.on(GUARDAR_BUTTON)
        );
    }

    public static createNewMeeting with(DataTable datos) {

        return Tasks.instrumented(createNewMeeting.class, datos);
    }
}
