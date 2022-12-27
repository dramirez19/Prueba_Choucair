package com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class loginPage extends PageObject {
    public static final Target USUARIO = Target.the("Login Usuario").locatedBy("//*[@id='LoginPanel0_Username']");

    public static final Target CLAVE = Target.the("Login Clave").locatedBy("//*[@id='LoginPanel0_Password']");

    public static final Target SIGN_IN = Target.the("Botón Sign In").locatedBy("//*[@id='LoginPanel0_LoginButton']");
}
