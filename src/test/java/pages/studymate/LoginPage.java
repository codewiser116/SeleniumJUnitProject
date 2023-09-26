package pages.studymate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String url = "https://codewiser.studymate.us/login";

    @FindBy (name = "email")
    public WebElement emailField;

    @FindBy (name = "password")
    public WebElement passwordField;

    @FindBy (xpath = "//button[text()='Log in']")
    public WebElement loginButton;

    public void login(){
        emailField.sendKeys("admin@codewise.com");
        passwordField.sendKeys("codewise123");
        loginButton.click();
    }





}
