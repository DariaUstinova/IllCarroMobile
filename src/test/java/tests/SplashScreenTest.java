package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SplashScreenTest extends BaseTest{

    @Test
    public void versionTextTest (){
        String version = splashScreenPage.getTextVersion();
        Assert.assertEquals(version, "Version 1.0.0");
    }


//    By.xpath("//*[@resource-id='com.sheygam.contactapp:id/action_bar']"+"/android.widget.TextView");//second by class
   // By.xpath("//*[@resource-id='com.sheygam.contactapp:id/action_bar']/..");//one level up
//By.xpath("//*[@resource-id='com.sheygam.contactapp:id/action_bar']/../..");//two levels up

}
