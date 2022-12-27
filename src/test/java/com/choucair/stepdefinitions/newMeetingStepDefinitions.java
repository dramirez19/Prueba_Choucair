package com.choucair.stepdefinitions;

import com.choucair.questions.validateText;
import com.choucair.tasks.createNewMeeting;
import com.choucair.tasks.login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.choucair.userinterfaces.newMeetingPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class newMeetingStepDefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} desea ingresar a la página web {string}")
    public void deseaIngresarALaPáginaWeb(String actor, String url) {
        theActorCalled(actor).attemptsTo(Open.url(url));
    }

    @Given("Se loggea con usuario {string} y clave {string}")
    public void seLoggeaConUsuarioYClave(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(login.with(usuario, clave));
    }

    @When("Añade una reunión con la información")
    public void añadeUnaReuniónConLaInformación(DataTable informacionReunion) {
        theActorInTheSpotlight().attemptsTo(createNewMeeting.with(informacionReunion));
    }

    @Then("Valida que se haya creado correctamente la reunion bajo el nombre {string}")
    public void validaQueSeHayaCreadoCorrectamenteLaReunionBajoElNombre(String texto) {
        theActorInTheSpotlight().should(seeThat(validateText.with(MEETINGNAME_VALIDATE, texto), equalTo(texto)));
    }

}
