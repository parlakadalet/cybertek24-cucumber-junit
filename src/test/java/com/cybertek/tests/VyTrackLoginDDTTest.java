package com.cybertek.tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VyTrackLoginDDTTest {
    @Before
    public void setUp() {
        //set up browser etc if needed
        //open the url
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown() {
        //close browser here
    }

    @Test
    public void loginDDTTest() {

        String userName="user1";
        String password="UserUser123";
        String firstName="John";
        String lastName="Doe";

        //open excel file
        //add page object
        //loop and read credentials
        //write the result in excel file
    }

}