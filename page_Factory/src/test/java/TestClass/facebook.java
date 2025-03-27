package TestClass;

import Common_Methods.BaseClass;


import LocatorsAndMethods.*;
import driver.WebDriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facebook extends BaseClass {
    Sign_in sign;
    CreateAccount ca;
    public facebook(WebDriver driver) {
        super(driver);
        sign = new Sign_in(driver);
    }



    public void createAccount(){
     launchurl("https://www.facebook.com/");
        sign.enterEmail();
        sign.enterPassword();


}

    public static void main(String[] args) {
    driver = WebDriverClass.initatateDriver();
        facebook fb = new facebook(driver);
        fb.createAccount();
    }
}
