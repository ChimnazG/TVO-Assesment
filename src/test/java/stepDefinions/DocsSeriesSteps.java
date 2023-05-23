package stepDefinions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DocsSeriesPage;
import pages.HomePage;
import utils.Driver;
import utils.ReusableMethods;

import java.util.List;


public class DocsSeriesSteps {

    DocsSeriesPage docsSeriesPage;
    HomePage homePage;



    @When("user clicks on the Docs & Series dropdown option")
    public void user_clicks_on_the_dropdown_option() {
        homePage= new HomePage();
        ReusableMethods.clickElement( homePage.docsndSeriesTab);
        ReusableMethods.clickElement(homePage.remindLaterButton);
    }

    @Then("user should see the {string} label button available")
    public void user_should_see_the_label_button_available(String string) {
        docsSeriesPage= new DocsSeriesPage();
        Assert.assertEquals("All button validation failed", docsSeriesPage.allButton.getText(),string);
        Assert.assertTrue("All button is not displayed", docsSeriesPage.allButton.isDisplayed());
    }

    @Then("user should see the {string} label button selected")
    public void user_should_see_the_label_button_selected(String string) {
        docsSeriesPage= new DocsSeriesPage();
        String allButtonColorText= docsSeriesPage.selectedButtonColor.getText();
        if (!allButtonColorText.equals(string)){
            ReusableMethods.clickElement(docsSeriesPage.allButton);
        }
        Assert.assertEquals("All button is not selected", docsSeriesPage.selectedButtonColor.getText(),"All");
        Assert.assertEquals("All button's color is not red", docsSeriesPage.selectedButtonColor.getCssValue("background-color"), "rgba(231, 19, 26, 1)");

    }

    @Then("user should be able to see below tabs")
    public void user_should_be_able_to_see_below_tabs(List<String> listOfExpectedTabNames) throws InterruptedException {
        docsSeriesPage = new DocsSeriesPage();
        Thread.sleep(3000);
        List<WebElement> listOfWebElement = docsSeriesPage.listOfHighLevelTabNames;
        boolean isNumberOfTabsMatching = listOfExpectedTabNames.size() == listOfWebElement.size();
        Assert.assertTrue("Number of TabName expectation not matching with UI", isNumberOfTabsMatching );

        int index = 0;
        for(String expectedTabName :  listOfExpectedTabNames){
            String actualTabName = listOfWebElement.get(index).getText();
                if(!expectedTabName.equals(actualTabName)) {
                  //  Driver.getDriver().findElement(By.xpath("//div[contains(@class, 'series-docs-nav__next-button')]")).click();
                    docsSeriesPage.nextButtonForTabs.click();
                    Thread.sleep(3000);
                    actualTabName = listOfWebElement.get(index).getText();
                }
            index ++;
            Assert.assertEquals("Tabname validation failed", expectedTabName, actualTabName);
        }
    }


    @Then("user should be able to see documentaries are sorted accordingly")
    public void user_should_be_able_to_see_documentaries_are_sorted_accordingly(List<String> listOfExpectedNames) throws InterruptedException {
        Thread.sleep(6000);
        docsSeriesPage = new DocsSeriesPage();
        List<WebElement> listOfWebElement = docsSeriesPage.listOFCategories;
        boolean isNumberOfCategoryMatching = listOfExpectedNames.size() == listOfWebElement.size();
        Assert.assertTrue("Number of Category section expectation not matching with UI", isNumberOfCategoryMatching );

        int index = 0;
        for(String expectedName :  listOfExpectedNames){
            String actualTabName = listOfWebElement.get(index).getText();
            index ++;
            Assert.assertEquals("Documentaries sort validation failed", expectedName, actualTabName);
        }

    }

    @Then("Check that the search button is available")
    public void check_that_the_search_button_is_available() {
        homePage= new HomePage();
        ReusableMethods.isElementPresent(homePage.searchButton);
    }

    @When("Click on the search option")
    public void click_on_the_search_option() {
        ReusableMethods.clickElement(homePage.searchButton);
    }

