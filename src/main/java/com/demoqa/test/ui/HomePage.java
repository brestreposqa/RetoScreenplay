package com.demoqa.test.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static String URL = "https://www.demoqa.com/";
    public static final Target FORMS_OPTION= Target.the("Forms options button").locatedBy("//h5[contains(text(),'Forms')]");
}
