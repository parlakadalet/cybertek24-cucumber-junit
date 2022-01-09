package com.cybertek.utilities;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtils {

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);


        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }


    }

    public static void scrollDown(int pixel){

        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,"+ pixel+")");


    }
}


