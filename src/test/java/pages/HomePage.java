package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='TVO Today Home']")
    public WebElement tvoTodayPage;

    @FindBy(xpath = "//div[contains(text(),'Docs & Series')]")
    public WebElement docsndSeriesTab;

    @FindBy(xpath = "//span[normalize-space()='Remind me later']")
    public WebElement remindLaterButton;

    @FindBy(xpath = "(//span[@class='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock'])[7]")
    public WebElement searchButton;

    @FindBy(id = "search-field")
    public WebElement searchField;

    @FindBy(xpath = "//a[@href='https://www.tvo.org/series-docs']")
    public WebElement searchItemResulDocsSeries;


    public String homePageTitle = "TVO Today | Current Affairs Journalism, Documentaries and Podcasts";


}
