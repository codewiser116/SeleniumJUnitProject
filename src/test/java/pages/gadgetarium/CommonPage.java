package pages.gadgetarium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {

    public CommonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "About Store")
    public WebElement aboutStoreTab;

    @FindBy(linkText = "Delivery")
    public WebElement deliveryTab;









}
