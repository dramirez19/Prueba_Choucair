package com.choucair.stepdefinitions;

import com.choucair.questions.validateOrder;
import com.choucair.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.choucair.userinterfaces.newOrderPage.ORDERDATE_VALIDATE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class newOrderStepDefinitions {

    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @When("Añade una nueva orden con la información")
    public void añadeUnaNuevaOrdenConLaInformación(DataTable infoOrderDetails) {
        theActorInTheSpotlight().attemptsTo(createNewOrder.with(infoOrderDetails));
    }

       @Then("Valida que se haya agregado exitosamente el ultimo registro con el la fecha de orden {string}")
    public void validaQueSeHayaAgregadoExitosamenteElUltimoRegistroConElLaFechaDeOrden(String fechaOrden) {
        theActorInTheSpotlight().should(seeThat(validateOrder.with(ORDERDATE_VALIDATE, fechaOrden), equalTo(fechaOrden)));
    }
}
