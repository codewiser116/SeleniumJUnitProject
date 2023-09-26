package pages.studymate;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeachersPage {

    public TeachersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String url = "https://codewiser.studymate.us/admin/teachers?size=6&page=1";

    @FindBy(xpath = "//button[text()='Add teacher']")
    public WebElement addTeacherButton;

    @FindBy(css = "input[name=name]")
    public WebElement firstName;

    @FindBy(css = "input[name=lastName]")
    public WebElement lastName;

    @FindBy(css = "input[name=phoneNumber]")
    public WebElement phoneNumber;

    @FindBy(css = "input[name=email]")
    public WebElement email;

    @FindBy(css = "input[name=specialization]")
    public WebElement specialization;

    @FindBy(css = "div[role=button]")
    public WebElement coursesDropDown;

    @FindBy(css = "button[type=submit]")
    public WebElement addButton;

    public void addTeacher(){

        addTeacherButton.click();

        Faker faker = new Faker();

        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        phoneNumber.sendKeys(faker.phoneNumber().phoneNumber().replace("-",""));
        email.sendKeys(faker.internet().emailAddress());
        specialization.sendKeys(faker.job().field());

        addButton.click();
    }






}
