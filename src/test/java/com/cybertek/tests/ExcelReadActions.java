package com.cybertek.tests;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadActions {

    String filePath = "employee.xlsx";

    @Test
    public void readExcelSheetData() throws IOException {
        //open the Employees.xlsx using Apache POI
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        //Goto "data" sheet. or goto first sheet by index
        XSSFSheet dataSheet = workbook.getSheetAt(0);

        //print column names. row is 0. cells 0, 1 , 2
        System.out.println("COLUMN NAMES:");
        System.out.println(dataSheet.getRow(0).getCell(0));
        System.out.println(dataSheet.getRow(0).getCell(1));
        System.out.println(dataSheet.getRow(0).getCell(2));

        System.out.println("------------------------");
        //loop and print all 3 column names
        for (int i = 0; i <= 2; i++) {
            System.out.println(dataSheet.getRow(0).getCell(i));
        }

        //find out number of rows in the worksheet
        int rowsCount = dataSheet.getPhysicalNumberOfRows();//start counting from1
        System.out.println("rowsCount = " + rowsCount);
        int usedRowsCount = dataSheet.getLastRowNum();
        System.out.println("usedRowsCount = " + usedRowsCount);
        System.out.println("ALL FIRST NAMES:");
        for (int i = 1; i <= usedRowsCount; i++) {
            System.out.println(dataSheet.getRow(i).getCell(0));



        }
        System.out.println("\nFAHIMA INFO:");
        for (int i = 1; i <= usedRowsCount; i++) {
            if(dataSheet.getRow(i).getCell(0).toString().equals("Fahima")){
                System.out.println(dataSheet.getRow(i).getCell(0)+"|"+ dataSheet.getRow(i).getCell(1)+"|"+ dataSheet.getRow(i).getCell(2));
                break;
            }
        }

    }
}