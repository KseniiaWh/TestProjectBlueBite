package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class RafflePage extends CommonMethods {

    @FindBy(id = "input-3")
    public WebElement name;

    @FindBy(id = "input-4")
    public WebElement email;

    @FindBy(id = "input-8")
    public WebElement age;

    @FindBy(id = "input-9")
    public WebElement reason;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[text()='Enter chance to win!']")
    public WebElement EnterChanceToWinText;

    @FindBy(xpath = "//div[contains(text(), 'You have registed')]")
    public WebElement confirmationAndnumberOfEntries;

    @FindBy(xpath = "//div[contains(text(),'Must be 18')]")
    public WebElement mustBe18Text;


    public RafflePage() {
        PageFactory.initElements(driver, this);

    }


}
