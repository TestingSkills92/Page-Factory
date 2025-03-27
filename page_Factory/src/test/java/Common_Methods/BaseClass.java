package Common_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
    public static WebDriver driver;

    public BaseClass(WebDriver driver){
        BaseClass.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public static void launchurl(String url){
        driver.get(url);
    }
}
