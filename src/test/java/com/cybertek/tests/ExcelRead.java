package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {
    @Test
    public void readingFromExcel() throws IOException {

        XSSFWorkbook workbook= new XSSFWorkbook("employee.xlsx");

        XSSFSheet worksheet= workbook.getSheet("Sheet1");
        System.out.println(worksheet.getRow(1).getCell(0));

        System.out.println(worksheet.getRow(2).getCell(1));

    }
}
