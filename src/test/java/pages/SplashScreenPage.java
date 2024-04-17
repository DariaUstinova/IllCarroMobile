package pages;

import org.openqa.selenium.By;

public class SplashScreen extends BasePage{

    By textVersion = By.xpath("");

    public String getTextVersion(){
        return getTextBase(textVersion);
    }
}
