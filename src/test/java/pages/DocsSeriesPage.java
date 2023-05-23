package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class DocsSeriesPage {

    public DocsSeriesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='TVO Today Home']")
    public WebElement tvoTodayPage;

    @FindBy(xpath = "//span[normalize-space()='All']")
    public WebElement allButton;

    @FindBy(xpath = "//button[@aria-current='page']")
    public WebElement selectedButtonColor;


    @FindBy(xpath = "//*[@role='menubar']/ul/li")
    public List<WebElement> listOfHighLevelTabNames;


    @FindBy(xpath = "//div[contains(@class, 'series-docs-nav__next-button')]")
    public WebElement nextButtonForTabs;


    @FindBy(xpath = "//div[contains(@class, 'series-docs-nav__prev-button')]")
    public WebElement prevButtonForTabs;

    @FindBy(xpath = "//p[normalize-space()='All Docs & Series']")
    public WebElement docsAndSeriesExpanded;

    @FindBy(xpath = "//button[@aria-label='Close submenu']//*[name()='svg']")
    public WebElement crossBtn;

    @FindBy(xpath = "//span[normalize-space()='A-Z']")
    public WebElement azBtn;

    @FindBy(xpath = "//p[normalize-space()='History']")
    public WebElement historyBtn;

    @FindBy(xpath = "//span[normalize-space()='Load More']")
    public WebElement loadMoreBtn;

    @FindBy(xpath = "//p[normalize-space()='Princess Anne at 70']")
    public WebElement beforeLoadStart;

    @FindBy(xpath = "//p[normalize-space()='The Nile: 5000 Years of History']")
    public WebElement beforeLoadMoreEnd;

    @FindBy(xpath = "//p[normalize-space()='Genius of the Modern World']")
    public WebElement afterLoadMoreStart;

    @FindBy(xpath = "//p[normalize-space()='Lost Kingdoms of Africa']")
    public WebElement afterLoadMoreEnd;




    @FindBy(xpath = "//h2[normalize-space()]")
    public List<WebElement> listOFCategories;



   // public String listOFCategoriesPath = "//h2[normalize-space()]";


    public String DocsSeriesPageTitle="Docs & Series | TVO Today";

}
