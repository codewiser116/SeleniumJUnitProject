package pages.gadgetarium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MainPage {


    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (css = "input[placeholder='Search by shop catalog']")
    public WebElement searchField;


    @FindBy(xpath = "//button[contains(text(), 'Catalog')]")
    public WebElement catalogButton;


}
