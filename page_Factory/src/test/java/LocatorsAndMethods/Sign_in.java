package LocatorsAndMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in {
 public WebDriver driver;
    @FindBy(id="email")
    private   WebElement email;

    @FindBy(id="pass")
    private  WebElement password;


    public Sign_in(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void enterEmail(){
        email.sendKeys("hi");
    }

    public void enterPassword(){
        password.sendKeys("hello");
    }
}





//locator
//xpath(relative,absolute)
//id
//name
//class
//tagname
//linkText
//partialLinkText


//pageFactory -> Lazy Initaialization
//it use two annotation
//@findBy
//init

