package com.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class validateText implements Question<String> {

    private String texto;
    private Target target;

    public validateText(String texto, Target target) {
        this.texto = texto;
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(target.of(texto)).viewedBy(actor).asString();
    }

    public static validateText with(Target target, String texto){

        return new validateText(texto,target);
    }
}
