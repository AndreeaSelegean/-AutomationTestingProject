package com.evozon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[class*='header-toggler']")
    WebElement userMenuButton;


    public void clickUserMenuButton(){
        userMenuButton.click();
    }

}
