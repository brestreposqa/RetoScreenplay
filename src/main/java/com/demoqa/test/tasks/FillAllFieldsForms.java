package com.demoqa.test.tasks;

import com.demoqa.test.interactions.SelectCalendar;
import com.demoqa.test.models.DataInjection;
import  com.demoqa.test.ui.PracticeFormsPage;
import com.demoqa.test.utils.Excel;
import com.demoqa.test.utils.FileUpload;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.openqa.selenium.Keys;


import java.io.IOException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillAllFieldsForms implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,0)).into(PracticeFormsPage.FIRTS_NAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,1)).into(PracticeFormsPage.LAST_NAME_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,2)).into(PracticeFormsPage.EMAIL_INPUT),
                    JavaScriptClick.on(PracticeFormsPage.MALE_GENDER_RADIO),
                    Enter.keyValues(Integer.toString((int) Excel.getCellValueInt(dataInjection.getFilePath(),dataInjection.getSheetName(),0,3))).into(PracticeFormsPage.MOBILE_INPUT),
                    SelectCalendar.birth(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,4)),
                    Enter.keyValues(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,5)).into(PracticeFormsPage.SUBJECT_INPUT),
                    Hit.the(Keys.ENTER).into(PracticeFormsPage.SUBJECT_INPUT),
                    JavaScriptClick.on(PracticeFormsPage.SPORT_HOBBIE_CHECK),
                    Enter.keyValues(FileUpload.filePath(dataInjection.getFileUpload())).into(PracticeFormsPage.PICTURE_UPLOAD),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,6)).into(PracticeFormsPage.CURRENT_ADDRESS_INPUT),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,7)).into(PracticeFormsPage.STATE_INPUT).thenHit(Keys.ENTER),
                    Enter.theValue(Excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(),0,8)).into(PracticeFormsPage.CITY_INPUT).thenHit(Keys.ENTER),
                    JavaScriptClick.on(PracticeFormsPage.SUBMIT_BUTTON)
            );


    }

    public static FillAllFieldsForms successful(){
        return instrumented(FillAllFieldsForms.class);
    }
}
