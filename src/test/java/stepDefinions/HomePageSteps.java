package stepDefinions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DocsSeriesPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class HomePageSteps {
    HomePage homePage;


    @Given("user lands on the home page")
    public void user_lands_on_the_home_page() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("QAUrl"));
        homePage= new HomePage();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = homePage.homePageTitle;
        Assert.assertEquals("Home Page title validation failed", actualTitle,expectedTitle);
    }

    @Then("user should see the TVO today page displayed")
    public void user_should_see_the_tvo_today_page_displayed() {
        homePage= new HomePage();
        Assert.assertTrue("TVO Today page validation failed", homePage.tvoTodayPage.isDisplayed());

    }

    @Then("they should see the {string} dropdown title displayed")
    public void they_should_see_the_dropdown_title_displayed(String string) {
        homePage= new HomePage();
        ReusableMethods.isElementPresent(homePage.docsndSeriesTab);
        Assert.assertEquals("Home Page title verification failed",homePage.docsndSeriesTab.getText(),string);

    }


}