    @When("Check that the search field is displayed")
    public void check_that_the_search_field_is_displayed() {
        homePage= new HomePage();
        ReusableMethods.isElementPresent(homePage.searchField);
    }

    @When("Click on the search field and insert {string} valid text")
    public void click_on_the_search_field_and_insert_valid_text(String string) {
        homePage= new HomePage();
        homePage.searchField.sendKeys(string);
        homePage.searchField.sendKeys(Keys.ENTER);
    }

    @Then("Check that the Docs & Series is displayed")
    public void check_that_the_docs_series_is_displayed() {
        homePage= new HomePage();
        ReusableMethods.isElementPresent(homePage.searchItemResulDocsSeries);//   Assert.assertTrue(homePage.searchItemResulDocsSeries.isDisplayed());
    }

    @When("user hover on Docs & Series option")
    public void user_hover_on_docs_series_option() {
        homePage= new HomePage();
        ReusableMethods.hoverToElement(homePage.docsndSeriesTab);
    }

    @Then("Docs & Series option is expanded")
    public void docs_series_option_is_expanded() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.docsAndSeriesExpanded);
    }

    @Then("user checks that the next arrow is available")
    public void user_checks_that_the_next_arrow_is_available() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.nextButtonForTabs);
    }

    @When("user clicks on the next arrow")
    public void user_clicks_on_the_next_arrow() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.clickElement(docsSeriesPage.nextButtonForTabs);
        ReusableMethods.clickElement(docsSeriesPage.nextButtonForTabs);
    }

    @Then("user checks that the Previous arrow is available")
    public void user_checks_that_the_previous_arrow_is_available() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.prevButtonForTabs);
    }

    @When("user clicks on the Previous arrow")
    public void user_clicks_on_the_previous_arrow() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.clickElement(docsSeriesPage.prevButtonForTabs);
    }

    @Then("Check that the cross button is available top of the right corner")
    public void check_that_the_cross_button_is_available_top_of_the_right_corner() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.crossBtn);
    }


    @When("Click on the cross button")
    public void click_on_the_cross_button() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.clickElement(docsSeriesPage.crossBtn);
    }

    @Then("Check that the expanded page is closed")
    public void check_that_the_expanded_page_is_closed() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.allButton);
    }


    @When("user checks that the A-Z button is available")
    public void user_checks_that_the_a_z_button_is_available() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.azBtn);
    }

    @Then("user clicks on the A-Z button")
    public void user_clicks_on_the_a_z_button() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.clickElement(docsSeriesPage.azBtn);
    }

    @Then("user checks that the A-Z button is selected")
    public void user_checks_that_the_a_z_button_is_selected() throws InterruptedException {
        docsSeriesPage = new DocsSeriesPage();
        Thread.sleep(3000);
        Assert.assertEquals("A-Z button is not selected", docsSeriesPage.selectedButtonColor.getCssValue("background-color"),"rgba(231, 19, 26, 1)");
    }


    @Then("user checks that the History option is available")
    public void user_checks_that_the_history_option_is_available() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.historyBtn);
    }

    @Then("user clicks on the History button")
    public void user_clicks_on_the_history_button() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.clickElement(docsSeriesPage.historyBtn);
    }

    @Then("Scroll down and check that Load more option is available")
    public void scroll_down_and_check_that_load_more_option_is_available() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.jsScroll(docsSeriesPage.loadMoreBtn);
    }

    @Then("Check that the last history item")
    public void check_that_the_last_history_item() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.beforeLoadStart);
        ReusableMethods.isElementPresent(docsSeriesPage.beforeLoadMoreEnd);
    }

    @When("Click on the Load More option")
    public void click_on_the_load_more_option() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.clickElement(docsSeriesPage.loadMoreBtn);
    }
    @Then("Again check that last history item")
    public void again_check_that_last_history_item() {
        docsSeriesPage = new DocsSeriesPage();
        ReusableMethods.isElementPresent(docsSeriesPage.afterLoadMoreStart);
        ReusableMethods.isElementPresent(docsSeriesPage.afterLoadMoreEnd);
    }






}




