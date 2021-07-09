package com.demoqa.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormsPage {
    public static final Target PRACTICE_FORMS_OPTIONS = Target.the("").locatedBy("//span[contains(text(),'Practice Form')]");
    public static final Target FIRTS_NAME_INPUT = Target.the("").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("").located(By.id("userEmail"));
    public static final Target MALE_GENDER_RADIO = Target.the("").locatedBy("//label[contains(text(),'Male')]");
    public static final Target FEMALE_GENDER_RADIO = Target.the("").locatedBy("//label[contains(text(),'Female')]");
    public static final Target OTHER_GENDER_RADIO = Target.the("").locatedBy("//label[contains(text(),'Other')]");
    public static final Target MOBILE_INPUT = Target.the("").located(By.id("userNumber"));
    public static final Target DATE_BIRTH_CALENDAR= Target.the("").located(By.id("dateOfBirthInput"));
    public static final Target SUBJECT_INPUT = Target.the("").located(By.id("subjectsInput"));
    public static final Target SPORT_HOBBIE_CHECK = Target.the("").locatedBy("//label[contains(text(),'Sport')]");
    public static final Target READING_HOBBIE_CHECK  = Target.the("").locatedBy("//label[contains(text(),'Reading')]");
    public static final Target MUSIC_HOBBIE_CHECK  = Target.the("").locatedBy("//label[contains(text(),'Music')]");
    public static final Target PICTURE_UPLOAD = Target.the("").located(By.id("uploadPicture"));
    public static final Target CURRENT_ADDRESS_INPUT = Target.the("").located(By.id("currentAddress"));
    public static final Target STATE_INPUT = Target.the("").located(By.id("react-select-3-input"));
    public static final Target CITY_INPUT = Target.the("").located(By.id("react-select-4-input"));
    public static final Target SUBMIT_BUTTON = Target.the("").located(By.id("submit"));
    public static final Target SUBMIT_MESSAGE = Target.the("").located(By.id("example-modal-sizes-title-lg"));
}
