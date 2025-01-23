package DemoQA.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(xpath = "//button[contains(@id, 'submit')]")
    public WebElement sumbit;

    public TextBoxPage fillUserName(String userName) {
        this.userName.sendKeys(userName);
        return this;
    }

    public TextBoxPage fillUserEmail(String userEmail) {
        this.userEmail.sendKeys(userEmail);
        return this;
    }

    public TextBoxPage clickSumbit() {
        this.sumbit.click();
        return this;
    }




}
