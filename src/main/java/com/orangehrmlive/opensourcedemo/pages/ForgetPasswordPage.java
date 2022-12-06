package com.orangehrmlive.opensourcedemo.pages;

import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.By;

public class ForgetPasswordPage extends Utility {

    By forgetPasswordLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    By messageResetPassword = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

    public void clickOnForgetPasswordLink() {
        clickOnElement(forgetPasswordLink);
    }

    public String getmessageResetPassword() {
        return getTextFromElement(messageResetPassword);
    }

}
