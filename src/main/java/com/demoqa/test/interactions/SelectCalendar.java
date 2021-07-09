package com.demoqa.test.interactions;

import com.demoqa.test.ui.PracticeFormsPage;
import com.demoqa.test.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class SelectCalendar implements Interaction {

    String date;

    public SelectCalendar(String date) {
        this.date=date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(Keys.CONTROL+"a").into(PracticeFormsPage.DATE_BIRTH_CALENDAR),
                Enter.keyValues(date).into(PracticeFormsPage.DATE_BIRTH_CALENDAR).thenHit(Keys.ENTER));
    }

    public static SelectCalendar birth(String date){
        return new SelectCalendar(date);
    }
}
