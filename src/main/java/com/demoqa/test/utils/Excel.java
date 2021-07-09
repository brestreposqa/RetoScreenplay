package com.demoqa.test.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {

    public static String getCellValue(String filePath, String sheetName, int rowNumber, int cellNumber) {
        File excelFile = new File(filePath);
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell= row.getCell(cellNumber);

        return cell.getStringCellValue();
    }

    public static double getCellValueInt(String filePath, String sheetName, int rowNumber, int cellNumber) {
        File excelFile = new File(filePath);
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = workbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell= row.getCell(cellNumber);

        return cell.getNumericCellValue();
    }
}
