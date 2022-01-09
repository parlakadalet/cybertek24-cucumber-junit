package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyAllCategoriesPage;
import com.cybertek.pages.EtsyHomePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EtsySearchStepsDefs {

    WebDriver driver;

    @Given("User is on etsy homepage")
    public void user_is_on_etsy_homepage() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("etsy.url"));

    }


    @Then("Page title should be as expected")
    public void page_title_should_be_as_expected() {
        BrowserUtils.sleep(3);
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone" , driver.getTitle());
    }

    @When("User searches for wooden spoon")
    public void user_searches_for_wooden_spoon() {
       // EtsyHomePage etsyPage = new EtsyHomePage();
      //  etsyPage.searchFor("wooden spoon");
        EtsyHomePage etsyPage = new EtsyHomePage();
        etsyPage.searchFor("wooden spoon");

    }
    @Then("Page title should start with wooden spoon")
    public void page_title_should_start_with_wooden_spoon() {
        // BrowserUtils.sleep(3); //explicit wait is better
      //  Assert.assertTrue("title did not match", driver.getTitle().startsWith("Wooden spoon"));

    }
    @When("User searches for empty value")
    public void userSearchesForEmptyValue() {
        EtsyHomePage etsyPage = new EtsyHomePage();
        etsyPage.searchFor("");
    }

    @Then("All categories should be displayed")
    public void allCategoriesShouldBeDisplayed() {
        //wait for title to change to "All categories | Etsy"
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleIs("All categories | Etsy"));

        Assert.assertEquals("All categories | Etsy", driver.getTitle());

        EtsyAllCategoriesPage allCategoriesPage = new EtsyAllCategoriesPage();
    }
}