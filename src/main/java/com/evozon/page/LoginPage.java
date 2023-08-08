package com.evozon.page;

import com.evozon.helper.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage  {
    private final String PATH = "/login";

    public LoginPage(WebDriver driver){
        super(driver);

        this.emailInput = emailInput;
    }

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passInput;

    @FindBy(css = "button[class*='btn-primary']")
    private WebElement loginButton;

    public void getLoginPage(){getDriver().get(Constants.BASE_URL + PATH);
    }
    public void login(String userEmail, String userPass){
        emailInput.sendKeys(userEmail);
        passInput.sendKeys(userPass);
        loginButton.click();
    }


}
