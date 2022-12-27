package com.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class validateOrder implements Question<String> {
    private String fechaOrden;
    private Target target;

    public validateOrder(String fechaOrden, Target target) {
        this.fechaOrden = fechaOrden;
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(target.of(fechaOrden)).viewedBy(actor).asString();
    }

    public static validateOrder with(Target target, String fechaOrden){

        return new validateOrder(fechaOrden,target);
    }
}
