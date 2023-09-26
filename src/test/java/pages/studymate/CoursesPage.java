package pages.studymate;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.SeleniumUtilities;


public class CoursesPage {
    public CoursesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String url = "https://codewiser.studymate.us/admin/courses?size=8&page=1";

    @FindBy(xpath = "//button[text()='Create course']")
    public WebElement createCourseButton;

    @FindBy(css = "input[name=courseName]")
    public WebElement courseName;

    @FindBy(css = "textarea[name=description]")
    public WebElement description;

    @FindBy(css = "input[placeholder='MM/DD/YYYY']")
    public WebElement date;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement createButton;

    public void createCourse(){
        createCourseButton.click();

        Faker faker = new Faker();
        courseName.sendKeys(faker.educator().course());
        description.sendKeys(faker.superhero().descriptor());
        date.sendKeys(SeleniumUtilities.getCurrentDate("dd/MM/yyyy"));
        createButton.click();
    }










}
