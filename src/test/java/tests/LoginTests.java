package tests;

import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void positiveLoginTest() throws InterruptedException {
        searchPage.clickMenu();
        searchPage.openLoginPage();
        loginPage.possitiveLogin(user);
        Thread.sleep(3000);
        Assert.assertTrue(searchPage.validateMyCarsExist());
    }
}
