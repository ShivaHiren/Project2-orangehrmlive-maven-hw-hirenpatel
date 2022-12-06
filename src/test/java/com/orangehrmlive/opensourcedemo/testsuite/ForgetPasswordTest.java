package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.pages.ForgetPasswordPage;
import com.orangehrmlive.opensourcedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordTest extends BaseTest {
    ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgetPasswordPage.clickOnForgetPasswordLink();
        Assert.assertEquals("Reset Password","Reset Password");

    }

}
