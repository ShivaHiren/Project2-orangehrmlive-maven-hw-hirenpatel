package com.orangehrmlive.opensourcedemo.pages;


import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userName = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    By welcomeText = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterUserName(String name) {
        sendTextToElement(userName , name);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }


}
