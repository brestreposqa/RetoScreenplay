package com.demoqa.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validations implements Question<String> {

    private Target target;

    public Validations(Target target){
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    public static Validations in (Target target){
        return new Validations(target);
    }
}
