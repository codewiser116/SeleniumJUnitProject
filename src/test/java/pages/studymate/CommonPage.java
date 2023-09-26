package pages.studymate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {
    public CommonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String url = "https://codewiser.studymate.us/admin/analytics";

    @FindBy(xpath = "//li[text()='Teachers']")
    public WebElement teachers;

    @FindBy(xpath = "//li[text()='Courses']")
    public WebElement courses;

    @FindBy(xpath = "//li[text()='Analytics']")
    public WebElement analytics;

    @FindBy(xpath = "//li[text()='Groups']")
    public WebElement groups;

    @FindBy(xpath = "//li[text()='Trash']")
    public WebElement trash;

    @FindBy(xpath = "//li[text()='Schedule']")
    public WebElement schedule;

    @FindBy(xpath = "//li[text()='Announcements']")
    public WebElement announcements;
}
