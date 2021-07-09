package com.demoqa.test.tasks;

import com.demoqa.test.models.DataInjection;
import com.demoqa.test.questions.Validations;
import com.demoqa.test.ui.PracticeFormsPage;
import com.demoqa.test.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class ValidationForms implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.should(seeThat(Validations.in(PracticeFormsPage.SUBMIT_MESSAGE),equalToIgnoringCase(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getValidationSheet(),0,0))));

    }

    public static ValidationForms validation(){
        return instrumented(ValidationForms.class);
    }

}
