package com.evozon.test;

import com.evozon.helper.Constants;
import com.evozon.page.HeaderPage;
import com.evozon.page.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {

    LoginPage loginPage;
    HeaderPage headerPage;

@Test
    public void loginTest(){
    WebElement emailInput = null;
    loginPage = new LoginPage(driver);
    headerPage = new HeaderPage(driver);

    loginPage.getLoginPage();
    loginPage.login(Constants.USER_NAME , Constants.USER_PASS);
    Assert.assertEquals(Constants.BASE_URL + "/login", driver.getCurrentUrl());
    headerPage.clickUserMenuButton();
}


}
