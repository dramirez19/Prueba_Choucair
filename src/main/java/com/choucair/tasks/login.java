package com.choucair.tasks;

import com.choucair.userinterfaces.loginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class login implements Task {

    private String usuario;
    private String clave;

    public login(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(loginPage.USUARIO),
                Enter.theValue(clave).into(loginPage.CLAVE),
                Click.on(loginPage.SIGN_IN)
        );
    }

    public static login with(String usuario, String clave) {

        return Tasks.instrumented(login.class, usuario, clave);
    }
}
