package com.demoqa.test.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String filePath, sheetName,fileUploadPath,validationSheet;

    public DataInjection(){
        this.filePath = "resources/Data.xlsx";
        this.sheetName = "DataRegister";
        this.fileUploadPath="resources/file_QA.jpg";
        this.validationSheet = "Validation";
    }

    public Faker getFaker() {
        return faker;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getFileUpload() {
        return fileUploadPath;
    }

    public String getValidationSheet() {
        return validationSheet;
    }
}
