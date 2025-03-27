package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClass {
    private static WebDriver driver;

    private WebDriverClass(){

    }

    public static WebDriver initatateDriver() {
        System.setProperty("Webdriver.chrome.driver", "E://karthika//Page_Factory//page_Factory//chromedriver.exe");
        if(driver == null){
            driver = new ChromeDriver();
            System.out.println("chrome driver created");
        }
        return driver;
    }
}
