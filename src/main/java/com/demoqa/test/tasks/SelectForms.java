package com.demoqa.test.tasks;


import com.demoqa.test.ui.HomePage;
import com.demoqa.test.ui.PracticeFormsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectForms implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.FORMS_OPTION),
                JavaScriptClick.on(HomePage.FORMS_OPTION),
                JavaScriptClick.on((PracticeFormsPage.PRACTICE_FORMS_OPTIONS))
        );

    }

    public static SelectForms option(){
        return instrumented(SelectForms.class);
    }
}
