package com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class newMeetingPage extends PageObject {

    public static final Target MEETING_DROPDOWN = Target.the("Menú desplegable Meeting")
            .locatedBy("(//span[contains(text(),'Meeting')])[1]");

    public static final Target MEETINGS_BUTTON = Target.the("Botón de Meetings")
            .locatedBy("//span[contains(text(),'Meetings')]");

    public static final Target NUEVO_MEETING = Target.the("Botón de Nuevo Meeting")
            .locatedBy("(//*[@class='button-inner'])[1]");

    public static final Target MEETING_NAME = Target.the("Campo para ingresar Meeting Name")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingName']");

    public static final Target MEETING_TYPE_DROPDOWN = Target.the("Menú desplegable para escoger el Meeting Type")
            .locatedBy("//*[@id='select2-chosen-6']");

    public static final Target MEETING_TYPE_OPTION = Target.the("Boton para escoger la opcion del Meeting Type")
            .locatedBy("(//*[@class='select2-result-label'])[6]");

    public static final Target MEETING_NUMBER = Target.the("Campo para ingresar número de meeting")
            .locatedBy("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber']");

    public static final Target START_DATE = Target.the("Campo para ingresar fecha de inicio")
            .locatedBy("(//*[@class='fa fa-calendar'])[1]");

    public static final Target SELECT_START_DATE = Target.the("Campo para ingresar fecha de inicio")
            .locatedBy("//*[@id='ui-datepicker-div']//a[contains(text(),'28')]");

    public static final Target START_BTN_TIME = Target.the("Menú desplegable de horas para inicio")
            .locatedBy("(//*[@class='editor s-DateTimeEditor time'])[1]");

    public static final Target SELECT_START_TIME = Target.the("Opciones de horas para inicio")
            .locatedBy("(//*[@class='editor s-DateTimeEditor time']//option[contains(text(),'10:00')])[1]");

    public static final Target END_DATE = Target.the("Campo para ingresar fecha de fin")
            .locatedBy("(//*[@class='fa fa-calendar'])[2]");

    public static final Target SELECT_END_DATE = Target.the("Campo para ingresar fecha de fin")
            .locatedBy("//*[@id='ui-datepicker-div']//a[contains(text(),'28')]");

    public static final Target END_BTN_TIME = Target.the("Menú desplegable de horas para fin")
            .locatedBy("(//*[@class='editor s-DateTimeEditor time'])[2]");

    public static final Target SELECT_END_TIME = Target.the("Opciones de horas para fin")
            .locatedBy("(//*[@class='editor s-DateTimeEditor time']//option[contains(text(),'10:30')])[2]");

    public static final Target LOCATION_DROPDOWN = Target.the("Menú desplegable Location")
            .locatedBy("//*[@id='select2-chosen-7']");

    public static final Target LOCATION_OPTIONS = Target.the("Opciones de Location")
            .locatedBy("(//*[@class='select2-result-label'])[3]");

    public static final Target UNIT_DROPDOWN = Target.the("Menú desplegable Unit")
            .locatedBy("//*[@id='select2-chosen-8']");

    public static final Target UNIT_OPTIONS = Target.the("Opciones de Unit")
            .locatedBy("(//*[@class='select2-result-label'])[4]");

    public static final Target ORGANIZED_DROPDOWN = Target.the("Menú desplegable OrganizedBy")
            .locatedBy("//*[@id='select2-chosen-9']");

    public static final Target ORGANIZED_OPTIONS = Target.the("Opciones de OrganizedBy")
            .locatedBy("(//*[@class='select2-result-label'])[20]");

    public static final Target REPORTER_DROPDOWN = Target.the("Menú desplegable Reporter")
            .locatedBy("//*[@id='select2-chosen-10']");

    public static final Target REPORTER_OPTIONS = Target.the("Opciones de Reporter")
            .locatedBy("(//*[@class='select2-result-label'])[12]");

    public static final Target ATTENDEE_DROPDOWN = Target.the("Menú desplegable Attendee")
            .locatedBy("//*[@id='select2-chosen-12']");

    public static final Target ATTENDEE_OPTIONS = Target.the("Opciones de Attendee")
            .locatedBy("(//*[@class='select2-result-label'])[6]");

    public static final Target GUARDAR_BUTTON = Target.the("Opciones de Attendee")
            .locatedBy("(//*[@class='button-inner'])[4]");

    public static final Target MEETINGNAME_VALIDATE = Target.the("Opciones de Attendee")
            .locatedBy("//*[contains(text(), '{0}')]");
}
